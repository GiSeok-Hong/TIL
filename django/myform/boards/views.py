from django.shortcuts import render, redirect, get_object_or_404
from .models import Board, Comment
from .forms import BoardForm, CommentForm
from IPython import embed  # Debuging 할 때 사용한다
from django.contrib.auth.decorators import login_required
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
    comments = board.comment_set.all()
    comment_form = CommentForm()
    context = {
        'board': board,
        'comments': comments,
        'comment_form': comment_form,
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
    if board.user == request.user:     # 190619 작성한 유저와 삭제요청을 한 유저가 같으면 조건문 실행
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