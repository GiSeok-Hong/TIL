from django.shortcuts import render, redirect
from .models import Board

def index(request):
    # boards = Board.objects.order_by('-id')  # 최신글이 가장 위로 올라오도록 정렬    -orm 이 정렬을 해줌
    boards = Board.objects.all()[::-1]    # python이 정렬을 해줌
    context = {'boards': boards}
    return render(request, 'boards/index.html', context) # templates 안의 boards 폴더에 있는 index.html을 랜더하겠다.

def new(request):
    return render(request, 'boards/create.html')

def create(request):
    title = request.POST.get('title')           # create.html 에서 가져온 title
    content = request.POST.get('content')

    # board = Board()   # Board 라는 클래스에서 board라는 인스턴스 생성
    board = Board(title=title, content=content)    #
    board.save()
    # return render(request, 'boards/create.html')
    return redirect(f'/boards/{board.pk}/')

def detail(request, pk):
    board = Board.objects.get(pk=pk)
    context = {'board': board}
    return render(request, 'boards/detail.html', context)

def delete(request, pk):
    board = Board.objects.get(pk=pk)
    board.delete()
    return redirect('/boards/')

def edit(request, pk):
    board = Board.objects.get(pk=pk)
    context = {'board': board}
    return render(request, 'boards/edit.html', context)

def update(request, pk):
    board = Board.objects.get(pk=pk)
    board.title = request.POST.get('title')
    board.content = request.POST.get('content')
    board.save()
    return redirect(f'/boards/{board.pk}/')