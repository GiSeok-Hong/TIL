# 2021년 06월 19일 (토)



JavaScript 내장함수

* 자바스크립트에서 기본적으로 제공하는 함수



#### 1. eval()  :  문자로 표현된 js 코드를 실행하는 함수

* Syntax : `eval(string)`

  ```javascript
  var test = "10 + 10";
  eval(test);  // 20
  ```

  

#### 2. parseInt()  :  문자형 데이터를 정수형 데이터로 변환

* Syntax : `parseInt(String, radix)`   radix는 변환할 진수를 나타냄

  ```javascript
  parseInt("7.0001");    //   7
  parseInt("7 문자열");   //  7
  parseInt("문자열 7");   //  NaN
  ```

  

#### 3. parseFloat()   :   문자형 데이터를 실수형 데이터로 변환

* Syntax : `parseFloat(value)`

  ```javascript
  parseFloat(" 7 ");      // 7 
  parseFloat("7.0001");   // 7.0001
  parseFloat("7 문자열");  // 7 
  parseFloat("문자열 7");  // NaN
  ```

  

#### 4. isNaN()  :  전달된 값이 NaN인지의 여부를 boolean으로 반환

* Syntax : `isNaN(value)`

  ```javascript
  isNaN(NaN);       // true
  isNaN("asdasd");  // true
  isNaN(true);      // false
  isNaN(null);      // false
  isNaN(37);        // false
  ```

  

#### 5. isFinite()  :  전달된 값이 유한한 수인지 boolean으로 반환

* Syntax : `isFinite(value)`

  ```javascript
  isFinite(Infinity);    // false
  isFinite(NaN);         // false
  isFinite(987654321);   // true
  isFinite(0);           // true
  ```

  

#### 6. String()  :  해당 객체를 문자열로 변환하는 함수 

* Syntax : `String(value)`

  ```javascript
  var a = 5;
  typeof a;  // "number"
  var b = String(a);
  typeof b;  // "string"
  ```

  

#### 7. Number()  :  해당 객체를 숫자로 변환하는 함수
-> 단 숫자로 바꿀 수 없으면 NaN으로 변환이 된다.

* Syntax : Number(thing)

  ```javascript
  var a = "5";
  typeof a;  // "string"
  var b = Number(a);
  typeof b;  // "number"
  ```

  

#### 8. Boolean()  :  해당 객체를 논리형으로 변환하는 함수

* Syntax: `Boolean(value)`

  ```javascript
  Boolean(null);  //  false
  Boolean(5);     //  true
  Boolean("abc")  //  true
  ```

  

#### 9. escape()  :  영문 알파벳, 숫자, 일부 특수문자(@ , * , - , _ , . , /) 를 제외한 모든 문자를 인코딩함
```javascript
var set1 = ";,/?:@&=+$";  
var set2 = "-_.!~*'()";   
var set3 = "ABC abc 123";
escape(set1);   //   %3B%2C/%3F%3A@%26%3D+%24
escape(set2);   //   -_.%21%7E*%27%28%29
escape(set3);   //   ABC%20abc%20123
```



#### 10. unescape()  :  escape() 로 인코딩된 문자를 디코딩함
```javascript
unescape("%3B%2C/%3F%3A@%26%3D+%24"); // ";,/?:@&=+$"
```



#### 11. encodeURI()  : A-Z a-z 0-9 ; , / ? : @ & = + $ - _ . ! ~ * ' ( ) # 를 제외한 나머지 문자를 escape함
```javascript
var set1 = ";,/?:@&=+$";  
var set2 = "-_.!~*'()";   
var set3 = "ABC abc 123";
encodeURI(set1);     //   ;,/?:@&=+$
encodeURI(set2);     //   -_.!~*'()
encodeURI(set3);     //   ABC%20abc%20123
encodeURI("가나다");  //  %EA%B0%80%EB%82%98%EB%8B%A4
```



#### 12. decodeURI()  :  encodeURI()로 인코딩된 문자를 디코딩함
```javascript
decodeURI(";,/?:@&=+$");                  //  ;,/?:@&=+$
decodeURI("%EA%B0%80%EB%82%98%EB%8B%A4")  //  가나다
```



#### 13. encodeURICoponent()  :  A-Z a-z 0-9 - _ . ! ~ * ' ( ) 를 제외한 나머지 문자를 escape함
```javascript
var set1 = ";,/?:@&=+$";  
var set2 = "-_.!~*'()";   
var set3 = "ABC abc 123";
encodeURIComponent(set1);    //   %3B%2C%2F%3F%3A%40%26%3D%2B%24
encodeURIComponent(set2);    //   -_.!~*'()
encodeURIComponent(set3);    //   ABC%20abc%20123
encodeURIComponent("가나다")  //   %EA%B0%80%EB%82%98%EB%8B%A4
```



#### 14. decodeURIComponent()  :  encodeURICoponent()로 인코딩된 문자를 디코딩함
```javascript
decodeURIComponent("%3B%2C%2F%3F%3A%40%26%3D%2B%24")  //  ;,/?:@&=+$
decodeURIComponent("%EA%B0%80%EB%82%98%EB%8B%A4")     //  가나다
```

