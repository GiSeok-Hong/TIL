# 컴포넌트 (Component)

컴포넌트는 애플리케이션을 구성하는 기본 단위이다.

컴포넌트는 `@Component()` 데코레이터가 붙는 TypeScript 클래스, HTML 탬플릿, 스타일로 구성된다.

`@Component()` 데코레이터는 아래와 같이 Angular에 필요한 정보를 지정하는 역할을 한다.

- 컴포넌트가 템플릿에 사용될 CSS 셀렉터를 지정한다. 템플릿에서 이 셀렉터에 해당되는 HTML 엘리먼트마다 컴포넌트 인스턴스가 생성된다.
- Angular 가 컴포넌트 내용으로 렌더링할 HTML 템플릿을 지정한다.
- 템플릿 HTML 엘리먼트의 모습을 지정해야 한다면 이 때 필요한 CSS 스타일을 지정한다.

예시)

```tsx
import { Component } from '@angular/core';

@Component({
  selector: 'hello-world',
  template: `
    <h2>Hello World</h2>
    <p>This is my first component!</p>
  `
})
export class HelloWorldComponent {
  // 여기에는 컴포넌트의 동작을 정의하는 코드가 들어간다.
}
```

위의 컴포넌트를 사용하려면 템플릿에 아래 코드를 추가하면 된다

```tsx
<hello-world></hello-world>
```

Angular가 컴포넌트를 렌더링하고 나면 DOM이 아래와 같이 된다

```tsx
<hello-world>
	<h2>Hello World</h2>
	<p>This is my first component!</p>
</hello-world>
```

Angular 컴포넌트는 강력하게 캡슐화되어 있지만 애플리케이션 구조에 맞게 직관적으로 구성된다. 컴포넌트를 사용하면 애플리케이션에 유닛 테스트를 적용하기 쉽고, 코드의 가독성도 높일 수 있다.



## 컴포넌트 개요

컴포넌트는 Angular 애플리케이션을 구성하는 기본 단위이다. 그리고 개별 컴포넌트는 아래 요소들로 구성된다.

- 화면을 렌더링하는 HTML 템플릿
- 동작을 정의하는 TypeScript 클래스
- 컴포넌트를 템플릿에 추가할 때 사용하는 CSS 셀렉터
- 추가로 컴포넌트가 표시되는 모습을 정의하는 CSS 스타일



## 사전준비

컴포넌트를 만들려면 아래 환경이 준비되어야 한다

- Angular CLI 가 설치되어 있어야 한다
- Angular 워크스페이스가 존재하고 이 안에 기본 애플리케이션이 있어야 한다. 아직 프로젝트가 없다면 `ng new <프로젝트 이름>` 명령을 실행해서 프로젝트를 생성한다



## 컴포넌트 생성하기

### Angular CLI로 컴포넌트 생성하기

1. 터미널 창을 열고 애플리케이션 폴더로 이동
2. `ng generate component <컴포넌트 이름>` 명령을 실행해서 컴포넌트를 생성

이 명령을 실행하면 아래와 같이 컴포넌트가 구성된다.

- 컴포넌트 이름으로 폴더가 생성
- `<컴포넌트-이름>.component.ts` 컴포넌트 파일이 생성
- `<컴포넌트-이름>.component.html` 템플릿 파일이 생성
- `<컴포넌트-이름>.component.css` CSS 스타일 파일이 생성
- `<컴포넌트-이름>.compopnent.spec.ts` 테스트 파일이 생성

그리고 이렇게 만든 컴포넌트의 셀렉터는 `<컴포넌트-이름>` 이다.

### 수동으로 컴포넌트 생성하기

1. Angular 프로젝트로 이동
2. `<컴포넌트-이름>.component.ts` 라는 이름으로 새 파일 생성
3. 이 파일 시작부분에 아래 코드 추가

```tsx
import { Component } from '@angular/core';
```

4. 그리고 `import` 구문 뒤에 `@Component` 데코레이터를 추가

```tsx
@Component({
})
```

