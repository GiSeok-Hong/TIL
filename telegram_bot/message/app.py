from flask import Flask, render_template, request
import requests
app = Flask(__name__)


@app.route('/write')
def write():
    return render_template('write.html')

@app.route('/send')
def send():
    token = '852628861:AAGy134SHhZRYFSHYQd8OfjPrXC9z9uSdDs'
    api_url = f'https://api.telegram.org/bot{token}'
    chat_id = '656485856'  # 본인 telegram 계정 id
    # text = input('메시지를 입력하세요: ')   # '안녕하세요 좋은 하루 되시길!'
    # text = random.sample(range(1, 46), 6)
    text = request.args.get('message')

    response = requests.get(f'{api_url}/sendMessage?chat_id={chat_id}&text={text}')
    return '전송 완료!'


if __name__ == '__main__':
    app.run(debug=True)


















