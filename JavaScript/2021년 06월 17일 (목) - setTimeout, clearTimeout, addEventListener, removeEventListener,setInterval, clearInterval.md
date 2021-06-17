# 2021년 06월 17일 (목)

Math.random() 함수 연습

* div 색 랜덤으로 바꾸기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 박스 색 바꾸기 0617</title>

    <style>
      #btn {cursor:pointer; padding:10px 20px; background-color:yellowgreen; border:none; color:#fff;}
      #box {width:200px; height:200px; margin:30px 0; border:1px solid #000;}

    </style>
  </head>
  <body>

    <h1>박스 색 바꾸기</h1>
    <div id="box"></div>
    <button id="btn">클릭</button>

    <script>
      var arrColor= ["red", "orange", "yellow", "green", "blue", "indigo", "purple"];
      
      btn.onclick = function(){
        var ranNum = Math.floor(Math.random() * arrColor.length);
        box.style.backgroundColor = arrColor[ranNum];
      }
    </script>

  </body>
</html>

```

* h1 색 랜덤으로 바꾸기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 글자 색 바꾸기 0617</title>

    <style>
      button {cursor:pointer; padding:10px 20px; background-color:yellowgreen; border:none; color:#fff;}

    </style>
  </head>
  <body>

    <h1>글자 색 바꾸기</h1>
    <button>클릭</button>

    <script>
      var arrColor= ["red", "orange", "yellow", "green", "blue", "indigo", "purple"];
      
      document.getElementsByTagName('button')[0].onclick = function(){
        var ranNum = Math.floor(Math.random() * arrColor.length);
        document.getElementsByTagName('h1')[0].style.color = arrColor[ranNum];
      }
    </script>

  </body>
</html>

```