5. 컴포넌트에 적용할 CSS 셀렉터를 지정

```tsx
@Component({
	selector: 'app-component-overview',
)}
```

6. 정보를 표시할 HTML 템플릿을 정의한다. 일반적으로 템플릿 파일은 별도 HTML 파일로 정의한다.

```tsx
@Component({
	selector: 'app-component-overview',
	templateUrl: './component-overview.component.html',
)}
```

7. 컴포넌트 템플릿에 지정될 스타일 파일을 생성한다. 일반적으로 스타일 파일은 별도 파일로 정의한다.

```tsx
@Component({
  selector: 'app-component-overview',
  templateUrl: './component-overview.component.html',
  styleUrls: ['./component-overview.component.css']
})
```

8. 컴포넌트 클래스를 정의하는 `class` 구문을 추가한다.

```tsx
export class ComponentOverviewComponent {

}
```



## 컴포넌트 CSS 셀렉터 지정하기

angular 는 템플릿 HTML에 사용된 컴포넌트 셀렉터를 기준으로 컴포넌트의 인스턴스를 생성하기 때문에 컴포넌트에 CSS 셀렉터를 지정해야 한다. 그래서 템플릿에 `hello-world.component.ts` 컴포넌트를 추가하려면 이 컴포넌트의 셀렉터를 `app-hello-wolrd` 와 같은 문자열로 지정해야 한다. 이렇게 지정한 후에는 템플릿에 `<app-hello-world>` 라고 사용할 수 있다.

컴포넌트 셀렉터를 지정하려면 `@Component` 데코레이터의 `selector` 프로퍼티를 사용하면 된다.

```tsx
@Component({
	selector: 'app-component-overview',
)}
```



## 컴포넌트 템플릿 정의하기

템플릿은 컴포넌트가 애플리케이션에 렌더링될 모습을 지정하는 HTML조각이다. 템플릿은 컴포넌트 파일에 직접 정의하거나, 별도 파일로 만들고 컴포넌트에 불러오는 방식으로 사용한다.

템플릿을 별도 파일로 정의하려면 `@Component` 데코레이터의 `templateUrl` 프로퍼티를 지정하면 된다.

```tsx
@Component({
	selector: 'app-component-overview',
	templateUrl: './component-overview.component.html',
)}
```

그리고 템플릿을 컴포넌트 파일에 정의하려면 `@Component` 데코레이터의 `template` 프로퍼티에 HTML 문법을 직접 사용하면 된다

```tsx
@Component({
	selector:'app-component-overview',
	template: '<h1>Hello World!</h1>',
)}
```

템플릿을 여러 줄에 걸쳐 정의하려면 역따옴표( ` )를 사용하면 된다.

```tsx
@Component({
	selector: 'app-component-overview',
	template: `
		<h1>Hello World</h1>
		<p>This template definition spans multiple lines.</p>
	`
)}
```

> 컴포넌트를 정의하려면 `template` 이나 `templateUrl` 중 하나는 반드시 정의해야 한다. 다만, 둘을 동시에 지정할 수는 없다.



## 컴포넌트 스타일 지정하기

템플릿에 적용될 컴포넌트 스타일은 컴포넌트 안에 직접 정의하거나, 별도 파일로 만들고 컴포넌트에 불러오는 방법을 사용한다.

컴포넌트 스타일을 별도 파일로 정의하려면 `@Component` 데코레이터의 `styleUrls` 프로퍼티를 지정하면 된다.

```tsx
@Component({
	selector: 'app-component-overview',
	templateUrl: './component-overview.component.html',
	styleurls: ['./component-overview.component.css']
)}
```

그리고 컴포넌트 안에 스타일을 지정하려면 `@Component` 데코레이터의 `styles` 프로퍼티에 원하는 스타일을 지정하면 된다.

```tsx
@Component({
	selector: 'app-component-overview',
	template: '<h1>Hello World!</h1>',
	styles: ['h1 { font-weight: normal; }']
)}
```

`styles` 프로퍼티는 문자열 배열로 지정한다.