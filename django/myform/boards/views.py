from django.shortcuts import render, redirect, get_object_or_404
from .models import Board, Comment
from .forms import BoardForm, CommentForm
from IPython import embed  # Debuging 할 때 사용한다
from django.contrib.auth.decorators import login_required
from django.contrib.auth import get_user_model
from django.views.decorators.http import require_POST

def index(request):
    boards = Board.objects.all()[::-1]
    context = {'boards': boards}
    return render(request, 'boards/index.html', context)

@login_required() # 190619 추가
def create(request):
    if request.method == 'POST':
        form = BoardForm(request.POST)
        # embed() # embed 를 쓰고 실행하면 여기에서 동작이 멈춘다.
        if form.is_valid():    # 유효성 검사?
            board = form.save(commit=False)
            board.user = request.user
            board.save()
            # 아래는 form 형식
            # title = form.cleaned_data.get('title')   # dic 형식의
            # content = form.cleaned_data.get('content')
            # board = Board.objects.create(title=title, content=content)
            return redirect('boards:detail', board.pk)
    else:
        form = BoardForm()
    context = {'form': form}
    return render(request, 'boards/form.html', context)

def detail(request, board_pk):
    # board = Board.objects.get(pk=board_pk)
    board = get_object_or_404(Board, pk=board_pk)
    person = get_object_or_404(get_user_model(), pk=board.user.pk)
    comments = board.comment_set.all()
    comment_form = CommentForm()
    context = {
        'board': board,
        'comments': comments,
        'comment_form': comment_form,
        'person': person
    }
    return render(request, 'boards/detail.html', context)



def delete(request, board_pk):
    board = get_object_or_404(Board, pk=board_pk)
    if board.user == request.user:   # 190619 작성한 유저와 삭제요청을 한 유저가 같으면 조건문 실행
        if request.method == 'POST':
            board.delete()
            return redirect('boards:index')
        else:
            return redirect('boards:detail', board.pk)
    else:
        return redirect('boards:index')

@login_required() # 190619 추가
def update(request, board_pk):
    board = get_object_or_404(Board, pk=board_pk)
    if board.user == request.user:     # 190619 작성한 유저와 수정요청을 한 유저가 같으면 조건문 실행
        if request.method == 'POST':
            form = BoardForm(request.POST, instance=board)   # model form 을 사용하기 위해 instance 추가
            if form.is_valid():
                form.save()
                return redirect('boards:detail', board.pk)
        else:
            form = BoardForm(instance=board)     # 여기서 마지막 return 으로 간다.
    else:
        return redirect('boards:index')
    context = {'form': form, 'board': board}
    return render(request, 'boards/form.html', context)

@login_required()
@require_POST  # POST 요청을 제외한 요청이 들어오면 405 에러가 뜬다
def comments_create(request, board_pk):
    comment_form = CommentForm(request.POST)
    if comment_form.is_valid():
        comment = comment_form.save(commit=False)
        comment.user = request.user
        comment.board_id = board_pk
        comment.save()
    return redirect('boards:detail', board_pk)

@login_required()
@require_POST
def comments_delete(request, board_pk, comment_pk):
    comment = get_object_or_404(Comment, pk=comment_pk)
    if request.user != comment.user:
        return redirect('boards:detail', board_pk)
    comment.delete()
    return redirect('boards:detail', board_pk)


@login_required()
def like(request, board_pk):
    board = get_object_or_404(Board, pk=board_pk)
    if request.user in board.like_users.all(): # 이 게시글에 좋아요를 누른 유저 중 요청을 한 유저(request.user)가 있다면
        board.like_users.remove(request.user)  # 목록에서 지워준다. (즉 좋아요를 취소 한다는 의미)
    else:
        board.like_users.add(request.user)
    return redirect('boards:index')


# 팔로우 : 특정 대상을 팔로우하는 경우 그 대상의 소식을 만날 수 있습니다.
# 팔로워 : 나 또는 특정 대상을 팔로우하는 사람을 뜻합니다.
# 팔로잉 : 나 또는 특정 대상이 팔로우하는 사람을 뜻합니다.
@login_required()
def follow(request, board_pk, user_pk):
    person = get_object_or_404(get_user_model(), pk=user_pk)
    if request.user in person.followers.all():
        person.followers.remove(request.user)
    else:
        person.followers.add(request.user)
    return redirect('boards:detail', board_pk)

