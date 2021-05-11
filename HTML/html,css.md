# HTML & CSS

## HTML

* 번호는 자주쓰는 빈도와 관련 없음.

#### 1. blockquote

```html
<p>
    blockquote 태그는?
<blockquote>인용문을 나타냄</blockquote>
</p>
```

#### 2. pre

```html
<pre>
pre 태그는 작    성한   그대로
보여준다
</pre>
```

#### 3. ruby

```html
루비(Ruby)는 1995년, 일본의 프로그래머인 마츠모토 유키히로 (<ruby>松本行弘<rt>まつもとゆきひろ</rt>)</ruby>가 만든 프로그래밍 언어입니다. 동아시아 문자의 발음을 표기할 때 사용
<ruby>漢子<rt>한자</rt></ruby>
```

#### 4. table / th / tr / td / caption

```html
<table border="1">
	<caption>caption 표 제목</caption>
	<tr>
		<th>th1</th>
		<td>td1</td>
		<td>td2</td>
	</tr>
	<tr>
		<th>th2</th>
		<td>td3</td>
		<td>td4</td>
	</tr>        
</table>
```

#### 5. dl

```html
<dl>
    <p>dl 태그는 설명 목록을 나타낸다</p>
    <dt>dt로 표기한 용어</dt>
    <dd>dd로 표기한 설명</dd>
</dl>
```

#### 6. strong / b / em / i

```html
<strong>strong 태그는 중대하거나 긴급한 콘텐츠를 나타낸다.</strong>
<br>
<b>b 태그는 독자의 주의를 끌기 위한 용도로 사용</b>
<br>
<em>em 태그는 약간의 강조가 필요한 글. 텍스트의 강세를 나타냄</em>
<br>
<i>i태그는 텍스트에서 어떤 이유로 주위와 구분해야 하는 부분을 나타냄. 기술용어, 외국어 구절, 등장인물의 생각 등을 예시로 들 수 있다.</i>
```

#### 7. figure / figcaption

```html
      <figure>
        <table border="1">
          <tr>
            <th>th1</th>
            <td>td1</td>
            <td>td2</td>
          </tr>
          <tr>
            <th>th2</th>
            <td>td3</td>
            <td>td4</td>
          </tr>        
        </table>
        <figcaption>
          figcaption은 figure가 포함하는 다른 콘텐츠에 대한 설명 혹은 범례를 나타냄
        </figcaption>
      </figure>
```



#### 9. href

* <a> 태그의 href 속성은 링크된 페이지의 URL을 명시

```html
<a href="https://www.naver.com">네이버 사이트로 이동!</a>
```



#### 10. anchor

* 웹 문서가 너무 길 경우 필요한 곳마다 문서 안에 이름을 붙여놓고 그 위치로 한번에 이동하는 링크를 만들 수 있는데, 이 기능을 앵커(anchor)라고 합니다



#### 11. input

#### 12. button

#### 13. select

#### 14. textarea

#### 15. option

#### 16. fieldset

#### 17. radio

#### 18. checkbox

#### 19.  label

#### 20. name

#### 21. value

#### 22. password

```html
password : <input type="password" name="password" maxlength="12">
```



#### 23. submit

```html
<input type="submit" value="Submit">
```



#### 24. file

파일 불러오기 버튼 생성

```html
<input type="file">
```



#### 25. ul

```html
 <ul>
    ul은 순차적이지 않은 목록 unordered list
    <li>list item</li>
    <li>list item</li>
    <li>list item</li>
  </ul>
```
#### 26. ol

```html
  <ol>
    ol은 순차적인 목록 order list
    <li>list item</li>
    <li>list item</li>
    <li>list item</li>        
  </ol>
```
#### 27. src

#### 28. div

#### 29. hr

```html
<p>
hr은 이야기 장면 전환, 구획 내 주제 변경 등, 문단 레벨 요소에서 주제의 분리를 나타냄
사용시 가로선이 보임
</p>
<hr>
```

#### 30. br

```html
<p>
	줄 바꿈 <br>
	
</p>
```





## CSS

#### css 사용

1. 인라인 방식 - 적용 원하는 곳에 직접적으로 사용

