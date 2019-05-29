from flask import Flask, render_template
app = Flask(__name__)


# http://127.0.0.1:5000/
@app.route("/")
def hello():
    return "Hello World!"


# http://127.0.0.1:5000/mulcam 이 주소를 켜야 나타남
@app.route("/mulcam")
def mulcam():
    return 'This is Multicampus!'

@app.route('/greeting/<string:name>')
def greeting(name):
    return f'반갑습니다, {name}님!'

@app.route('/cube/<int:num>')
def cube(num):
    result = num ** 3
    return f'{result}'

# [실습] 특정 사람 수 만큼 점심 메뉴 추천하기
# <int:people>
# return 이 중요하다.
@app.route('/menu/<int:people>')
def menu(people):
    import random
    food = ['불백', '짜장면', '짬뽕', '탕수육', '피자', '햄버거', '치킨', '순두부찌개', '김치찌개', '컵라면', '김밥']
    return f'{random.sample(food, people)}'

@app.route('/html')
def html():
    multiple_string = """
        <h1>This is h1 tag!</h1>
        <p>This is p tag</p>
    """
    return multiple_string

@app.route('/html_file')
def html_file():
    return render_template('html_file.html')

@app.route('/hi/<string:name>')
def hi(name):
    # Template Variable
    return render_template('hi.html', your_name=name)

@app.route('/menu_list')
def menu_list():
    menu = ['불백', '짜장면', '짬뽕', '탕수육', '피자', '햄버거', '치킨', '순두부찌개', '김치찌개', '컵라면', '김밥']
    return render_template('menu_list.html', menu_list=menu)

@app.route('/boot')
def boot() :
    return render_template('bootstrap.html')



# 터미널에 python hello.py  를 치면 바로 실행이 된다.  FLASK_APP=hello.py flask run 치는 것 보다 짧아짐.
if __name__ == '__main__' :
    app.run(debug=True)