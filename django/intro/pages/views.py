from django.shortcuts import render
import random
from datetime import datetime

# Create your views here.
def index(request):
    return render(request, 'index.html')

def hola(request):
    return render(request, 'hola.html')

def dinner(request):
    menu = ['보쌈', '닭갈비', '햄버거', '피자', '돈가스', '짜장면', '짬뽕', '탕수육']
    pick = random.choice(menu)
    context = {'pick': pick}  # 'pick'은 dinner.html 안에 {{ pick }} 과 같다. 통상적으로 context라는 변수를 만들어서 넘김
    return render(request, 'dinner.html', context)

def hello(request, name):    # urls.py에 <str:name>에 적힌 내용이 name이라는 변수에 들어간다.
    context = {'name': name}
    return render(request, 'hello.html', context)

def introduce(request, name, age):
    context = {'name': name, 'age': age}
    return render(request, 'introduce.html', context)

# [실습]
# 1. variable routing을 통해 숫자 2개를 받아 곱셈 결과를 출력
def times(request, one, two):
    result = one * two
    context = {'one': one, 'two': two, 'result':result}
    return render(request, 'times.html', context)

# 2. 반지름(r)을 인자로 받아 원의 넓이를 구하세요.
def area(request, r):
    pi = 3.14
    area = (r ** 2) * pi
    context = {'r': r, 'area': area}
    return render(request, 'area.html', context)   # 3번째 인자는 반드시 dic 형태여야 한다 !!!!

def template_language(request):
    menus = ['짜장면', '탕수육', '짬뽕', '양장피', '만두']
    my_sentence = 'Life is short, you need python'
    messages = ['apple', 'banana', 'pineapple', 'orange', 'watermelon']
    empty_list = ['hong', 'gi']
    datetimenow = datetime.now()
    context = {
        'menus': menus,
        'my_sentence': my_sentence,
        'messages':messages,
        'empty_list':empty_list,
        'datetimenow':datetimenow
    }
    return render(request, 'template_language.html', context)

def isbirth(request):
    today = datetime.now()
    if today.month == 3 and today.day == 27:
        res = True
    else:
        res = False
    context = {'res': res}
    return render(request, 'isbirth.html', context)

def throw(request):
    return render(request, 'throw.html')

def catch(request):
    message = request.GET.get('message')
    message2 = request.GET.get('message2')
    context = {'message': message, 'message2': message2 }
    return render(request, 'catch.html', context)

# [실습]
# lotto / get 함수
# get -> 1 ~ 45 의 수 중에서 6개를 뽑아 리스트로 만들어 넘긴다.
# get -> 사용자로부터 이름을 입력 받아 넘긴다.

def lotto(request):
    return render(request, 'lotto.html')

def get(request):
    name = request.GET.get('name')
    num = random.sample(range(1,46), 6)
    context = {'name': name, 'num': num}
    return render(request, 'get.html', context)