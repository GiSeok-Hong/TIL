# [실습] 요청 & 응답 - 랜덤게임(신이 나를 만들 때)
# 1. 데이터와 함께 요청을 보내고
# 2. 데이터를 받아서
# 3. 결과를 보여주는 페이지

from flask import Flask, render_template, request
app = Flask(__name__)

@app.route('/h_send')
def h_send():
    return render_template('h_send.html')

@app.route('/h_receive')
def h_receive():
    import random
    numbers = range(1, 46)
    lotto = random.sample(numbers, 6)
    name = request.args.get('name')
    message = request.args.get('message')
    return render_template('h_receive.html', name=name, message=message, lotto=lotto)

if __name__ == '__main__' :
    app.run(debug=True)

