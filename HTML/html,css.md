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



#### 4. table th tr td

#### 5. dl

```html
<dl>
    <p>dl 태그는 설명 목록을 나타낸다</p>
    <dt>dt로 표기한 용어</dt>
    <dd>dd로 표기한 설명</dd>
</dl>
```

#### 6. caption

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



#### 7. figure

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



#### 8. figcaption

#### 9. href

#### 10. anchor

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

#### 23. submit

#### 24. file

#### 25. ul

#### 26. ol

#### 27. src

#### 28. div

#### 29. hr

#### 30. br



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