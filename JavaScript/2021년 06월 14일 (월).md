# 2021년 06월 14일 (월)

[참고] [자바스크립트 수업 순서](https://blog.naver.com/ysboo2/221718061667)

[참고] [**배열의 크기, 추가, 제거**](https://blog.naver.com/ysboo2/221536075368)



* 배열의 길이

```javascript
var arr = [1, 2, 3, 4, 5];


alert(arr.length);
```

* push(); - 배열의 가장 뒤에 추가

```javascript
var li = ['a', 'b', 'c', 'd', 'e'];


li.push('f');

alert(li); /* ['a','b','c','d','e','f'] */

```

* unshift(); - 배열의 가장 앞에 추가

```javascript
var li = ['a', 'b', 'c', 'd', 'e'];


li.unshift('z');

alert(li); /* ['z', 'a','b','c','d','e'] */
```

* concat(); - 2개 이상을 추가

```javascript
var li = ['a', 'b', 'c', 'd', 'e'];


li = li.concat(['f', 'g']);

alert(li); /* ['a','b','c','d','e','f','g'] */
```

* splice(); - 

```javascript
var li = ['a', 'b', 'c', 'd', 'e'];


li.splice(2, 0, 'B');

alert(li); /* ['a', 'b', 'B','c', 'd', 'e'] */
```

* shift() - 배열의 가장 앞 제거

```javascript
var li = ['a', 'b', 'c', 'd', 'e'];


li.shift();

alert(li);  /*  ['b', 'c', 'd', 'e'];  */
```

* pop() - 배열의 가장 뒤 제거

```javascript
var li = ['a', 'b', 'c', 'd', 'e'];


li.pop();

alert(li);  /* ['a', 'b', 'c', 'd']; */
```

* sort(); - 배열의 정렬

```javascript
var li = ['c', 'e', 'a', 'b', 'd'];


li.sort();

alert(li);  /* ['a', 'b', 'c', 'd', 'e']; */
```

* reverse() - 배열의 역순서로 정렬

```javascript
var li = ['c', 'e', 'a', 'b', 'd'];


li.reverse();

alert(li);  /* ['d','b','a','e','c'] */
```



* 배열을 생성하는 방법

1. [] 스퀘어 브라켓을 사용

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 배열 만들기1</title>
  </head>
  <body>

    <script>
      var menu = ["한식", "중식", "일식", "양식"];
      for (var i = 0; i < menu.length; i++){
        document.write(menu[i] + "<br>");
      }

    </script>
  </body>
</html>
```

2. new Array() 를 사용

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21.홍기석 배열 만들기2</title>
  </head>
  <body>

    <script>
      var people = new Array ("kim", "lee", "park", "kwon", "hong");
      for (var i in people){
        document.write(people[i] + "<br>");
      }

    </script>
  </body>
</html>

```



