# 2021년 06월 15일 (화)

[참고] [JavaScript 함수](https://blog.naver.com/ysboo2/221536540755)

함수 생성

* 함수 선언식

```javascript
function 함수명() {
    실행문;
}

함수명();
```

* 함수 표현식

```javascript
var test = function() {
    실행문;
}

test();
```

* 함수 생성자

```javascript
var test = new Function('a', 'b', 'return a + b');
test(1,2);
```



매개변수가 있는 함수 정의문

```javascript
function 함수명(매개변수 1, 매개변수 2,.... 매개변수 n){
     실행문;
}

함수명 (데이터1, 데이터2,....데이터 n);
```

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 함수</title>
  </head>
  <body>   
    <script>
      
      function login(id,pw){
        if(id=="hong"){
          if(pw=="1234"){
            document.write(id + "님 방문을 환영합니다.");
          }else {
            document.write("비밀번호가 틀렸습니다.");
          }
        }else {
          document.write("존재하지 않는 아이디입니다.");
        }
      }
      
      var user_id = prompt("아이디를 입력하세요");
      var user_pw = prompt("비밀번호를 입력");
      
      login(user_id, user_pw);
    </script>
  </body>
</html>
```



데이터를 반환하는 return 문

```javascript
function 함수명( ){
    실행문;
    return 데이터 (값);
}
var 변수 = 함수명 ( );
```

```javascript
function test(a, b){
    var num = a * b;
    return num;  
}

var result = test(10,3);
document.write(result);
```



* 함수를 실행하다 return문이 실행되면 return문 다음에 오는 실행문은 실행되지 않고 강제로 종료됩니다. 

```javascript
function test(a,b){
     return a + b;
     document.write("안녕하세요.") //return문을 만나면 강제로 종료, 실행되지 않음.
}

var num = test(100,200)
```



* 익명함수 - 바로 실행되는 함수로 일회성

```javascript
(function ( ) {
   i=0;
   while (i<10){
       document.write(i);
        i += 1;
   }
})( );
```





[참고] [매개변수와 전달인자](https://blog.naver.com/ysboo2/221538884894);

* parameter

  * 매개변수로 함수를 정의할 때 외부로부터 받아들이는 임의의 값을 의미

  * ```javascript
    function test(x,y){
       return x+y;
    };
    // x,y 가 파라미터
    ```

* argument

  * 함수를 호출 할 때 사용하게 되는 일련의 값을 의미

  * ```javascript
    function test(x,y){
       return x+y;
    };
    
    test(3,4);
    // 3,4 가 아규먼트
    ```

    



호이스팅 (Hoisting)이란?

* 호이스팅은 var를 통해 정의된 변수의 선언문을 유효 범위의 최상단으로 끌어올리는 행위



* 예제

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 점수 입력 받기</title>
  </head>
  <body>    
    <script>
    
      var score = [];
      var numbering = parseInt(prompt("입력할 학생수를 입력하세요",'0'));
      var input = function(){
        var name = prompt("이름을 입력하세요", '홍길동');
        var korean = Number(prompt("국어 점수를 입력하시오",100));
        var english = Number(prompt("영어 점수를 입력하시오",100));
        var math = Number(prompt("수학 점수를 입력하시오",100));
        score.push(name);
        score.push(korean);
        score.push(english);
        score.push(math);
      }
      
      for(var i = 0; i < numbering; i++){
        input();
      }
      
      for(var i = 0; i < numbering; i++){
        document.write("이름 : " + score[i*4] + "<br>" + "국어 점수 : " + score[i*4+1] + "점 <br>" + "영어 점수 : " + score[i*4+2] + "점 <br>" + "수학 점수 : " + score[i*4+3] + "점 <br>" + "합계 점수 : " + (score[i*4+1] + score[i*4+2] + score[i*4+3]) + "점 <br>" + "평균 점수 : " + (score[i*4+1] + score[i*4+2] + score[i*4+3])/3 + "점 <br><br><br><br>");
      }
	</script>
  </body>
</html>
```



* 구구단 예외처리 1

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 구구단-예외처리</title>
  </head>
  <body>
	<script>
      var num = parseInt(prompt("2~9 숫자를 입력하세요", 2));
      if(num < 2 || num > 9 || isNaN(num) == true){
        var check = true;
      }
      while(check){
        alert("다시 입력하세요")
        var num = parseInt(prompt("2~9 숫자를 입력하세요", 2));
        
        if(num >= 2 && num <=9 && isNaN(num)==false){
          check = false;
        }
      }
      
      document.write("<h1>" + num + "단</h1>");
      for(var i = 1; i < 10; i++){
        document.write(num + " X " + i + " = " + num * i + "<br>");
      }
    </script>

  </body>
</html>

```

* 구구단 예외처리 2

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 구구단-예외처리2</title>
  </head>
  <body>
	<script>

      while(1){
        var dan = prompt("몇 단 까지 출력하시겠습니까?","1~100 사이의 정수");
        if(dan > 100 || dan < 1){
          alert("1~100 사이 정수를 입력하세요");
        } else if(isNaN(dan)){
          alert("숫자를 입력하세요");
        } else if((dan*10)%10 != 0){
          alert("정수를 입력하세요");
        } else break;
      }

      for(var i = 1; i <= dan; i++){
        document.write("<h1>" + i + "단</h1>");
        for(var j = 1; j < 10; j++){
          document.write(i + " X " + j + " = " + i*j + "<br>");
        }
      }
    </script>

  </body>
</html>
```

* 구구단 예외처리3

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 구구단-예외처리3</title>
  </head>
  <body>
    <script>

      var dan = prompt("단수를 입력하시오", "1~9사이의 정수");
      var check = parseInt((dan*10)%10);

      if(check == 0){
        if(dan > 0 && dan < 10){
          while(1){
            document.write("<h1>" + dan + "단</h1>");
            var i = 1;
            while(i < 10){
              var res = dan * i;
              document.write(dan + " X " + i + " = " + res + "<br>");
              i++;
            }
            break;            
          }
        } else {
          alert("1~9 사이의 정수를 입력하세요");
        }
      } else {
        alert("정수를 입력하세요");
        location.reload();
      }

    </script>

  </body>
</html>

```

* 구구단 예외처리4

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 구구단-예외처리4</title>
  </head>
  <body>
    <script>
      var dan = parseInt(prompt("1~9 사이의 정수를 입력하세요",1));
      if(dan < 1 || dan > 9 || isNaN(dan)==true) {
        var check = true;
      }
      while(check){
        alert("다시 입력하세요");
        var dan = parseInt(prompt("1~9 사이의 정수를 입력하세요", 1));
        if(dan >=1 && dan <=9 && isNaN(dan)==false){
          check=false;
        }
      }
      function gugudan(dan){
        document.write("<h1>" + dan + "단</h1>");
        for(var i = 1; i < 10; i++){
          document.write(dan + " X " + i + " = " + dan*i + "<br>");
        }
      }
      
      gugudan(dan);

    </script>

  </body>
</html>

```

