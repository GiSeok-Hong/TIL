from django.shortcuts import render
import random
from datetime import datetime
import json
import requests

# Create your views here.
def index(request):
    return render(request, 'pages/index.html')

def hola(request):
    return render(request, 'pages/hola.html')

def dinner(request):
    menu = ['보쌈', '닭갈비', '햄버거', '피자', '돈가스', '짜장면', '짬뽕', '탕수육']
    pick = random.choice(menu)
    context = {'pick': pick}  # 'pick'은 dinner.html 안에 {{ pick }} 과 같다. 통상적으로 context라는 변수를 만들어서 넘김
    return render(request, 'pages/dinner.html', context)

def hello(request, name):    # urls.py에 <str:name>에 적힌 내용이 name이라는 변수에 들어간다.
    context = {'name': name}
    return render(request, 'pages/hello.html', context)

def introduce(request, name, age):
    context = {'name': name, 'age': age}
    return render(request, 'pages/introduce.html', context)

# [실습]
# 1. variable routing을 통해 숫자 2개를 받아 곱셈 결과를 출력
def times(request, one, two):
    result = one * two
    context = {'one': one, 'two': two, 'result':result}
    return render(request, 'pages/times.html', context)

# 2. 반지름(r)을 인자로 받아 원의 넓이를 구하세요.
def area(request, r):
    pi = 3.14
    area = (r ** 2) * pi
    context = {'r': r, 'area': area}
    return render(request, 'pages/area.html', context)   # 3번째 인자는 반드시 dic 형태여야 한다 !!!!

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
    return render(request, 'pages/template_language.html', context)

def isbirth(request):
    today = datetime.now()
    if today.month == 3 and today.day == 27:
        res = True
    else:
        res = False
    context = {'res': res}
    return render(request, 'pages/isbirth.html', context)

def throw(request):
    return render(request, 'pages/throw.html')

def catch(request):
    message = request.GET.get('message')
    message2 = request.GET.get('message2')
    context = {'message': message, 'message2': message2 }
    return render(request, 'pages/catch.html', context)

# [실습]
# lotto / get 함수
# get -> 1 ~ 45 의 수 중에서 6개를 뽑아 리스트로 만들어 넘긴다.
# get -> 사용자로부터 이름을 입력 받아 넘긴다.

def lotto(request):
    return render(request, 'pages/lotto.html')

def get(request):
    name = request.GET.get('name')
    num = random.sample(range(1, 46), 6)    # 리스트 형태로 만들어진다
    context = {'name': name, 'num': num}
    return render(request, 'pages/get.html', context)

def lotto2(request):
    return render(request, 'pages/lotto2.html')  # render 의 필수인자.  request, html

def picklotto(request):
    res = requests.get('https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=861')
    lotto = json.loads(res.text)  # 응답 결과를 dic 형태로 만들어줌
    name = request.GET.get('name')
    winner = []   # 실제 로또 당첨 번호
    for i in range(1, 7):
        winner.append(lotto[f'drwtNo{i}'])
    picked = sorted(random.sample(range(1, 46), 6))   # 랜덤으로 뽑힌 번호
    matched = len(set(winner) & set(picked))  # list 자료형은 & 를 사용할 수 없기 때문에 set() 을 사용한다.

    if matched == 6:
        result = '1등입니다. 퇴사!'
    elif matched == 5:
        result = '3등입니다. 휴가 고고'
    elif matched == 4:
        result = '4등입니다. 그냥 걸쭉하게 한 잔...'
    elif matched == 3:
        result = '5등입니다. 그럼 다시 로또를 사자'
    else:
        result = '꽝'


    context = {'name': name, 'result': result}
    return  render(request, 'pages/picklotto.html', context)

def art(request):
    return render(request, 'pages/art.html')

def result(request):
    # 1. form 태그로 날린 데이터를 받는다.
    word = request.GET.get('pages/word')

    # 2. artii API 를 통해 보낸 응답 결과를 text로 fonts에 저장한다.
    fonts = requests.get('http://artii.herokuapp.com/fonts_list').text

    # 3. fonts(str)를 font 리스트의 형태로 저장한다.
    fonts = fonts.split('\n')

    # 4. fonts(list)안에 들어있는 요소 중 하나를 선택해서 font에 저장한다.
    font = random.choice(fonts)

    # 5. 위에서 사용자에게 받은 word와 랜덤하게 뽑은 font를 가지고 다시 요청을 보낸다.
    result = requests.get(f'http://artii.herokuapp.com/make?text={word}&font={font}').text

    context = {'result': result}
    return render(request, 'pages/result.html', context)

def user_new(request):
    return render(request, 'pages/user_new.html')

def user_create(request):
    name = request.POST.get('name')
    pwd = request.POST.get('pwd')
    context = {'name': name, 'pwd': pwd}
    return render(request, 'pages/user_create.html', context)

def static_example(request):
    return render(request, 'pages/static_example.html')