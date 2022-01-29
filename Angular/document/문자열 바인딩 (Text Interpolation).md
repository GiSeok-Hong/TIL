# 문자열 바인딩 (Text Interpolation)



문자열 바인딩을 활용하면 HTML 템플릿에 문자열을 동적으로 반영할 수 있다. 그래서 사용자의 이름을 넣어서 환영 문구를 표시하는 방식으로 애플리케이션 화면의 내용을 동적으로 변경할 수 있다.

> 바인딩(bindding)이란 프로그램에서 사용된 구성 요소의 **실제 값 또는 프로퍼티를 결정짓는 행위를 의미**한다. 예를 들어 함수를 호출하는 부분에서 실제 함수가 위치한 메모리를 연결하는 것도 바인딩이다.



------

- 예제

[Angular Example - Interpolation - StackBlitz](https://stackblitz.com/angular/ovyaledgymd?file=src%2Fapp%2Fapp.component.ts)





## 문자열 값 표시하기

문자열 바인딩(Text Interpolation)은 **표현식 안에 문자열을 넣는 것을 의미한다.**

기본적으로 문자열 바인딩은 이중 중괄호( `{{  }}` )를 구분자로 사용한다.

문자열 바인딩이 동작하는 것을 확인하기 위해 Angular 컴포넌트 안에 `currentCustomer` 라는 프로퍼티가 있다고 해보자

```tsx
// src/app/app.component.ts

currentCustomer = 'maria';
```

이 프로퍼티 값을 템플릿에 표시하려면 아래와 같이 작성하면 된다.

```html
<!-- src/app/app.component.html -->

<h3>Current customer: {{ currentCustomer }}</h3>
```

그러면 Angular가 `currentCustomer` 라는 표현식을 프로퍼티의 값으로 대체합니다. 이 예제에서는 `Maria` 로 대체된다.

같은 방식으로 이미지의 제목과 URL을 바인딩하려면 `title` 프로퍼티와 `itemImageUrl` 프로퍼티를 아래와 같이 바인딩하면 된다.

```html
<!-- src/app/app.component.html -->

<p>{{ title }}</p>
<div><img src="{{ itemImageUrl }}"></div>
```

------

## 템플릿 표현식 (Template Expressions)

템플릿 표현식은 이중 중괄호 (`{{ }}`)를 사용해서 어떤 값을 만들어 내는 문법이다.

Angular는 이런 표현식의 평가 결과를 바인딩 대상의 프로퍼티로 할당한다. 이 때 바인딩 대상은 HTML 엘리먼트나 컴포넌트, 디렉티브가 될 수 있다.

### 표현식 계산 과정

Angular는 이중 중괄호 안에 사용된 문자열을 가장 먼저 평가해서 문자열로 결정한다.

숫자 두 개를 더하는 과정을 자세하게 분석해 보자

```html
<!-- src/app/app.component.html -->

<p>The sum of 1 + 1 is {{ 1 + 1 }}.</p>
<!-- 출력 : "The sum of 1 + 1 is 2." -->
```

표현식에서는 `getVal()` 과 같은 호스트 컴포넌트의 메서드를 실행할 수도 있다.

```html
<!-- src/app/app.component.html -->

<p>The sum of 1 + 1 is {{ 1 + 1 + getVal() }}.</p>
<!-- 출력 : "The sum of 1 + 1 is not 4." -->
```

Angular는 문자열 바인딩을 아래와 같이 처리한다

1. 이중 중괄호 안에 있는 표현식을 모두 평가한다
2. 표현식의 결과를 문자열로 변환한다.
3. 표현식 평가 결과를 주변 문자열과 결합한다.
4. 결합된 결과를 엘리먼트/디렉티브 프로퍼티로 할당한다.

> 문자열 바인딩 문법의 구분기호는 `@Component` 메타데이터의 interpolation 옵션으로 변경할 수 있다.

### 문법

템플릿 표현식은 JavaScript 문법과 비슷하다. 그래서 JavaScript 표현식은 대부분 그대로 템플릿 표현식으로 사용할 수 있지만, 일부 문법은 예외다.

표현식 외부에 영향을 미치거나 미칠 가능성이 있는 아래 표현들은 사용할 수 없다:

- 값을 할당하는 표현 ( `=` , `+=`, `-=` , `...` )
- `new`, `typeof`, `instanceof` 연산자
- `;` 나 `,` 를 사용해서 표현식을 여러 번 사용하는 표현
- `++` , `--` 와 같은 증감 연산자
- ES2015 이상에서 지원하는 연산자 일부

그리고 JavaScript 문법에서 지원하는 것과는 이런 점이 다르다

- `|` , `&` 와 같은 비트 연산자는 사용할 수 없다.
- `|`, `? .` , `!` 와 같은 템플릿 표현식 연산자를 사용할 수 있다.

------

## 표현식의 컨텍스트

문자열 바인딩 표현식에는 컨텍스트가 존재한다. 이 때 컨텍스트는 애플리케이션의 일부 영역을 의미하며, 일반적으로 컴포넌트 인스턴스 범위가 된다.

아래 예제 코드에서 표현식 안에 있는 `recommended` 와 `itemImageUrl2` 는 모두 `AppComponent` 에 있는 프로퍼티를 가리키는 것이다.

```html
<!-- src/app/app.component.html -->

<h4>{{ recommended }}</h4>
<img [src]="itemImageUrl2">
```

템플릿 입력 변수나 템플릿 참조 변수를 사용하면 템플릿 안에만 존재하는 프로퍼티를 참조할 수도 있다.

아래 예제 코드에 사용된 `customer` 는 템플릿 입력 변수를 의미한다.

```html
<!-- src/app/app.component.html (템플릿 입력 변수) -->

<ul>
	<li *ngFor="let customer of customers">{{ customer.name }}</li>
</ul>
```

그리고 아래 예제 코드에서 `#customerInput` 은 템플릿 참조 변수를 의미한다.

```html
<!-- src/app/app.component.html (템플릿 참조 변수) -->

<label>Type something:
	<input #customerInput>{{ customerInput.value }}
</label>
```

> 템플릿 표현식은 `undefined` 외에는 전역 네임스페이스에 있는 `window` 나 `document` 와 같은 객체를 참조할 수 없다. 그리고 표현식 컨텍스트 범위를 넘어가는 `console.log()` 나 `Math.max()` 와 같은 함수도 실행할 수 없다.

### 이름 충돌 방지하기

표현식이 평가되는 컨텍스트는 템플릿 변수, 디렉티브 컨텍스트 객체, 컴포넌트 멤버가 조합되어 구성된다. 그래서 템플릿 표현식에서 사용하는 이름이 네임스페이스에서 한 곳 이상 겹치면 이런 순서로 참조 객체를 결정한다.

1. 템플릿 변수 이름 중에서
2. 디렉티브 컨텍스트 안에서
3. 컴포넌트 멤버 중에서

그래서 다른 컨텍스의 영향을 받아 변수가 가려지는 상황을 방지하려면 네임스페이스와 관계 없이 변수의 이름을 겹치지 않게 지정해야 한다.

아래 예제에서 `AppComponent` 템플릿에 있는 `customer` 는 컴포넌트 클래스에 있는 Padma 값이 들어간다.

그리고 `customers` 배열을 순회할 때 사용하는 `customer` 는 `ngfor` 로 반복되는 개별 객체를 의미한다.

```tsx
// src/app/app.component.ts

@Component({
	template: `
		<div>
			<h1>Hello, {{ customer }}</h1> <!-- 출력 : Hello, Padma -->
			<ul>
				<li *ngFor="let customer of customers">{{ customer.value }}</li>
			</ul>
		</div>
	`
)}
class Appcomponent {
	customers = [ {value: 'Ebony'}, {value: 'Chiho'} ];
	customer = 'Padma';
}
```

`ngFor` 안에 있는 `customer` 는 `<ng-template>`  컨텍스트 안에 존재하기 때문에 `customers` 배열의 개별 항목을 반환하며, 이 예제에서는 Ebony와 chiho를 표시한다. 하지만 `ngFor` 가 순회하는 배열 안에는 Padma가 존재하지 않는다.

Padma를 표시할 때 사용한 `customer` 는 `ngFor` 바깥에 있는 다른 컨텍스트이다. `<h1>` 에 사용된 `customer` 는 컴포넌트 클래스에서 Padma라고 선언된 `customer` 프로퍼티를 가리킨다.

------

## 모범 사례

템플릿 표현식은 아래와 같이 작성하는 것이 좋다

- 짧게 작성하기

  프로퍼티 이름이나 메서드 실행만 하는 정도가 좋다. 애플리케이션 로직이나 비즈니스 로직은 컴포넌트 클래스에 작성해야 개발하기 쉽고 테스트하기도 쉽다.

- 간단하게 실행되도록 작성하기

  Angular는 변화 감시 싸이클마다 템플릿 표현식을 실행한다. 그리고 Promise 처리, HTTP 이벤트, 타이머 이벤트, 키 입력 이벤트나 마우스 이동과 같은 비동기 작업들도 변화 감지 싸이클을 다시 실행시킨다.

  그래서 표현식은 사용자가 불편함을 느끼지 않을 정도로 간단하게 실행되어야 한다. 이 내용은 디바이스 성능이 낮을수록 더 중요하다. 표현식이 실행되는 시간이 길다면 캐싱을 하는 방법도 고려해 보기

- 사이드 이펙트 최소화

  Angular의 단방향 데이터 흐름 모델에 따르면 템플릿 표현식은 변경하려고 하는 대상 외에는 어떠한 것도 변경하지 않는 것이 좋다. 컴포넌트 프로퍼티의 값을 읽는 동작이 다른 값을 변경하면 안 된다. 화면은 렌더링이 한 번 끝나고 난 후에 안정된 상태가 되어야 한다.

  - 멱등(Idempotent) 표현식은 사이드 이펙트를 줄일 수 있으며 Angular 의 변화 감지 성능도 향상시킬수 있다. Angular의 관점에서 이야기하는 **“멱등 표현식” 은 관련 값이 변경되지 않는 한 언제나 같은 값을 반환하는 표현식을 의미한다.**
  - 그리고 표현식과 관련된 값들도 이벤트 루프가 한 번 실행되는 동안 변경되면 안된다. 멱등 표현식은 문자열이나 숫자를 반환하는데, 이 표현식이 정말 멱등이라면 이 표현식이 다시 한 번 실행되어도 같은 문자열이나 같은 숫자 값을 반환해야 한다. 표현식이 객체나 배열을 반환한다면, 다시 한 번 실행되어도 같은 객체 참조를 반환해야 한다.

  > `ngFor` 를 사용하는 경우는 예외이다.