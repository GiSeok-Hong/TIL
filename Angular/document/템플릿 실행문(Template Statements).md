# 템플릿 실행문(Template Statements)



템플릿 실행문은 HTML 템플릿 안에서 메서드를 실행하거나 프로퍼티를 조작하는 로직을 의미한다.

템플릿 실행문을 활용하면 사용자의 이벤트에 맞춰서 컨텐츠를 동적으로 변경하거나 폼을 제출할 수 있다.

- 예제

[Angular Example - Template Syntax Collection - StackBlitz](https://stackblitz.com/angular/pakqaqkmqbd?file=src%2Fapp%2Fapp.component.html)

아래 예제에서 `deleteHero()` 라고 작성된 것처럼, 템플릿 실행문은 `(이벤트)="실행문"` 이라는 형식으로 사용한다.

```html
<!-- src/app/app.component.html -->

<button (click)="deleteHero()">Delete hero</button>
```

이제 사용자가 Delete hero 버튼을 클릭하면 Angular 가 컴포넌트 클래스에 있는 `deleteHero()` 메서드를 실행한다.

템플릿 실행문은 엘리먼트, 컴포넌트, 디렉티브에 모두 사용할 수 있다.

------

## 문법

[문자열 바인딩 (Text Interpolation)](https://www.notion.so/Text-Interpolation-5f8c6f6da91a4ab6acfc6a79b4efff3f) 의 **템플릿 표현식(Template Expressions)**과 비슷하게, 템플릿 실행문도 JavaScript와 비슷한 문법을 사용한다. 하지만 템플릿 실행문과 파서는 템플릿 표현식과 다른 파서를 사용한다. 템플릿 표현식 파서의 기능과 더불어 템플릿 실행문 파서는 `=` 와 같은 기본 할당 문법을 지원하며, 세미 콜론(`;` ) 도 지원하기 때문에 표현식을 체이닝할 수 있다.

JavaScript 문법 중 이런 문법은 템플릿 실행문에 사용할 수 없다.

- `new`
- 증감 연산자 `++`, `--`
- 복합대입 연산자 `+=`, `-=`
- 비트 연산자 `|`, `&`
- 파이프 연산자

------

## 실행문의 컨텍스트

템플릿 실행문은 애플리케이션의 특정 컨텍스트 안에서 동작한다.

템플릿 실행문의 컨텍스트는 일반적으로 컴포넌트 인스턴스와 같으며, 템플릿 실행문은 실행문 컨텍스트 안에 있는 것만 참조할 수 있다. 그래서 클릭 이벤트를 컴포넌트에 정의된 `deleteHero()` 메서드와 바인딩 하려면 `(click)="deleteHero()"` 라고 작성하면 된다.

```html
<!-- src/app/app.component.html -->

<button (click)="deleteHero()">Delete hero</button>
```

템플릿 실행문의 컨텍스트 안에서는 템플릿 컨텍스트에 있는 프로퍼티도 참조할 수 있다. 그래서 아래 예제처럼 컴포넌트의 이벤트 핸들링 메서드 `onSave()` 를 실행하면서 템플릿에 있는 `$event` 객체를 인자로 전달할 수 있다. 아래 예제에서 `deleteHero()` 메서드를 실행하면서 템플릿 입력 변수 `hero` 를 인자로 사용했으며, `onSubmit()` 메서드를 실행하면서 템플릿 참조 변수 `#heroForm` 을 사용했다.

```html
<button (click)="onSave($event)">Save</button>
<button *ngFor="let hero of heroes" (click)="deleteHero(hero)">{{ hero.name }} </button>
<form #heroForm (ngSubmit)="onSubmit(heroForm)">. . .</form>
```

이 예제에서 `$event` 객체, `hero`, `#heroForm` 은 모두 템플릿 컨텍스트 안에 있는 객체들이다.

템플릿 컨텍스트 안에서는 우선순위가 있다. 이전 예제에서 `deleteHero()` 에 사용된 `hero` 는 컴포넌트에 있는 `hero` 프로퍼티가 아니라 템플릿 입력 변수다.

------

## 권장사항

- 간결하게

  템플릿 실행문은 메서드를 실행하거나 간단한 프로퍼티 조작 정도로 최대한 간결하게 작성하는 것이 좋다.

- 컨텍스트 안에서만 작업

  템플릿 실행문의 컨텍스트는 컴포넌트 클래스 인스턴스와 템플릿 범위다. 그래서 템플릿 실행문은 `window` 나 `document` 같은 전역 네임스페이스에 접근할 수 없다. `console.log()`, `Math.max()` 와 같은 로직은 실행할 수 없다.