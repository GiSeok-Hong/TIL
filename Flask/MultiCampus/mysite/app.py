from flask import Flask, render_template, request
import requests
app = Flask(__name__)

@app.route('/send')
def send():
    return render_template('send.html')

@app.route('/receive')
def receive():
    # {'name': 'giseok', 'message': 'hihihi'}
    user = request.args.get('user')  # => giseok
    message = request.args.get('message')  # => hello
    return render_template('receive.html', user=user, message=message)




# [실습] 로또 당첨 여부 확인
# 1. lotto_check 에서 내가 산 로또 번호 입력
# 2. lotto_result 에서 값 가져와서 변수에 저장
# 3. API를 통해서 가져온 특정 회차 로또 번호와 비교
# 4. 당첨 결과 메세지 html에 작성


@app.route('/lotto_check')
def lotto_check():
    return render_template('lotto_check.html')


@app.route('/lotto_result')
def lotto_result():
    lotto_round = request.args.get('lotto_round')
    url = f'https://dhlottery.co.kr/common.do?method=getLottoNumber&drwNo={lotto_round}'
    response = requests.get(url)
    # response.text  #=> string
    lotto = response.json()  #=> dict 형태로 반환
    # winner = []  # list()
    # for n in range(1,7):
    #     winner.append(lotto[f'drwtNo{n}'])

    # list comprehension
    a = [lotto[f'drwtNo{n}'] for n in range(1,7)] #=> 위의 for문으로 만든 것과 결과 같다.
    b = lotto['bnusNo']

    winner = f'{a} + {b}'


    # 입력 값 가져오기
    lotto_input = request.args.get('lotto_input')
    number = [int(n) for n in lotto_input.split(',')]

    # 같은 숫자 갯수
    # set() => {1,2,3,4,5,}
    # set(a) => ex {1, 2, 3, 4, 5, 6}
    # set(number) => ex {3,8,9,10,11,12}
    set(a) & set(number)  # 교집합을 구함 {3}
    matched = len(set(a) & set(number))  #=> 1

    # 같은 숫자의 갯수에 따른 등수
    if matched == 6:
        result = '1등입니다'
    elif matched == 5:
        if lotto['bnusNo'] in number:
            result = '2등입니다'
        result = '3등입니다'
    elif matched == 4:
        result = '4등입니다'
    elif matched == 3:
        result = '5등입니다'
    else:
        result = '꽝입니다.'

    return render_template('lotto_result.html', lotto=winner, lotto_round=lotto_round, lotto_input=number, result=result)

if __name__ == '__main__' :
    app.run(debug=True)