```html
<body>
<h1 style="font-size:30px; color:blue;">CSS 사용하기</h1>
</body>


```



2. 임베디드 방식 - head에 style을 작성

```html
<head>
    <style>
        h2 {font-size:30pt; color:Red;}
    </style>
</head>
<body>
<h2>CSS 사용하기</h2>
</body>
```



3. 링크 방식 - html 파일과 css 파일을 나눠서 작성

```html
// html 파일
<head>
    <link href="css/main.css" rel="stylesheet">
</head>
<body>
    <h3>CSS 사용하기</h3>
</body>
```

```css
// css 파일
@charset "UTF-8";
h3 {font-size:30pt; color:purple;}

//
rel (relation) 링크된 문서와의 관계를 의미
```



선택자

* id는 고유값(#으로 표현) / class는 중복 가능(.으로 표현)
* 우선순위 (id > class > tag)
* 1대 자식 : >
  동생들 : ~
  바로 밑 동생 : +
* first-child / nth-child / last-child

웹표준의 세가지 계층

* css **표현** 계층 - "어떻게 보이는 가?"       	 		presentation

* javascript **계층** 동작 - "어떤 동작을 하는가?"	 behavior

* html, xhtml **구조 계층** - "무슨 의미인가?"		  structure

> html 구조 계층은 모든 웹페이지에 필수적이다.
>
> html이 없으면 웹페이지도 없다.
>
> css와 java script는 필수 계층이 아니다
>
> 동작 계층이나 표현계층이 없더라도 사용할 수 있어야 한다.
>
> 표현 계층은 .css파일로 동작 계층은 .js 파일로 분리해야 한다
>
> 접근성과 사용성에도 적극적이어야 한다.
>
> 마우스가 없어도 키보드 만으로도 사용되어져야 한다.



* **Position**
  * 모든 태그들은 처음에 position:static 상태 (차례대로 왼쪽에서 오른쪽, 위에서 아래로 쌓임)
  * 겹쳤을 경우 태그는 같은 position이면 나중에 나온 태그가 더 위에 배치된다.

1. relative
   - 태그의 위치를 변경하고 싶을 때 사용. static인 상태를 기준으로 top, right, bottom, left 속성을 사용해 **위치 조절이 가능** 
   - relative는 각각의 방향을 기준으로 태그 안쪽 방향으로 이동. 바깥쪽으로 이동하고 싶으면 음수를 주면 된다.
2. absolute
   * **position:static 속성을 가지고 있지 않은 부모를 기준**으로 움직인다.
   * 부모 중에 포지션이 relative, absolute, fixed인 태그가 없다면 가장 위의 태그(body)가 기준이 된다.
   * absolute가 되면 div여도 더는 width:100%가 아니다.
3. fixed
   * 특정 위치에 고정
   * fixed도 absolute처럼 더는 div가 width:100%가 아니다.

> [MDN Position 문서](https://developer.mozilla.org/ko/docs/Web/CSS/position)
>
> [zerocho css 포지션](https://www.zerocho.com/category/CSS/post/5864f3b59f1dc000182d3ea1)



* display:none VS opacity:0

-> 둘다 화면에서 보이지 않게 하지만 display:none은 해당 컨텐츠가 차지하고 있던 공간까지 사라지고 opacity:0 은 보이지 않지만 공간은 그대로 유지된다.

* overflow:hidden - 넘치는 부분은 나오지 않음

연습

```html
<!DOCTYPE html>
<html>
  <head>
    <title>21번 홍기석</title>
    <style>
      #imgbox {width:500px; height:400px; background-color:yellow; border-radius:20px; overflow:hidden; position:relative;}
      
      #imgbox > img {width:100%; height:100%; position:absolute; top:0; left:0;}
      #imgbox > img:not(:first-child) {display:none;}
      
      input[value="축구"]:checked ~ #imgbox img[alt="축구"] {display:block;}
      input[value="농구"]:checked ~ #imgbox img[alt="농구"] {display:block;}
      input[value="야구"]:checked ~ #imgbox img[alt="야구"] {display:block;}
      input[value="배구"]:checked ~ #imgbox img[alt="배구"] {display:block;}
      
      
    </style>
  </head>
  <body>
    
	<input type="radio" name="sports" value="축구" checked><span>축구</span>
    <input type="radio" name="sports" value="농구"><span>농구</span>
    <input type="radio" name="sports" value="야구"><span>야구</span>
    <input type="radio" name="sports" value="배구"><span>배구</span>

	<div id="imgbox">
      <img src="https://images.unsplash.com/photo-1522778119026-d647f0596c20?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8c29jY2VyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="축구">
      <img src="https://images.unsplash.com/photo-1546519638-68e109498ffc?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmFza2V0YmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="농구">
      <img src="https://images.unsplash.com/photo-1578432014316-48b448d79d57?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmFzZWJhbGx8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="야구">
      <img src="https://images.unsplash.com/photo-1593787406536-3676a152d9cb?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dm9sbGV5YmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="배구">
    </div>

  </body>
</html>

```

* **실수 했던 점**

`input[value="spring"]:checked ~ #imgbox img[alt="봄"] {display:block;}` 에서 

`input [value="spring"]` 와 같이 <u>**띄어쓰기**</u>를 하게 되면 작동하지 않는다.



margin은 음수값을 가진다 padding은 음수값을 가질 수 없다

Block 요소 - 새로운 블록이 만들어지는 태그, 해당 태그가 적용된 부분의 앞뒤로 줄 바꿈이 된다.

Inline - 요소줄 바꿈이 생기지 않는 태그, 자신만의 영역을 갖지 않는 태그

opacity: 1에서 0으로 갈수록 사라짐

background-size : 

* contain : 해당 범위를 넘지 않는 선에서 최대 비율로 보여줌
* cover: 해당 범위를 꽉 채운다 (안 보이는 부분이 나타날 수 있음)

box-shadow / text-shadow : x축 y축 번짐 색깔 순     [MDN box-shadow](https://developer.mozilla.org/ko/docs/Web/CSS/box-shadow)

* ex) .sbox1 {box-shadow:4px 4px 4px #eee;}
* ex) .tbox1 {text-shadow:4px 4px 4px #000; 

rgba(빨,초,파,불투명도)

* ex) #p1 {background-color:rgba(255,0,0,0.3);}

---



1. **block의 tag 종류**

```
<div>, <h1>~<h6>, <table>, <form>, <p>, <pre>, <hr>, <ul>, <ol>, <address>, <article>, <aside>, <blockquote>, <canvas>, <dl>, <dd>, <header>
```

2. **inline 속성 tag 종류**

```
<span>, <a>, <img>, <b>, <input>, <button>, <sub>, <sup>, <br>, <i>, <abbr>, <strong>, <b>, <em>, <small>, <textarea>, <label>
```

3. **음수를 쓸 수 있는 것은? margin?    padding?**

   -> `margin`

4. **div에 투명도 40%를 사용하려면?**　

   -> `div {opacity:0.4;}`

5. **box의 크기를 border를 기준으로?**     -> `.box {box-sizing:border-box;}`

​       **box의 크기를 콘텐츠 영역기준으로?**   -> `.box {box-sizing:content-box;}`

6. **div box 그림자 값과? 글자 그림자 값을 주려면?** 

박스 그림자 값 -> `div {box-shadow:4px 4px 4px red;}  * x축으로 4px y축으로 4px 번짐 4px 빨강`

글자 그림자 값 -> `div {text-shadow:4px 4px 4px red;}`

​    

7. **h1의 background-color의 빨강색, 투명도 30%; 주려면 ?** 

   -> `h1 {background-color:red; opacity:0.3;}`

​       **rgba 값으로 표현?** 

​       -> `h1 {background-color:rgba(255,0,0,0.3);}`



8. **h1의 background gradient값을  red에서 green으로 주려면?**

​       -> `h1 {background:linear-gradient(red, green);}`

​       **가로로 값을 주려면?**

​	   -> `h1 {background:linear-gradient(to right, red, green);}`

​    

9. **box의 배경이미지 apple.png가 한 개만 나오고 정 중앙에 위치하려면?**

   -> `.box {background-image:url(img/apple.png); background-repeat:no-repeat; background-position:center; /또는 background-position:50% 50%;} `

​      **apple.png이미지가 왼쪽 끝에만 반복되려면?**

​	   -> `.box {background-image:url(img/apple.png); background-repeat:repeat-y;}`

​     **양쪽으로 apple.png와 tomato.png 이미지가 반복되려면?**

​	  -> `.box {background-image:url(img/apple.png), url(img/apple.png); background-repeat:repeat-y; background-position:top left, top right;}`

  

10. **cursor의 모양이 손가락 모양이려면?** 

    -> `{cursor:pointer;}`

11. **box 배경이미지 조정**   

​       **너비와 높이가 안쪽에 알맞은 방식으로 이미지가 다 들어오게 하는 값은?** 

​	  -> `.box {background-size:contain;}`

​      **배경이미지가 배경 안에 완전히 덮이도록 하는 값은?**

​	  -> `.box {background-size:cover;}`

​    

12. **이미지에 마우스가 올라가면 크기가 커지도록 하는 값은?** -> `img:hover {transform:scale(1.5);}`

​       **이미지에 마우스가 올라가면 투명도가 달라지는 값은?** -> `img:hover {opacity:0.5;}`

​       **이미지에 마우스가 올라가면 사각형의 모양이 굴곡이 지는 값은?**-> `img:hover {border-radius:30%}`

​    

13. **box안에 들어가는 이미지 또는 text의 높이가 길어져도 보이지 않게 하는 값은?**

    -> `.box {overflow:hidden;}`

---

[[nth-of-type과 nth-child의 차이]](https://blog.naver.com/ysboo2/221533512193)

* nth-child(n) 

-> 부모 엘리먼트의 **모든 자식** 엘리먼트 중 **n번째**

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>
    <style>
      .box > p:nth-child(5){ color:red;}
    </style>
  </head>
  <body>
    <div class="box">
      <p>1. p태그1</p>
      <span>2. span태그1</span>
      <p>3. p태그2</p>
      <span>4. span태그2</span>
      <p>5. p태그3</p>             <!-- 빨간색 -->
    </div>
  </body>
</html>
```



* nth-of-type(n)

-> 부모 엘리먼트의 **특정(type) 자식** 엘리먼트 중 **n번째**

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>
    <style>
      .box > p:nth-of-type(3){color:blue;}
    </style>
  </head>
  <body>
    <div class="box">
      <p>1. p태그1</p>
      <span>2. span태그1</span>
      <p>3. p태그2</p>
      <span>4. span태그2</span>
      <p>5. p태그3</p>   <!-- 파랑색 -->
    </div>
  </body>
</html>

```





#### 가상 선택자

CSS에는 가상 요소와 가상 클래스가 있다. 이것들을 사용해서 html 문서의 수정 없이 CSS만으로 디자인적 요소를 추가할 수 있어 html 문서에 쓸데없는 태그를 사용하지 않게 한다.



[[가상클래스 / 가상요소]](https://blog.naver.com/ysboo2/221642367935)

* 가상 요소

  * 선택자에 추가하는 키워드로 선택한 요소의 일부분에만 스타일을 입힌다.

  * 실제로 존재하지 않는 요소를 만들게 해줌.

  * `선택자::가상요소 {property:value;}`

    | 종류           | 예시                         | 내용                                           |
    | -------------- | ---------------------------- | ---------------------------------------------- |
    | ::first-line   | p:first-line {color:#fff;}   | 문단의 첫 줄의 색을 흰색으로 변경              |
    | ::first-letter | p:first-letter {color:#fff;} | 문단의 첫 글자의 색을 흰색으로 변경            |
    | ::before       | p:before {content:"시작";}   | 문단 시작 부분에 "시작"이라는 요소 추가        |
    | ::after        | p:after {content:"끝";}      | 문단 끝 부분에 "끝"이라는 요소 추가            |
    | ::selection    | p:selection {color:#fff;}    | 드래그로 선택하였을 때 글씨 색을 흰색으로 변경 |

    

* 가상 클래스

  * `선택자:가상클래스 {property:value;}`
  
  * 특정 상태에 스타일을 적용할 때 사용한다. 
  
  * 실제로 존재하는 요소에 클래스 추가 없이 디자인을 입히기 위한 것.
  
    | 종류           | 예시                           | 내용                                                     |
    | -------------- | ------------------------------ | -------------------------------------------------------- |
    | :first-child   | li:first-child {color:#fff}    | li 자식 요소 중 첫 번째 자식 요소의 색을 흰색으로 변경   |
    | :last-child    | li:last-child {color:#fff}     | li 자식 요소 중 마지막 자식 요소의 색을 흰색으로 변경    |
    | :nth-child()   | li:nth-child(2) {color:#fff;}  | li 자식 요소 중 2번째 자식 요소의 색을 흰색으로 변경     |
    | :nth-of-type() | p:nth-of-type(2) {color:#fff;} | 자식 요소 중 p 태그 2번째 자식 요소의 색을 흰색으로 변경 |
  
    





clear:both



**border-spacing** : 

* 표(table)의 테두리와 셀(td)의 테두리 사이의 간격을 정합니다.







**border-collapse** : separate | collapse | initial | inherit

* 표(table)의 테두리와 셀(td)의 테두리 사이의 간격을 어떻게 처리할 지 정합니다.

**separate** : 표(table)의 테두리와 셀(td)의 테두리 사이에 간격을 둡니다.

**collapse** : 표(table)의 테두리와 셀(td)의 테두리 사이의 간격을 없앱니다. 겹치는 부분은 한 줄로 나타냅니다.

**initial** : 기본값으로 설정합니다.

**inherit** : 부모 요소의 속성값을 상속받습니다.





 

* 연습1 이순신 예제 (jquery 연습)

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>
    <meta charset="utf-8">
    <style>
      * {margin:0; box-sizing:border-box;}
      #wrap {width:500px; height:650px; border:1px solid #666; margin:20px; text-align:center;}

      #box1 {width:100%; height:500px; background-color:gold; }
      #box2 {width:100%; height:500px; background-color:green; display:none;}
      #box3 {width:100%; height:500px; background-color:tomato; display:none;}
      #box4 {width:100%; height:500px; background-color:blue; display:none;}
      img {width:300px; height:250px; margin-top:10px;}
      .textbox {background-color:#fff; width:100%; height:200px; padding:20px; text-align:left;}
      button {width:60px; height:40px; margin:10px; cursor:pointer;}
    </style>

    <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.6.0.min.js"></script>

    <script>
      $(document).ready(function(){
        $("button:nth-of-type(1)").click(function(){
          $("#box1").fadeIn();
          $("#box2").hide();
          $("#box3").hide();
          $("#box4").hide();
        });
        $("button:nth-of-type(2)").click(function(){
          $("#box2").fadeIn();
          $("#box1").hide();
          $("#box3").hide();
          $("#box4").hide();
        });
        $("button:nth-of-type(3)").click(function(){
          $("#box3").fadeIn();
          $("#box1").hide();
          $("#box2").hide();
          $("#box4").hide();
        });
        $("button:nth-of-type(4)").click(function(){
          $("#box4").fadeIn();
          $("#box1").hide();
          $("#box2").hide();
          $("#box3").hide();
        });
      });
    </script>
  </head>
  <body>


    <div id="wrap">

      <h1>한국의 계절</h1>
      <div id="box1">
        <img src="https://images.unsplash.com/photo-1462275646964-a0e3386b89fa?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8c3ByaW5nfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="봄">
        <div class="textbox">
          <h2>봄</h2>
          <p>기상학에서는 기온 변화에 따라 계절을 구분한다. 일 평균 기온이 5도 이상으로 올라가 9일간 유지될 때, 그 첫 번째 날을 봄의 시작일로 정의한다.</p>
        </div>
      </div>

      <div id="box2">
        <img src="https://images.unsplash.com/photo-1541417904950-b855846fe074?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mjh8fHN1bW1lcnxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="여름">
        <div class="textbox">
          <h2>여름</h2>
          <p>기상학에서는 기온 변화에 따라 계절을 구분한다. 대한민국 기상청은 여름의 시작을 일평균 기온이 20도 이상으로 올라간 뒤 다시 떨어지지 않는 첫날로 정의하며, 나흘 전부터 나흘 후까지 9일 동안의 평균 기온이 이틀 연속 유지될 때를 기준으로 한다.</p>
        </div>
      </div>

      <div id="box3">
        <img src="https://images.unsplash.com/photo-1507371341162-763b5e419408?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8ZmFsbHxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="가을">
        <div class="textbox">
          <h2>가을</h2>
          <p>기상학에서는 기온 변화에 따라 계절을 구분한다. 일 평균 기온이 20도 이하로 내려가 9일간 유지될 때, 그 첫 번째 날을 가을의 시작일로 정의한다.</p>
        </div>
      </div>

      <div id="box4">
        <img src="https://images.unsplash.com/photo-1455156218388-5e61b526818b?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8d2ludGVyfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60" alt="겨울">
        <div class="textbox">
          <h2>겨울</h2>
          <p>기상학에서는 기온 변화에 따라 계절을 구분한다. 일 평균 기온이 5도 이하로 내려가 9일간 유지될 때, 그 첫 번째 날을 겨울의 시작일로 정의한다.</p>
        </div>
      </div>


      <button>봄</button>
      <button>여름</button>
      <button>가을</button>
      <button>겨울</button>

    </div>

  </body>
</html>

```

* 연습2  동영상 넣기

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Video 연습</title>

    <style>
      * {margin:0; box-sizing: border-box;}
      video {position: absolute; top:0; left:0; min-width: 100%; min-height:100%;}
      .textbox {position: absolute; top:50%; left:50%; width:500px; height:400px; border:20px solid gold; padding:30px; margin:-200px 0 0 -250px;}
      h1 {font-size: 45px; color: #fff;}
      p {font-size: 25px; color: #fff;}
      button {width:30%; height:40px; background-color: gold; cursor: pointer; float: right; border:none; border-radius: 10px; margin:30px 0 0 0;}
      button:hover {opacity: 0.7;}
    </style>  

  </head>
  <body>
    <video src="video/01.mp4" loop muted autoplay></video>  

    <div class="textbox"> 
      <h1>NATIONAL<br>GEOGRAPHIC</h1>
      <p>Amazon Jungle Documentary<br>
        National Geographic</p>
      <button type="button">click</button>
    </div>




  </body>
</html>
```

* 연습3 미디어쿼리 연습

  @media all and(min-width:320px){실행문}

  @media all and(min-width:768px){실행문}

  @media all and(min-width:1024px){실행문}

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <style>
      * {margin:0; box-sizing:border-box;}

      @media (max-width:399px){
        header {width:100%; height:200px; margin:0 auto; background-color:gold;}
      }

      @media (min-width:400px){
        header {width:100%; height:200px; margin:0 auto; background-color:tomato;}
      }

      @media (min-width:500px){
        header {width:500px; height:200px; margin:0 auto; background-color:green;}
      }

    </style>

  </head>
  <body>

    <header></header>

  </body>
</html>

```

* 연습4 flexbox 연습

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Page Title</title>
    <style>
      #container1 {width:450px; height:250px; background-color:gold; margin:0 auto 30px; display:flex; flex-direction:row}

      #container2 {width:450px; height:250px; background-color:silver; margin:0 auto 70px; display:flex; flex-wrap:wrap;}

      #container3 {width:450px; height:250px; background-color:skyblue; margin:0 auto 50px; display:flex; flex-flow:column wrap}

      #container4 {width:1000px; height:250px; background-color:yellowgreen; margin:0 auto 50px; display:flex; justify-content:space-between}

      #container5 {width:450px; height:250px; background-color:yellowgreen; margin:0 auto 80px; display:flex; align-items:center;}

      #container6 {width:450px; height:450px; background-color:yellowgreen; margin:0 auto 50px; display:flex; flex-wrap:wrap; align-content:space-around;}


      .box1 {width:50px; height:10px; background-color:red; }
      .box2 {width:70px; height:20px; background-color:orange; }
      .box3 {width:90px; height:30px; background-color:yellow; }
      .box4 {width:110px; height:40px; background-color:green; }
      .box5 {width:130px; height:50px; background-color:blue; }
      .box6 {width:150px; height:60px;background-color:indigo; }
      .box7 {width:170px; height:70px; background-color:purple; }

    </style>
  </head>
  <body>

    <div id="container1">
      <div class="box1"></div>
      <div class="box2"></div>
      <div class="box3"></div>
      <div class="box4"></div>
      <div class="box5"></div>
      <div class="box6"></div>
      <div class="box7"></div>
    </div>

    <div id="container2">
      <div class="box1"></div>
      <div class="box2"></div>
      <div class="box3"></div>
      <div class="box4"></div>
      <div class="box5"></div>
      <div class="box6"></div>
      <div class="box7"></div>
    </div>

    <div id="container3">
      <div class="box1"></div>
      <div class="box2"></div>
      <div class="box3"></div>
      <div class="box4"></div>
      <div class="box5"></div>
      <div class="box6"></div>
      <div class="box7"></div>
    </div>

    <div id="container4">
      <div class="box1"></div>
      <div class="box2"></div>
      <div class="box3"></div>
      <div class="box4"></div>
      <div class="box5"></div>
      <div class="box6"></div>
      <div class="box7"></div>
    </div>

    <div id="container5">
      <div class="box1"></div>
      <div class="box2"></div>
      <div class="box3"></div>
      <div class="box4"></div>
      <div class="box5"></div>
      <div class="box6"></div>
      <div class="box7"></div>
    </div>


    <div id="container6">
      <div class="box1"></div>
      <div class="box2"></div>
      <div class="box3"></div>
      <div class="box4"></div>
      <div class="box5"></div>
      <div class="box6"></div>
      <div class="box7"></div>
    </div>


  </body>
</html>

```





**flexbox**란?

flexbox는 뷰포트나 요소의 크기가 불명확하거나 동적으로 변할 때에도 효율적으로 요소를 배치, 정렬, 분산할 수 있는 방법을 제공하는 CSS3의 새로운 레이아웃 방식이다. flexbox의 장점을 한 마디로 표현하면 '복잡한 계산 없이 요소의 크기와 순서를 유연하게 배치할 수 있다'라고 할 수 있다. 정렬, 방향, 순서, 크기 등을 유연하게 조절할 수 있기 때문에 별도의 분기 처리를 줄일 수 있고, CSS만으로 다양한 레이아웃을 구현할 수 있다.

![image](https://user-images.githubusercontent.com/48499094/117775541-92475c00-b275-11eb-80dc-9e06c4088fc6.png)

display: flex 속성이 적용된 요소는 flex container가 되고, flex container의 자식 요소는 flex item이 된다. flex container와 flex item은 부모 요소와 자식 요소를 한 세트로 사용하는 ul과 li를 생각하면 쉽게 이해할 수 있다.

![image](https://user-images.githubusercontent.com/48499094/117775619-a428ff00-b275-11eb-9253-3d83794aa0b6.png)

**부모 요소와 자식 요소에 정의하는 속성 구분**

flexbox에서 사용하는 속성은 부모 요소인 flex container에 정의하는 속성과 자식 요소인 flex item에 정의하는 속성으로 나누어진다. 

|                 flex container 속성                 |                |
| :-------------------------------------------------: | -------------- |
|                flex-direction (방향)                | row            |
|                                                     | row-reverse    |
|                                                     | column         |
|                                                     | column-reverse |
|                                                     | initial        |
|                                                     |                |
|                 flex-wrap (줄바꿈)                  | nowrap         |
|                                                     | wrap           |
|                                                     | wrap-reverse   |
|                                                     | initial        |
|                                                     |                |
| flex-flow <br>(flex-direction과 flex-wrap이 합쳐짐) | row wrap;      |
|                                                     |                |
|             justify-content (x축 이동)              | flex-start     |
|                                                     | flex-end       |
|                                                     | center         |
|                                                     | space-between  |
|                                                     | space-around   |
|                                                     | space-evenly   |
|                                                     |                |
|               align-items (y축 이동)                | flex-start     |
|                                                     | flex-end       |
|                                                     | center         |
|                                                     | stretch        |
|                                                     | baseline       |
|                                                     |                |
|             align-content (여러줄 y축)              | flex-start     |
|                                                     | flex-end       |
|                                                     | center         |
|                                                     | stretch        |
|                                                     | space-between  |
|                                                     | space-around   |
|                                                     | space-evenly   |

