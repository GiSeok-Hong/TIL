# 2021년 06월 18일 (금)



[참고] [시간에 맞춰 배너 사진 변경하기 예제](https://blog.naver.com/ysboo2/221225010497)

* setTimeout()을 이용한 배너 변경

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 setTimeout()을 이용한 배너 변경</title>
    <style>
      #box {width:300px; height:200px; overflow:hidden; border:1px solid #000; background-image:url('https://images.unsplash.com/photo-1558236714-d1a6333fce68?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60'); background-size:cover;}
    </style>
  </head>
  <body>

    <div id="box"></div>

    <script>
      var img_arr = ["url('https://images.unsplash.com/photo-1558236714-d1a6333fce68?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60')", "url('https://images.unsplash.com/photo-1577175779434-76fee49638d1?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60')", "url('https://images.unsplash.com/photo-1577447073345-58bb53c0936e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fHBvbWVyYW5pYW58ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60')"];
      var index = 0;
      setTimeout(slide, 1000);
      function slide(){
        box.style.backgroundImage = img_arr[index];
        index++;
        setTimeout(slide,1000);
        if(index >= img_arr.length){
          index = 0;
          
        }
      }
    </script>
  </body>
</html>
```

* setInterval() 사용한 배너 변경

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 setInterval()</title>
    <style>
      #box {width:300px; height:200px; overflow:hidden; border:1px solid #000; background-image:url('https://images.unsplash.com/photo-1558236714-d1a6333fce68?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60'); background-size:cover;}
    </style>
  </head>
  <body>
    <div id="box"></div>

    <script>
      var img_arr = ["url('https://images.unsplash.com/photo-1558236714-d1a6333fce68?ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60')", "url('https://images.unsplash.com/photo-1577175779434-76fee49638d1?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cG9tZXJhbmlhbnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60')", "url('https://images.unsplash.com/photo-1577447073345-58bb53c0936e?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fHBvbWVyYW5pYW58ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60')"];
      var index = 0;
      function slide(){
        box.style.backgroundImage = img_arr[index];
        index++;
        if(index >= img_arr.length){
          index = 0;
        }
      }
      setInterval(slide,1000);
    </script>
  </body>
</html>
```





### JS에서 this의 할당

JS에서 this는 정적으로 할당 되지 않고, 동적으로 할당된다.

이 말을 쉽게 해석하자면 this가 선언되었을 때가 아닌, **호출되었을 때 결정된다**는 의미이다.

```javascript
const person = function (name) {
	this.name = name;  // 이때 this는 결정되지 않는다.
}

const person1 = new person('hong');  // 이 때 결정 된다.
console.log(person1.name);  // hong
```







[예제 참고] [JavaScript this](https://blog.naver.com/ysboo2/221234976177)

* this 예제 1-1

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this step1-1</title>
  </head>
  <body>

    <ul>
      <li>딸기</li>
      <li>수박</li>
      <li>사과</li>
    </ul>

	<script>
      this.onclick=function(e){
        e.target.style.display="none";
      }
    </script>
  </body>
</html>

```

* this 예제 1-2

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this step1-2</title>
  </head>
  <body>

    <ul>
      <li>딸기</li>
      <li>수박</li>
      <li>사과</li>
    </ul>

	<script>
      this.onclick=function(){
        event.target.style.display="none";
      }
    </script>
  </body>
</html>
```

* this 예제 2

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this step2</title>
  </head>
  <body>

    <ul>
      <li id="a">딸기</li>
      <li id="b">수박</li>
      <li id="c">사과</li>
    </ul>

	<script>
      this.onclick=function(e){
        if(e.target.id=="a"){a.style.display="none";}
        if(e.target.id=="b"){b.style.display="none";}
        if(e.target.id=="c"){c.style.display="none";}
      }
    </script>
  </body>
</html>

```

* this 예제 3

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this step3</title>
  </head>
  <body>

    <ul>
      <li id="a">딸기</li>
      <li id="b">수박</li>
      <li id="c">사과</li>
    </ul>

	<script>
      this.onclick=function(e){
        if(e.target.id=="a"){a.style.backgroundColor="red";}
        if(e.target.id=="b"){b.style.backgroundColor="blue";}
        if(e.target.id=="c"){c.style.backgroundColor="green";}
      }
    </script>
  </body>
</html>
```

* this 예제4

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this step4</title>
  </head>
  <body>

    <ul>
      <li id="a">딸기</li>
      <li id="b">수박</li>
      <li id="c">사과</li>
    </ul>

    <script>
      this.onclick=function(e){
        if(e.target.id=="a"){
          a.style.backgroundColor="red";
          b.style.backgroundColor="white";
          c.style.backgroundColor="white";
        }
        if(e.target.id=="b"){
          b.style.backgroundColor="blue";
          c.style.backgroundColor="white";
          a.style.backgroundColor="white";
        }
        if(e.target.id=="c"){
          c.style.backgroundColor="green";
          a.style.backgroundColor="white";
          b.style.backgroundColor="white";
        }
      }
    </script>
  </body>
</html>
```

* this 예제5

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this step5</title>
  </head>
  <body>

    <ul>
      <li id="a">딸기</li>
      <li id="b">수박</li>
      <li id="c">사과</li>
    </ul>

    <script>
      this.onmouseover=function(e){
        if(e.target.id=="a"){
          a.style.backgroundColor="red";
        }
        if(e.target.id=="b"){
          b.style.backgroundColor="blue";
        }
        if(e.target.id=="c"){
          c.style.backgroundColor="green";
        }
      }

      this.onmouseout=function(e){
        if(e.target.id=="a"){
          a.style.backgroundColor="white";
        }
        if(e.target.id=="b"){
          b.style.backgroundColor="white";
        }
        if(e.target.id=="c"){
          c.style.backgroundColor="white";
        }
      }
    </script>
  </body>
</html>

```

* this 연습 - h1을 클릭 시 랜덤으로 body 색상 변경

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석</title>
    <style>
      h1 {cursor:pointer;}
    </style>
  </head>
  <body>
    <h1 id="text">배경 색상 바꾸기</h1>
    
    <script>
      this.onclick = function(e){
        if(e.target.id=="text"){
          var arr = ["red","orange","yellow","green","blue","indigo","purple"];
          var ranNum = Math.floor(Math.random() * arr.length);
          var bodyTag = document.getElementsByTagName("body")[0];
          bodyTag.style.backgroundColor=arr[ranNum];
        }
      }
    </script>

  </body>
</html>

```



* 

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 this 연습</title>
  </head>
  <body>

    <h1>Hello World</h1>
    <p>오늘은 금요일입니다~</p>

    <script>
      this.onclick = function(){
        alert("클릭하셨군요!");
      };
    </script>
  </body>
</html>

```



* 연습 : 숫자를 입력 받아 짝수의 값만 합해서 나타내기 + 예외처리

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 짝수의 합 + 예외처리</title>
    <style>
      * {margin:0; padding:0; box-sizing:border-box;}
      h1 {font-size:20px; text-align:center;}
      div {margin:20px auto; display:flex; align-items:center; justify-content:center; border:1px solid #000; width:500px; height:200px;}
    </style>
  </head>
  <body>

    <h1>숫자를 입력 받아서 짝수 값의 합 구하기</h1>
    <div id="box1">1</div>
    <div id="box2">2</div>

    <script>
      var arrNum = [];
      var arrEven = [];
      var sum = 0;
      
      while(1){
        var numbering = parseInt(prompt("총 몇 회 입력하시겠습니까?",1));
        if(isNaN(numbering) == false){
          break;
        } else {
          alert("숫자로 입력해주세요");
        }
      }


      // for문으로 입력할 횟수만큼 숫자 입력 받기 + 예외처리
      for(var i = 0; i < numbering; i++){
        var number = Number(prompt("숫자(정수)를 입력하세요 (실수, 문자 X)",0));
        if(isNaN(number) == true || (number*10)%10 !=0){    // 문자이거나 실수이면 실행
          while(1){
            alert("정수로 입력하세요");
            var number = Number(prompt("숫자를 입력하세요 (실수, 문자 X)",0));
            if(isNaN(number) == false && (number*10)%10 ==0){
              arrNum.push(number);
              if(number%2 == 0){
                sum += number;
                arrEven.push(number);
              }
              break;
            } // end if
          } // end while
        } else {
          arrNum.push(number);
          if(number%2 == 0){
            sum += arrNum[i];
            arrEven.push(number);
          }
        }
      } // end for


      box1.innerHTML = "총 입력 횟수 : " + numbering + "회<br><br>" + "받은 숫자 = " + arrNum;
      box2.innerHTML = "받은 숫자 중 짝수 : " + arrEven + "<br><br>짝수의 합 = " + sum;
      
    </script>

  </body>
</html>
```

