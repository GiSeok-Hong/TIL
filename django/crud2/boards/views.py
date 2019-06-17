from django.shortcuts import render, redirect
from .models import Board, Comment

def index(request):
    # boards = Board.objects.order_by('-id')
    boards = Board.objects.all()[::-1]
    context = {'boards': boards}
    return render(request, 'boards/index.html', context)

def new(request):
    if request.method == 'POST':                    # 요청의 method가 post 이면 글을 써줘
        title = request.POST.get('title')           # 요청이 get이면 html 파일을 줘
        content = request.POST.get('content')
        board = Board(title=title, content=content)
        board.save()
        print(request.method)
        return redirect('boards:detail', board.pk)
    else:
        return render(request, 'boards/create.html')

def detail(request, board_pk):
    board = Board.objects.get(pk=board_pk)
    comments = board.comment_set.all()   # comments = Comment.objects.filter(board=board)  --> 이건 문제가 생김
    context = {'board': board, 'comments': comments}
    return render(request, 'boards/detail.html', context)

def delete(request, board_pk):                # html의 a 태그는 get 방식만 있다.
    board = Board.objects.get(pk=board_pk)
    if request.method == 'POST':
        board.delete()
        return redirect('boards:index')
    else:
        return redirect('boards:detail', board.pk)

def edit(request, board_pk):
    board = Board.objects.get(pk=board_pk)
    if request.method == 'GET':
        print(request.method)
        context = {'board': board}
        return render(request, 'boards/edit.html', context)
    else:
        print(request.method)
        board.title = request.POST.get('title')
        board.content = request.POST.get('content')
        board.save()
        return redirect('boards:detail', board.pk)

def comments_create(request, board_pk):
    board = Board.objects.get(pk=board_pk)
    if request.method == 'POST':
        comment = Comment()
        comment.board_id = board.pk
        comment.content = request.POST.get('content')
        comment.save()
        return redirect('boards:detail', board.pk)
    else:
        return redirect('boards:detail', board.pk)

def comments_edit(request, board_pk, comment_pk):
    comment = Comment.objects.get(pk=comment_pk)
    if request.method == 'POST':
        comment.content = request.POST.get('content')
        comment.save()
        return redirect('boards:detail', board_pk)
    else:
        context = {'comment': comment}
        return render(request, 'boards/comments_edit.html', context)

def comments_delete(request, board_pk, comment_pk):
    comment = Comment.objects.get(pk=comment_pk)
    if request.method == 'POST':
        comment.delete()
        return redirect('boards:detail', board_pk)
    else:
        return redirect('boards:detail', board_pk)