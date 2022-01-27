# 템플릿(Templates)

컴포넌트는 이 컴포넌트가 어떻게 렌더링될지 정의하기 위해 HTML 템플릿이 존재한다. 템플릿은 인라인으로 정의하거나 별도 파일로 작성해서 불러올 수 있다.

템플릿은 HTML 문법을 기본으로 작성하며 컴포넌트에 있는 값을 동적으로 반영하도록 구성한다. 그래서 컴포넌트의 상태가 변경되면 Angular가 자동으로 렌더링된 DOM을 갱신한다. 아래 예제 코드는 문자열을 동적으로 렌더링하는 컴포넌트의 템플릿 코드다.

```jsx
<p>{{ message }}</p>
```

이 문자열은 컴포넌트 클래스에서 전달된다.

```jsx
import { Component } from '@angular/core';

@Component ({
  selector: 'hello-world-interpolation',
  templateUrl: './hello-world-interpolation.component.html'
})
export class HelloWorldInterpolationComponent {
    message = 'Hello, World!';
}
```

애플리케이션이 컴포넌트와 템플릿을 로드하고 나면 사용자가 아래 화면을 볼 수 있다.

```jsx
<p>Hello, World!</p>
```

템플릿에 **이중 중괄호**( `{{  }}` )가 사용되었는데 이 문법은 템플릿에 **문자열을 바인딩(interpolation)하는 문법**이다.

문자열 바인딩 외에도, Angular는 HTML 엘리먼트의 **프로퍼티나 어트리뷰트에 값을 할당하는 프로퍼티 바인딩(property binding)문법**도 제공한다

```jsx
<p
  [id]="sayHelloId"
  [style.color]="fontColor">
  You can set my color in the component!
</p>
```

대괄호 ( `[ ]` )가 사용되었는데 이 문법은 컴포넌트 클래스에 있는 값을 프로퍼티나 어트리뷰트로 바인딩하는 문법이다.

키입력, 마우스 이동, 클릭, 터치 등과 같은 사용자의 동작을 감지하고 이 동작에 반응하기 위해 이벤트 리스터를 추가할 수도 있다. 감지하려는 이벤트 이름을 소괄호( `(  )` ) 로 감싸면 된다.

```jsx
<button
  [disabled]="canClick"
  (click)="sayMessage()">
  Trigger alert message
</button>
```

그리고 아래 코드는 이벤트가 발생했을 때 실행될 메서드를 컴포넌트 클래스에 구현한 코드다.

```jsx
sayMessage() {
	alert(this.message);
}
```

- 예제

```tsx
// hello-world-bindings.componet.ts

import { Component } from '@angular/core';

@Component ({
  selector: 'hello-world-bindings',
  templateUrl: './hello-world-bindings.component.html'
})
export class HelloWorldBindingsComponent {
  fontColor = 'blue';
  sayHelloId = 1;
  canClick = false;
  message = 'Hello, World';

  sayMessage() {
    alert(this.message);
  }

}
<button
  [disabled]="canClick"
  (click)="sayMessage()">
  Trigger alert message
</button>
<p
  [id]="sayHelloId"
  [style.color]="fontColor">
  You can set my color in the component!
</p>
<p>My color is {{ fontColor }}</p>
```

템플릿에 추가 기능을 구현하려면 디렉티브(directives)를 사용하면 된다.

Angular 디렉티브 중에서 가장 많이 사용되는 디렉티브는 `*ngIf` 와 `*ngfor` 가 있다

디렉티브를 활용하면 DOM 구조를 동적으로 변경할 수 있기 때문에 다양한 용도로 활용할 수 있다.

사용자 경험을 더 좋게 만드는 용도로도 커스텀 디렉티브를 활용할 수 있다.

아래 코드는 `*ngIf` 디렉티브를 사용하는 예제 코드다

```tsx
// hello-world-ngif.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'hello-world-ngif',
  templateUrl: './hello-world-ngif.component.html'
})
export class HelloWorldNgIfComponent {
  message = 'I\\'m read only!';
  canEdit = false;

  onEditClick() {
    this.canEdit = !this.canEdit;
    if (this.canEdit) {
      this.message = 'You can edit me!';
    } else {
      this.message = 'I\\'m read only!';
    }
  }
<!-- hello-world-ngif.component.html -->

<h2>Hello World: ngIf!</h2>

<button (click)="onEditClick()">Make text editable!</button>

<div *ngIf="canEdit; else noEdit">
    <p>You can edit the following paragraph.</p>
</div>

<ng-template #noEdit>
    <p>The following paragraph is read only. Try clicking the button!</p>
</ng-template>

<p [contentEditable]="canEdit">{{ message }}</p>
```

Angular는 선언적인 템플릿 문법을 사용하기 때문에 화면에 표시되는 단위로 애플리케이션 로직을 깔끔하게 분리할 수 있다. 그리고 템플릿에는 표준 HTML 문법을 활용하기 때문에 구성하기 쉽고, 관리하기도 쉬우며, 나중에 수정하기도 쉽다.



## 템플릿 문법

Angular에서 이야기 하는 템플릿(Template)은 HTML 뭉치(chunk)를 이야기 한다.

angular 템플릿은 브라우저에 표시되는 화면의 일부를 담당하는 HTML 뭉치이다.  Angular HTML 템플릿은 일반 HTML과 마찬가지로 화면을 렌더링하고, 사용자와 상호작용하는 것 외에도 다양하게 활용할 수 있다.

Angular CLI로 Angular 앱을 생성하면 기본 컴포넌트가 생성되면서 이 컴포넌트의 템플릿 파일 `app.component.html` 파일도 함께 생성된다.



## HTML 확장하기

템플릿에 Angular 문법을 사용하면 기존 HTML의 기능을 확장할 수 있다. 템플릿 함수, 템플릿 참조 변수, 이벤트 감지, 데이터 바인딩과 같은 기능을 사용해서 DOM(Document Object Model)의 값을 참조하거나 설정하는 방식이 그렇다.

HTML 문서에 사용할 수 있는 문법은 템플릿에도 대부분 사용할 수 있다. 하지만 **Angular 템플릿은 웹 페이지 전체가 아니라 화면 일부만 담당하기 때문에 `<html>` 이나 `<body>`, `<base>` 엘리먼트는 사용할 수 없다.** Angular 컴포넌트는 화면의 일부분만 집중하는 방식으로 개발한다.

> 스크립트 인젝션 공격(script injection attack)을 방지하기 위해 Angular 템플릿에는 `<script>` 엘리먼트를 사용할 수 없다. 만약 `<script>` 엘리먼트가 사용되더라도 Angular는 이 엘리먼트를 무시하며 브라우저 콘솔에 경고 메시지를 출력한다.





## 템플릿 문법

문자열 바인딩 (Text Interpolation)

> 데이터를 HTML 문서에 표시하기 위해 문자열 바인딩을 사용하는 방법에 대해 알아보기

템플릿 실행문 (Template Statements)

> 템플릿에서 발생한 이벤트에 반응할 수 있다.

바인딩 구문 (Binding Syntax)

> 컴포넌트에 있는 데이터를 연결하는 방법에 대해 알아보기

프로퍼티 바인딩 (Property Binding)

> `@Input()` 데코레이터가 지정된 엘리먼트/디렉티브의 프로퍼티 값을 설정할 수 있다

어트리뷰트, 클래스, 스타일 바인딩

> 어트리뷰트, 클래스, 스타일을 설정할 수 있다.

이벤트 바인딩(Event Binding)

> HTML 문서에서 발생한 이벤트를 감지하는 방법