* img 랜덤으로 바꾸기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 이미지 바꾸기 0617</title>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      #imgbox {width:300px; height:250px; border:1px solid #eee; margin:30px auto; overflow:hidden;}
      img {width:100%; height:100%;}
      button {cursor:pointer; padding:10px 20px; background-color:yellowgreen; border:none; color:#fff; margin:0 auto; display:block;}

    </style>
  </head>
  <body>

    <h1>좋아하는 강아지는?</h1>
    <div id="imgbox">
      <img src="https://images.unsplash.com/photo-1587300003388-59208cc962cb?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8ZG9nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="img">
    </div>
    <button onclick="chimg()">클릭</button>

    <script>
      var arrSrc= ["https://images.unsplash.com/photo-1543466835-00a7907e9de1?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8ZG9nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "https://images.unsplash.com/photo-1576201836106-db1758fd1c97?ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8ZG9nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "https://images.unsplash.com/photo-1477884213360-7e9d7dcc1e48?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGRvZ3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60", "https://images.unsplash.com/photo-1578133559556-9e83af5fc5f3?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDB8fGRvZ3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"];

      function chimg(){
        var ranNum = Math.floor(Math.random() * arrSrc.length);
        document.getElementsByTagName('img')[0].src = arrSrc[ranNum];
      }
    </script>

  </body>
</html>

```

* div 내부 text 바꾸기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 div 내부 text 바꾸기 0617</title>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      h1 {margin:0 auto; text-align:center;}
      div {width:200px; height:200px; border:1px solid #eee; margin:30px auto; display:flex; justify-content:center; align-items:center;}

      button {cursor:pointer; padding:10px 20px; background-color:yellowgreen; border:none; color:#fff; margin:0 auto; display:block;}

    </style>
  </head>
  <body>

    <h1>메뉴 고르기</h1>
    <div id="box">
      메뉴 결과는?
    </div>
    <button onclick="chmenu()">클릭</button>

    <script>
      var arrMenu= ["닭갈비", "피자", "치킨", "햄버거", "삼겹살", "곱창", "막창", "볶음밥"];

      function chmenu(){
        var ranNum = Math.floor(Math.random() * arrMenu.length);
        box.innerHTML = arrMenu[ranNum];
      }
    </script>

  </body>
</html>

```

* 순차적으로 변경

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 색상 순차적으로 바꾸기 0617</title>

    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      h1 {margin:0 auto; text-align:center;}
      div {width:200px; height:200px; border:1px solid #eee; margin:30px auto; }

      button {cursor:pointer; padding:10px 20px; background-color:yellowgreen; border:none; color:#fff; margin:0 auto; display:block;}

    </style>
  </head>
  <body>

    <h1>순차적으로 바꾸기</h1>
    <div id="box"></div>
    <button onclick="chColor()">클릭</button>

    <script>
      var arrColor= ["red", "orange", "yellow", "green", "blue", "indigo", "purple"];
      var index = 0;
      function chColor(){
        box.style.backgroundColor = arrColor[index];
        index++;
        if(index>=arrColor.length){
          index = 0;
        }
      }
    </script>

  </body>
</html>

```

* 내장객체

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 내장객체 0617</title>
  </head>
  <body>
    <script>    
      var arr = new Array('경기도','경상도','충청도','경상도', '전라도');

      function getRandomValueFromArray(haystack){
        var index = Math.floor(haystack.length * Math.random());
        return haystack[index]; 
      }

      document.write(getRandomValueFromArray(arr));
    </script>

  </body>
</html>

```

* setTimeout();

> setTimeout() 메소드는 지정된 밀리 초 후에 함수를 호출한다.
>
> Syntax
>
> `setTimeout(function, milliseconds)`

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 setTimeout()</title>
    
    <style>
      .popup {display:none;}
    </style>
  </head>
  <body>

    <div class="popup">
      3초 후 등장
    </div>
    
    <script>
      // 3초 뒤에 dis_block 함수를 실행  
      setTimeout(dis_block,3000);
      
      function dis_block(){
        document.getElementsByClassName('popup')[0].style.display="block";
      }
    </script>

  </body>
</html>

```

* clearTimeout()

> clearTimeout() 메소드는 setTimeout() 메소드로 설정된 타이머를 지운다.
>
> Syntax
>
> `myVar = setTimeout(function, milliseconds);`
>
> `clearTimeout(myVar)`

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 clearTimeout()</title>

    <style>
      .popup {display:none;}
    </style>
  </head>
  <body>

    <div class="popup">
      hello world
    </div>
    
    <button id="btn">stop setTimeout</button>


    <script>
      var view = setTimeout (dis_block,3000);

      function dis_block(){        
        document.getElementsByClassName('popup')[0].style.display="block";
      }
      
      // btn을 누르면 3초가 지나도 div가 나오지 않는다.
      btn.onclick=function(){
        clearTimeout(view);
      } 
    </script>
  </body>
</html>

```



* addEventListener()

> addEventListener() 메소드는 지정한 이벤트가 대상에 전달될 때마다 호출할 함수를 설정한다.
>
> Syntax
>
> `element.addEventListener(event,function)`
>
> 
>
> **mouseover / mouseout  VS mouseenter / mouseleave 차이**
>
> mouseover, mouseout 은 자식 요소에 접근해도 동작을 한다.
>
> mouseenter, mouseleave 는 자식 요소에 접근해도 동작하지 않는다.

* mouseover / mouseout   사용

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 addEventListener() 연습1 </title>

    <style>
      #box {width:300px; height:200px; background:url("https://images.unsplash.com/photo-1558236829-26ed051cde2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"); background-size:cover; cursor:pointer;}
    </style>
  </head>
  <body>

    <div id="box">
      123
    </div>

    <script>
      // 마우스가 box에 올라가면 chi 함수를 실행
      box.addEventListener("mouseover",chi);
        
      // 마우스가 box 바깥으로 가면 chi2 함수를 실행  
      box.addEventListener("mouseout",chi2);

        
  
      function chi() {
        box.style.backgroundImage = "url(https://images.unsplash.com/photo-1558236829-26ed051cde2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)";
      }

      function chi2() {
        box.style.backgroundImage = "url(https://images.unsplash.com/photo-1558236809-1fcce1bf8f7a?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBvbWVyYW5pYW58ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)";

      }
    </script>

  </body>
</html>

```

* mouseenter / mouseleave   사용

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 addEventListener()</title>

    <style>
      #box {width:300px; height:200px; background:url("https://images.unsplash.com/photo-1558236829-26ed051cde2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"); background-size:cover; cursor:pointer;}
    </style>
  </head>
  <body>

    <div id="box">
      123
    </div>

    <script>
      box.addEventListener("mouseenter",chi);
      box.addEventListener("mouseleave",chi2);

      function chi() {
        box.style.backgroundImage = "url(https://images.unsplash.com/photo-1558236829-26ed051cde2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)";
      }

      function chi2() {
        box.style.backgroundImage = "url(https://images.unsplash.com/photo-1558236809-1fcce1bf8f7a?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBvbWVyYW5pYW58ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)";

      }
    </script>

  </body>
</html>

```



* removeEventListener()

> removeEventListener() 메소드는 addEventListener() 메소드에 첨부 된 이벤트 핸들러를 제거
>
> Syntax
>
> `element.removeEventListener(event,function)`

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 removeEventListener()</title>

    <style>
      #box {width:300px; height:200px; background:url("https://images.unsplash.com/photo-1558236829-26ed051cde2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"); background-size:cover; cursor:pointer;}
    </style>
  </head>
  <body>

    <div id="box">
      123
    </div>
    
    <button id="btn">removeEvent</button>

    <script>
      box.addEventListener("mouseover",chi);
      box.addEventListener("mouseout",chi2);

      function chi() {
        box.style.backgroundImage = "url(https://images.unsplash.com/photo-1558236829-26ed051cde2b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)";
      }

      function chi2() {
        box.style.backgroundImage = "url(https://images.unsplash.com/photo-1558236809-1fcce1bf8f7a?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBvbWVyYW5pYW58ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60)";

      }
      
      // 버튼을 누르면 마우스를 box에 올렸다가 바깥으로 빼도 변화가 없다.
      btn.onclick = function(){
        box.removeEventListener("mouseover",chi);
        box.removeEventListener("mouseout",chi2);
      }
      
    </script>

  </body>
</html>

```



* setInterval()

> setInterval() 메소드는 일정한 시간 간격으로 특정 함수를 반복적으로 실행한다.
>
> Syntax
>
> `setInterval(function, milliseconds)`

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 setInterval()</title>
  </head>
  <body>
    <script>
      setInterval(colorBg, 2000);

      var arrColor=["red", "orange", "yellow","green", "blue", "indigo", "purple"];

      var i = 0;

      function colorBg(){
        i++;
        if(i >= arrColor.length){
          i=0;
        }
        var bodyTag = document.getElementsByTagName('body')[0];
        bodyTag.style.backgroundColor=arrColor[i];
      }
    </script>

  </body>
</html>

```

* clearInterval()

> clearInterval() 메소드는 setInterval() 메소드로 설정된 타이머를 지운다.
>
> Syntax
>
> `myVar = setInterval(function, milliseconds);`
>
> `clearInterval(myVar);`

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 clearInterval()</title>
    
    <style>
      #btn {cursor:pointer;}
    </style>
  </head>
  <body>

    <button id ="btn">clearInterval</button>
    <script>
      var interval = setInterval(colorBg, 2000);

      var arrColor=["red", "orange", "yellow","green", "blue", "indigo", "purple"];

      var i = 0;

      function colorBg(){
        i++;
        if(i >= arrColor.length){
          i=0;
        }
        var bodyTag = document.getElementsByTagName('body')[0];
        bodyTag.style.backgroundColor=arrColor[i];
      }

      btn.onclick = function(){
        clearInterval(interval);
      }
    </script>

  </body>
</html>

```

