from django.shortcuts import render, redirect, get_object_or_404
from .models import Board
from .forms import BoardForm
from IPython import embed  # Debuging 할 때 사용한다

def index(request):
    boards = Board.objects.all()[::-1]
    context = {'boards': boards}
    return render(request, 'boards/index.html', context)

def create(request):
    if request.method == 'POST':
        form = BoardForm(request.POST)
        # embed() # embed 를 쓰고 실행하면 여기에서 동작이 멈춘다.
        if form.is_valid():    # 유효성 검사?
            board = form.save()

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
    context = {'board': board}
    return render(request, 'boards/detail.html', context)

def delete(request, board_pk):
    board = get_object_or_404(Board, pk=board_pk)
    if request.method == 'POST':
        board.delete()
        return redirect('boards:index')
    return redirect('boards:detail', board.pk)

def update(request, board_pk):
    board = get_object_or_404(Board, pk=board_pk)
    if request.method == 'POST':
        form = BoardForm(request.POST, instance=board)   # model form 을 사용하기 위해 instance 추가
        if form.is_valid():
            form.save()
            # 아래 코드는 form 형식
            # board.title = form.cleaned_data.get('title')
            # board.content = form.cleaned_data.get('content')
            # board.save()
            return redirect('boards:detail', board.pk)
    else:
        # form = BoardForm(initial=board.__dict__)    # 사용자가 작성했던 내용을 가져온다.
        form = BoardForm(instance=board)
    context = {'form': form, 'board': board}
    return render(request, 'boards/form.html', context)