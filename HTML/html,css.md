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



* Position

1. relative
2. absolute
3. fixed

> [MDN Position 문서](https://developer.mozilla.org/ko/docs/Web/CSS/position)

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