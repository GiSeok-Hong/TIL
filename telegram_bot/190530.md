## 2019.05.30 (목)

***

## Telegram Chat Bot

#### 1. 회원가입

> 모바일로 어플을 받은 뒤 회원 가입을 한다

#### 2. Telegram Web-version

> <https://telegram.org/>  으로 접속 한 뒤에 Telegram Web-version 클릭

#### 3. @BotFather 검색

> 검색창에 @BotFather을 검색 하여 클릭! 그럼 아래와 같이 시작된다.

![image](https://user-images.githubusercontent.com/48499094/58602510-3671ab80-82c8-11e9-9a05-f1d853caa217.png)

#### 4. Create Botname, username

![image](https://user-images.githubusercontent.com/48499094/58603102-6e79ee00-82ca-11e9-99a5-21789dd29189.png)

#### 5. 대략적인 흐름

> 1. <https://api.telegram.org/bot<token>>/sendMessage?chat_id=&text=
>
>    처음 생성시 발급 받은 API를  <token> 위치에 적고 본인의 아이디(숫자)를 chat_id= 우측에 적고 text= 우측에 하고 싶은 말을 적으면 자신에게 메세지가 온다.
>
>    ex) text=hi 라고 했을 경우
>
>    ![image](https://user-images.githubusercontent.com/48499094/58603727-b9950080-82cc-11e9-9f2e-600ba62c0a2d.png)
>
> 2. https://api.telegram.org/bot<token>>/getUpdates
>
>    지금까지의 대화 목록이 아래와 같은 형식으로 나온다.
>
>    ![image](https://user-images.githubusercontent.com/48499094/58604407-3032fd80-82cf-11e9-89cd-8de3594e82f4.png)
>
> 3. pycharm 을 통한 간단한 실행
>
>    ![image](https://user-images.githubusercontent.com/48499094/58617167-689c0100-82fa-11e9-922d-2d6a8c73b058.png)
>
>    
>
> ![image](https://user-images.githubusercontent.com/48499094/58604755-86547080-82d0-11e9-8bdd-494c01f8c979.png)
>
> ![image](https://user-images.githubusercontent.com/48499094/58604827-be5bb380-82d0-11e9-8362-7f278d14ed52.png)
>
> 
>
> 4. ngrok 
>
>    : 외부에서 localhost에 접속하게 해주는 프로그램
>
>    1. <https://ngrok.com/> 에서 회원가입하여 token 발급 받음
>
>    2. <https://dl.equinox.io/ngrok/ngrok/stable/archive> 에서 2.2.8 버전을 설치함
>
>    3. cmd 창에서 ngrok.exe 입력
>
>       ![image](https://user-images.githubusercontent.com/48499094/58609430-7fcef480-82e2-11e9-8b3a-0db24855ea13.png)
>
>    4. 이후에 ngrok + 발급받은 토큰을 입력
>
>       ![image](https://user-images.githubusercontent.com/48499094/58609537-d3d9d900-82e2-11e9-8cdd-a6666687a0a2.png)
>
>    5. ngrok http 5000 입력 하면 아래와 같은 창이 뜬다.
>
>       ![image](https://user-images.githubusercontent.com/48499094/58609591-0c79b280-82e3-11e9-988b-6cc94d75d02e.png)
>
>    6. Forwarding 에 있는 주소 중에서 아래의 것을 쳐보면 아래와 같이 나온다.
>
>       ![image](https://user-images.githubusercontent.com/48499094/58609673-6bd7c280-82e3-11e9-8cfa-61e995d6b2d7.png)
>
>    7. pythonanywhere 회원가입 (24시간 가능하도록 하기 위해서)
>
>       
>
>    8. 보안을 위해 키값들을 다른곳에 저장
>
>       pip install python-decouple
>
>       <https://github.com/henriquebastos/python-decouple>
>
>       .env 파일을 만들어서 키값들을 저장
>
>       ![image](https://user-images.githubusercontent.com/48499094/58619366-be26dc80-82ff-11e9-8043-ad1ad65c9f02.png)
>
>    9. pythonanywhere에서 자신이 설정한 경로로 들어가서 flask_app.py 수정
>
>       (app.py의 내용을 붙여넣고 기존에 있던 코드는 삭제)
>
>       ![image](https://user-images.githubusercontent.com/48499094/58619632-3b525180-8300-11e9-8b61-8b3d88fd2991.png)
>
>    10. set_webhook.py 에서 pythonanywhere에서 발급받은 주소로 변경
>
>    ![image](https://user-images.githubusercontent.com/48499094/58619788-8d937280-8300-11e9-8cf0-f548b5b6f4e3.png)
>
>    11. 터미널에서 set_webhook.py 재실행
>
>    ![image](https://user-images.githubusercontent.com/48499094/58619860-b6b40300-8300-11e9-8cf4-7b6fac95fc31.png)
>
>    12. 잘 했다면 로컬서버를 종료해도 작동이 된다.
>
>    ![image](https://user-images.githubusercontent.com/48499094/58620547-44dcb900-8302-11e9-9a4d-586e4389d86e.png)

