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