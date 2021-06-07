# 2021년 06월 07일 (월)

Java Script

인터프리터 언어 : 한줄 한줄 읽음 (Java Script)

컴파일 언어 : 코드를 모두 기계어로 변환 후 실행

== 값
=== 값과 타입

참고 : [JavaScript step1](https://blog.naver.com/ysboo2/221635966922)

1. 변수(Variable)

* 데이터를 저장할 수 있는 메모리 공간을 의미, 그 값이 변경될 수 있다.

```html
<!DOCTYPE html>
<html>
  <body>
    <p id="test"></p>

    <script>
      var x = 5;
      var y = 6;
      var z = x + y;
      document.getElementById("test").innerHTML =
        "The value of z is: " + z;
    </script>
  </body>
</html>
```

결과 : `The Value of z is: 11`



2. 연산자1

```html
<!DOCTYPE html>
<html>
  <body>
    <p id="test"></p>

    <script>
      var x = 100 + 50;
      document.getElementById("test").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `150`



 3-1. 대입연산자 곱         A* =B  ->  A=A*B

```html
<!DOCTYPE html>
<html>
  <body>
    <h2>The *= Operator</h2>
    <p id="test"></p>

    <script>
      var x = 10;
      x *= 5;
      document.getElementById("test").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `50`



3-2. 대입연산자 나누기          A/=B  ->  A=A/B

```html
<!DOCTYPE html>
<html>
  <body>
    <h2>The /= Operator</h2>
    <p id="test"></p>

    <script>
      var x = 10;
      x /= 5;
      document.getElementById("test").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `2`



3-3. 대입연산자 나머지        A%=B    ->    A=A%B

```html
<!DOCTYPE html>
<html>
  <body>
    <h2>The %= Operator</h2>
    <p id="test"></p>

    <script>
      var x = 10;
      x %= 5;
      document.getElementById("test").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `0`



3-4. 대입연산자_누적연산자 덧셈        A+=B   ->    A=A+B

```html
<!DOCTYPE html>
<html>
  <body>
    <h2>The += Operator</h2>
    <p id="test"></p>

    <script>
      var x = 10;
      x += 5;
      document.getElementById("test").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `15`



3-5. 대입연산자 누적연산자 뺄셈     A-=B      ->     A=A-B

```html
<!DOCTYPE html>
<html>
  <body>
    <h2>The -= Operator</h2>
    <p id="test"></p>

    <script>
      var x = 10;
      x -= 5;
      document.getElementById("test").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `5`



4-1. 증감연산자1    ++

* var A=++B // 변수 B의 데이터를 1 증가시킨 후 변수 A에 저장
* var A=B++ // 변수 A에 변수 B의 데이터를 저장한 후 변수 B의 데이터를 1증가

```html
<!DOCTYPE html>
<html>
  <body>

    <h2>The ++ Operator</h2>

    <p id="demo"></p>

    <script>
      var x = 5;
      x++;
      var z = x;
      document.getElementById("demo").innerHTML = z;
    </script>

  </body>
</html>
```

결과 : `6`



4-2. 증감연산자2        --

```html
<!DOCTYPE html>
<html>
  <body>

    <h2>The -- Operator</h2>

    <p id="demo"></p>

    <script>
      var x = 5;
      x--;
      var z = x;
      document.getElementById("demo").innerHTML = z;
    </script>

  </body>
</html>
```

결과 : `4`



5. 연산자 우선순위

```html
<!DOCTYPE html>
<html>
  <body>

    <p>A typical arithmetic operation takes two numbers (or expressions) and produces a new number.</p>

    <p id="demo"></p>

    <script>
      var a = 3;
      var x = (100 + 50) * a;
      document.getElementById("demo").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `450`



6-1. 문자결합연산자

* 문자형 데이터 + 문자형 데이터 = 하나의 문자형 데이터
* 문자형 데이터 + 숫자형 데이터 = 하나의 문자형 데이터

```html
<!DOCTYPE html>
<html>
  <body>

    <h2>JavaScript Operators</h2>

    <p>The assignment operator += can concatenate strings.</p>

    <p id="demo"></p>

    <script>
      txt1 = "What a very ";
      txt1 += "nice day";
      document.getElementById("demo").innerHTML = txt1;
    </script>

  </body>
</html>
```

결과 : `What a very nice day`



6-2. 문자결합연산자

```html
<!DOCTYPE html>
<html>
  <body>


    <p id="demo"></p>

    <script>
      var txt1 = "John";
      var txt2 = "Doe";
      document.getElementById("demo").innerHTML = txt1 + " " + txt2;
    </script>

  </body>
</html>
```

결과 : `John Doe`



6-3. 문자결합연산자

```html
<!DOCTYPE html>
<html>
  <body>

    <h2>JavaScript Operators</h2>

    <p>Adding a number and a string, returns a string.</p>

    <p id="demo"></p>

    <script>
      var x = 5 + 5;
      var y = "5" + 5;
      var z = "Hello" + 5;
      document.getElementById("demo").innerHTML =
        x + "<br>" + y + "<br>" + z;
    </script>

  </body>
</html>
```

결과 : `10 / 55 / Hello5`



6-4. 문자결합연산자

```html
<!DOCTYPE html>
<html>
  <body>

    <h2>JavaScript</h2>

    <p>JavaScript evaluates expressions from left to right. Different sequences can produce different results:</p>

    <p id="demo"></p>

    <script>
      var x = "Volvo" + 16 + 4;
      document.getElementById("demo").innerHTML = x;
    </script>

  </body>
</html>
```

결과 : `Volvo164`



7-1. innerHTML

```html
<!DOCTYPE html>
<html>
  <body>

    <h2>My First Page</h2>

    <p id="demo"></p>

    <script>
      document.getElementById("demo").innerHTML = "Hello World!";
    </script>

  </body>
</html>
```

결과 : `Hello World!`



7-2. innerHTML

```html
<!DOCTYPE html>
<html>
  <body>

    <p id="demo" onclick="myFunction()">Click me to change my HTML content (innerHTML).</p>

    <script>
      function myFunction() {
        document.getElementById("demo").innerHTML = "Paragraph changed!";
      }
    </script>

  </body>
</html> 
```

결과 : (클릭 전) `Click me to change my HTML content (innerHTML).`

​           (클릭 후) `Paragraph changed!`



7-3.innerHTML

```html
<!DOCTYPE html>
<html>
  <body>

    <h1 id="id01">Old Heading</h1>

    <script>
      var element = document.getElementById("id01");
      element.innerHTML = "New Heading";
    </script>

    <p>JavaScript changed "Old Heading" to "New Heading".</p>

  </body>
</html> 
```

결과 : `New Heading`



8-1. function 매개변수

```html
<!DOCTYPE html>
<html>
  <body>


    <p id="demo"></p>

    <script>
      var x = function (a, b) {return a * b};
      document.getElementById("demo").innerHTML = x(4, 3);
    </script>

  </body>
</html>
```

결과 : `12`



8-2 

```html
<!DOCTYPE html>
<html>
  <body>

    <p>JavaScript has an built-in function constructor.</p>
    <p id="demo"></p>

    <script>
      var myFunction = new Function("a", "b", "return a * b");
      document.getElementById("demo").innerHTML = myFunction(4, 3);
    </script>

  </body>
</html>
```

결과 : `12`



9-1. function을 불러야 실행

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>

  </head>
  <body>

    <h1 id="result">color</h1>

    <button onclick="chc()">click1</button>
    <button id="btn">click2</button>
    <button id="btn2">click3</button>

    <script>
      function chc(){
        document.getElementById('result').style.color="green";
      }

      document.getElementById('btn').onclick=function(){
        chc();
      }


      document.getElementById('btn2').onclick=function(){
        document.getElementById('result').style.color="tomato";
      }
    </script>
  </body>
</html>
```

결과 : `click1, click2를 누르면 h1의 color가 초록색으로 click3를 누르면 토마토색으로 변경`



9-2. 

```html
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <ul>
      <li>사과</li>
      <li>수박</li>
      <li>딸기</li>
    </ul>

    <button onclick="chc();">click</button>
    <button id="btn1">click</button>


    <script>
     function chc(){
       document.getElementsByTagName('li')[1].style.color="green"
     }

     document.getElementById('btn1').onclick=function(){
       chc();
     }


    </script>
  </body>
</html>
```

결과 : `버튼을 클릭시 수박이 초록색으로 변경`



* 버튼 클릭시 h1 색상 변경

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>

  </head>
  <body>

    <h1 id="result">color</h1>

    <button onclick="change()">click1</button>

    <script>
      function change(){
        document.getElementById('result').style.color="green";
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
    <title>Page Title</title>
  </head>
  <body>
    <h1>과일</h1>
    <ul>
      <li>사과</li>
      <li>수박</li>
      <li>딸기</li>
    </ul>
    <button>click</button>
    <script>
      document.getElementsByTagName('button')[0].onclick=function(){
        document.getElementsByTagName('li')[2].style.color='tomato';
      }
    </script>
  </body>
</html>

```

