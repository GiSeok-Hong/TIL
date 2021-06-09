# 2021년 06월 09일 (수)

[참고] [제어문 예제](https://blog.naver.com/ysboo2/221636372498)



* location.reload();

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Reload Test</title>
  </head>
  <body>

    <h1>reload test</h1>
    <button>Click</button>

    <script>
      document.getElementsByTagName("button")[0].onclick = function(){
        location.reload();
      }
    </script>

  </body>
</html>
```



* prompt();  -  prompt로 받으면 문자(숫자도 문자)

```javascript
var num = prompt("숫자를 입력하세요","0");

console.log(num);

typeof num;  //string
```



* parseInt();  -  정수(양의 정수, 0, 음의 정수)를 리턴 

```javascript
var num = parseInt(prompt("숫자를 입력하세요","0"));

typeof num;   //number

parseInt("5");    //5

parseInt("5.5");   //5 
```



* Number();  -  수(number)로 변환

```javascript
var num = Number(prompt("숫자를 입력하세요","0"));
typeof num;   //number


Number(9)  //9
Number("9");  //9


var a=5;
Number(a);    
typeof a;   //number

var b="7";
Number(b);
typeof b;  //string
```



* isNaN();  -  NaN(Not a Number) 숫자면 false / 숫자가 아니면 true , 연산이 불가능한지 물어보는 함수 

```javascript
isNaN(3);  //false

isNaN("3");  //false

isNaN("apple") // true




var num = prompt("숫자를 입력하세요","0");

if(isNaN(num)==true){
  console.log(num+"은 문자");
  }else {
  console.log(num+"은 숫자"); 
  }
```





* for문

```html
<!DOCTYPE html>
<html>
  <head>
    <title>for 문</title>
  </head>
  <body>

    <script>

      for(var i = 0; i < 5; i++){
		document.write(i + "<br>");
      }

    </script>

  </body>
</html>
```



* while문

```html
<!DOCTYPE html>
<html>
  <head>
    <title>while문</title>
  </head>
  <body>

    <script>

      var i =0;
      while(i<6){
        document.write(i+ "<br>");
        i++;
      }

    </script>

  </body>
</html>
```



* 구구단 2단

```html
<!DOCTYPE html>
<html>
  <head>
    <title>구구단 2단</title>
  </head>
  <body>

    <script>

      var result;
      var dan=2;
      document.write("<h1>" + dan + "단</h1>");
      
      for (var k=1; k<10; k++){
        result=k*dan;
        document.write(dan + "X" + k + "=" + result + "<br>");
      }

    </script>

  </body>
</html>
```



* prompt로 원하는 단 입력 받아서 출력

```html
<!DOCTYPE html>
<html>
  <head>
    <title>while문</title>
  </head>
  <body>

    <script>

      var dan = prompt("원하는 구구단 숫자를 입력해주세요", "1");
      var result;
      document.write("<h1>" + dan + "단</h1>")
      for(var i=1; i < 10; i++){
        result = i * dan;
        document.write(dan + " X " + i + " = " + result + "<br>");
      }
      

    </script>

  </body>
</html>
```



* 함수로 구구단 

```html
<!DOCTYPE html>
<html>
  <head>
    <title>함수</title>
  </head>
  <body>

    <script>

      function gugudan(ele){
        document.write("<h1>" + ele + "단</h1>");
        var res;
        for (var i=1; i<10; i++){
          res = i * ele;
          document.write(ele + " X " + i + " = " + res + "<br>");
        }
        return;
      }

      gugudan(4);
      
      var a=5;
      gugudan(a);
    </script>

  </body>
</html>
```



* 이중 for문

```html
<!DOCTYPE html>
<html>
  <head>
    <title>이중 for문으로 구구단 작성</title>
  </head>
  <body>

    <script>

      for(var i = 2; i < 10; i++){
        document.write("<h1>구구단 " + i + "단 </h1>");
        for(var j = 1; j < 10; j++){
          document.write(i + " X " + j + " = " + i*j + "<br>"); 
        }
      }
      
    </script>

  </body>
</html>
```



* 최대값 구하기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>최대값</title>
  </head>
  <body>

    <script>
      var arr=[30,40,60];
      var max=0;
      for(var i = 0; i < arr.length; i++){
        if(max < arr[i]){
          max=arr[i];
        }
      }
      document.write("최대값은 : " + max);

    </script>

  </body>
</html>
```



* 최소값 구하기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>최소값</title>
  </head>
  <body>

    <script>
      var arr=[10,30,50,70];
      var min=100;
      for(var i = 0; i < arr.length; i++){
        if(min > arr[i]){
          min=arr[i];
        }
      }
      document.write("최소값은 : " + min);

    </script>

  </body>
</html>
```



* 평균값 구하기

```html
<!DOCTYPE html>
<html>
  <head>
    <title>평균값</title>
  </head>
  <body>

    <script>
      var arr=[20,40,60,80];
      var sum = 0;
      var avg = 0;
      for(var i = 0; i < arr.length; i++){
        sum += arr[i];
      }
      avg = sum/arr.length;
      document.write("평균값은 : " + avg);

    </script>

  </body>
</html>
```

