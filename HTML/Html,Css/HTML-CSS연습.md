# 네이버 메인 만들어보기

- [유튜브 ZeroCho TV HTML/CSS 강좌](https://www.youtube.com/watch?v=ohpjJNal2lk&list=PLcqDmjxt30Rsb8Zpgbemt-NaCOjr2WIUj)를 보고 실습하면서 작성한 글입니다.
- 처음 공부하고 있어서 부족하거나 잘못된 정보가 있을 수 있습니다. **(2019.11.13 수)**
- 조금 더 자세히 알게 되거나 수정할 부분이 있으면 바로바로 수정하겠습니다.

### HTML? CSS?

* **HTML** :  **HyperText Markup Language** 라는 의미의 웹 페이지를 위한 지배적인 마크업 언어다. HTML은 제목, 단락, 목록 등과 같은 본문을 위한 구조적 의미를 나타내는 것뿐만 아니라 링크, 인용과 그 밖의 항목으로 구조적 문서를 만들 수 있는 방법을 제공한다

  * **마크업** : HTML 마크업은 **HTML 요소**(엘리먼트, Elements)와 그들의 속성(Attributes)과 문자 기반 **데이터 형태**와 **문자 참조**와 **엔티티 참조**를 포함하는 몇 가지 핵심 구성 요소로 이루어져 있다.

    또 다른 중요한 구성 요소로는 [문서 형식 정의](https://ko.wikipedia.org/wiki/문서_형식_정의)(DTD, Document Type Definition)를 명시하는 [문서 형식 선언](https://ko.wikipedia.org/wiki/문서_형식_선언)(document type declaration)이다.

    [[출처]위키백과 HTML](https://ko.wikipedia.org/wiki/HTML)

    

* **CSS** : **종속형 시트** 또는 **캐스케이딩 스타일 시트**(Cascading Style Sheets, CSS)는 [마크업 언어](https://ko.wikipedia.org/wiki/마크업_언어)가 실제 표시되는 방법을 기술하는 언어로 [HTML](https://ko.wikipedia.org/wiki/HTML)과 [XHTML](https://ko.wikipedia.org/wiki/XHTML)에 주로 쓰이며, [XML](https://ko.wikipedia.org/wiki/XML)에서도 사용할 수 있다. [W3C](https://ko.wikipedia.org/wiki/W3C)의 표준이며, 레이아웃과 스타일을 정의할 때의 자유도가 높다.

  [마크업 언어](https://ko.wikipedia.org/wiki/마크업_언어)가 웹사이트의 몸체를 담당한다면 **CSS**는 옷과 액세서리 같은 꾸미는 역할을 담당한다고 할 수 있다. 즉, HTML 구조는 그대로 두고 CSS 파일만 변경해도 전혀 다른 웹사이트처럼 꾸밀 수 있다.

  [[출처]위키백과 CSS](https://ko.wikipedia.org/wiki/%EC%A2%85%EC%86%8D%ED%98%95_%EC%8B%9C%ED%8A%B8)

### 목표

HTML, CSS 기본기가 부족하기 때문에 이를 다지기 위한 연습



### 실습

개발자 도구 **Console** 에서 다음 코드를 입력하면 CSS를 제외한 화면이 나온다.

* CSS를 head에 적기 때문에 head를 제외하게 되면 css가 적용이 되지 않는 것.

```javascript
document.head.parentNode.removeChild(document.head);
```

```html
<input type="checkbox" /> <!-- checkbox : 선택해도 되고 -->
<input type="checkbox" />
<input type="radio" name="group"/>  <!-- radio : 양자택일/ 다중택일 -->
<input type="radio" name="group"/>
```



레이아웃 구조를 짤 때 가로먼저 나누고 세로로

div - 구역들을 나누는 태그  너비 100퍼센트

**시맨틱태그**



```html
<div style="margin: 0 auto; width: 1080px;"> <!-- 가운데 정렬용 div -->
    <!-- 속성명: 속성값; 속성명2: 속성값2; -->
    <!-- 인라인 스타일: html 안에 css를 적는 방식  추천X -->
</div>
```

* Console 창에서 아래 코드를 치면 자신의 모니터 픽셀을 알려준다.

```Console
screen.width
```

```
screen.height
```

```
div {
	display : block; 
}
이러한 옵션이 있으면 너비를 전체 차지한다    margin이 있다.
div 태그는 default 값으로 display : block; 가 되어 있다.
inline은 컨텐츠 내용만 차지   (span 태그는 default 값으로 되어 있다)
inline-block 는 px 지정 가능
```

이미지스프라이트 기법

하나의 태그는 margin(주황색으로 표시되는 부분)-border(테두리)-padding-content 로 구성된다.

```css
#header-search fieldset {
  width: 470px;
  height: 45px;
  display: inline-block;
  border: 2px solid #03cf5d;
  box-sizing: border-box;  /* content 뿐만 아니라 패딩, 보더까지 포함*/
}

```
정리필요

* mdn 사이트
  * 컨테이닝 블록의 모든 것 [mdn](https://developer.mozilla.org/ko/docs/Web/CSS/All_about_the_containing_block)
  * Block formatting context(블록 서식 문맥) [mdn -block formatting context](https://developer.mozilla.org/ko/docs/Web/Guide/CSS/Block_formatting_context)
  * Stacking context(쌓임 맥락) [mdn-쌓임 맥락](https://developer.mozilla.org/ko/docs/Web/CSS/Understanding_z-index/The_stacking_context)



포지션 : 모든 태그들은 기본적으로 static 포지션을 사용한다. - 정적인 포지션

* static
* relative : 상대적인, 비교대상이 필요 (static의 위치 기준으로 움직인다.)
* absolute : 절대적인, 화면을 기준으로 위치(containing block을 기준으로 움직인다.)
* fixed : 고정되어 있어서 스크롤을 내려도 그 위치에 그대로 따라오는 것.



CSS 우선순위

* 기본적으로 뒤에 나오는 css가 우선순위가 높다

* !important > inline style attribute > id > class =다른 attribute > tag element
* 우선순위가 같다면 개수가 많은 css가 우선순위가 높다.



float

overflow: visible  - 자식이 넘쳐서 나온다

overflow: hidden - 자식이 부모보다 길면 그 긴 부분만큼 잘라버림

overflow:auto  - 자식이 부모보다 길면 스크롤바를 생성





nth-child(모든 형제들 중에서 순번)  VS nth-of-type(같은 타입의 형제들 중에서 순번)



### 실습을 마치며

### 참고

* [유튜브 ZeroCho TV HTML/CSS 무료강좌](https://www.youtube.com/watch?v=ohpjJNal2lk&list=PLcqDmjxt30Rsb8Zpgbemt-NaCOjr2WIUj)
* [위키백과 HTML](https://ko.wikipedia.org/wiki/HTML)
* [위키백과 CSS](https://ko.wikipedia.org/wiki/%EC%A2%85%EC%86%8D%ED%98%95_%EC%8B%9C%ED%8A%B8)

