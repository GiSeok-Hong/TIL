from django.shortcuts import render

def index(request):
    return render(request, 'utilities/index.html')

def lorem1(request):
    return render(request, 'utilities/lorem1.html')