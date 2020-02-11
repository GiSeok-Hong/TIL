# JavaScript

- [Nomad Coder님의 바닐라 JS로 크롬 앱 만들기](https://academy.nomadcoders.co/courses/435558/lectures/6689830)를 보고 실습하면서 작성한 글입니다.
- 처음 공부하고 있어서 부족하거나 잘못된 정보가 있을 수 있습니다. **(2020.02.07 금)**
- 조금 더 자세히 알게 되거나 수정할 부분이 있으면 바로바로 수정하겠습니다.



### JavaScript이란?

웹에 쓰이는 하나 뿐인 프로그래밍 언어

* Front-end에서 웹사이트를 만들고 싶을 때 그 웹사이트를 interactive 로 만들고 싶을 때 사용

* JavaScript는 언어, ECMAScript (ES) 는 specification(설명문) 으로 생각하자.
* Vanilla JS : 브라우저를 통해 우리에게 제공된 JS라고 생각하면 된다.



### 목표

크롬 앱 중 하나인 **MOMENTUM** 의 카피앱을 만든다.

* 구현할 기능은 배경사진, 문구, 날씨, 할일 목록, 시계



### 연습

1-6

>Variables (변수)
>
>* 변경되거나 변경될 수 있는 것
>
>instructions (명령)
>
>Expression (표현식) 
>
>* 무언가를 표현하는 수식
>
>* 변수(Varialbe)와 상수(Constant), 연산자(Operator)로 이루어진 식을 의미
>
>변수 선언
>
>* let
>
>* var

1-7

> let
>
> * 블록 범위(scope) 지역 변수를 선언. 추가로 동시에 값을 초기화
> * 지역변수
>
> ```javascript
> if (true) {
>   let y = 5;
> }
> console.log(y); // ReferenceError: y is not defined
> ```
>
> const 
>
> * 블록 범위 읽기 전용 상수를 선언
>
> var
>
> * 변수를 선언. 추가로 동시에 값을 초기화
> * 전역변수
>
> ```javascript
> if (true) {
>   var x = 5;
> }
> console.log(x); // 5
> ```

1-10

>Array : 배열
>
>```javascript
>const hongArray = [];
>```
>
>Object : 각 value에 이름을 줄 수 있다. 실제 객체를 생성
>
>```javascript
>const hongObject = {
>	name: "hong",
>	age: "22"
>}
>```
>
>

2-1

> function : 기능적인 부분
>
> argument : 매개변수
>
> parameter

2-2

> DOM ( Document Object Module )

2-3

> querySelector : 노드의 첫번째 자식을 반환

2-5

> ```javascript
> if(condition) {
> 	block
> } else {
>     block
> }
> ```
>
> 

### 실습

3-1

```js
const date = new Date()
```

console 창에서 연습을 많이 해보자...

3-2

```javascript
setInterval(function, 1000)
```

* setInterval
  * 두 개의 인자를 받는데 첫 번째 인자는 실행할 함수, 두 번째 인자는 실행할 시간 간격

3-3

```javascript
// ex
localStorage.setItem("hong", true)
localStorage.getItem("hong")  // true
```

* localStorage
  * 작은 정보를 유저 컴퓨터에 저장하는 방법
  * localStorage에는 자바스크립트의 data를 저장할 수 없다. String 만 가능 (3-6에서 추가)

3-6

```javascript
function saveToDos(){
  localStorage.setItem(TODOS_LS, JSON.stringify(toDos));
}
```

* JSON.stringfy
  * 자바스크립트 object를 string 으로 바꿔준다.
* JSON (JavsScript Object Notation)
  * 데이터를 전달할 때, 자바스크립트가 데이터를 다룰 수 있도록 object로 바꿔주는 기능
* array.forEach()
  * array에 담겨있는 것들 각각에 한 번씩 함수를 실행시키는 것



### 참고

* [Nomad Coder - 바닐라 JS로 크롬 앱 만들기](https://academy.nomadcoders.co/courses/435558/lectures/6689830)
* [Nomad Coder님의 GIthub](https://github.com/serranoarevalo/momonton)
* [가상현실과 현실사이님의 글](http://egloos.zum.com/kjlife/v/2332939)
* [MDN - JavaScript 문법과 자료형](https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/Values,_variables,_and_literals)