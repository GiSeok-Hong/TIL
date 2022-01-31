# 프로퍼티 바인딩 (Property Binding)



프로퍼티 바인딩을 활용하면 HTML 엘리먼트나 디렉티브의 프로퍼티 값을 지정할 수 있다.

이 문법을 활용하면 버튼을 비활성화 할 수 있고, 이동할 주소를 프로그램 로직으로 할당할 수 있으며, 컴포넌트에 데이터를 전달할 수 있다.



## 데이터 흐름 이해하기

프로퍼티 바인딩에서 데이터는 컴포넌트 프로퍼티에서 엘리먼트 프로퍼티로 한방향으로만 움직인다.





## 프로퍼티에 바인딩하기

엘리먼트 프로퍼티를 바인딩하려면 대상 프로퍼티를 대괄호로 감싸는 문법(`[ ]`)을 사용한다. 이 때 대상 프로퍼티는 값을 지정하려고 하는 DOM 프로퍼티이다.

아래 예제에서는 `<img>` 엘리먼트의 `src` 프로퍼티가 대상 프로퍼티이다.

```html
<!-- src/app/app.component.html -->

<img [src]="itemImageUrl">
// src/app/app.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  itemImageUrl = '../assets/phone.png';
  
}
```

헷갈릴 수 있지만 대상이 되는 이름은 어트리뷰트가 아니라 프로퍼티 이름이다.

위 예제에서도 `src` 는 `<img>` 엘리먼트의 프로퍼티이다.

대괄호(`[ ]`)가 사용되면 Angular는 프로퍼티 바인딩 표현식의 등호 오른쪽에 있는 표현식을 평가한다. 그리고 대괄호를 사용하지 않으면 등호 오른쪽에 있는 문자열은 단순한 문자열 리터럴로 사용되어 프로퍼티에 바인딩된다.

```html
<!-- src/app/app.component.html -->

<app-item-detail [childItem]="parentItem"></app-item-detail>
<!-- 출력 결과는 Your item is : lamp-->

<app-item-detail childItem="parentItem"></app-item-detail>
<!-- 출력 결과는 Your item is : parentItem -->
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  itemImageUrl = '../assets/phone.png';
  isUnchanged = true;
  classes = 'special';
  parentItem = 'lamp';

  currentItems = [{
    id: 21,
    name: 'phone'
  }];

  interpolationTitle = 'Interpolation';
  propertyTitle = 'Property binding';

  evilTitle = 'Template <script>alert("evil never sleeps")</script> Syntax';
}
```



## 엘리먼트 프로퍼티 설정하기

- HTML의 구성요소가 Element다

<img> 엘리먼트의 src 프로퍼티를 컴포넌트 itemImageUrl 프로퍼티의 값으로 바인딩하려면 대괄호를 사용해서 아래와 같이 작성하면 된다.

```html
<img [src]="itemImageUrl">
```

이 예제에서 `itemImageUrl` 프로퍼티는 `AppComponent` 에 정의되어 있다.

```tsx
// src/app/app.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
	itemImageUrl = '../assets/phone.png';
}
```

- colspan 과 colSpan

가장 헷갈리는 부분은 `colspan` 어트리뷰트와 `colSpan` 프로퍼티 같이, 바인딩하는 대상이 어트리뷰트인지 프로퍼티인지 혼동이 된다는 것이다. 두 단어의 철자는 같지만 엄연히 다르다

- 예를 들어 아래와 같이 작성했다고 해보자

```html
<tr><td colspan="{{ 1+ 1}}">Three-Four</td></tr>
```

그러면 이런 에러가 발생한다.

```
Template parse errors: Can't bind to 'colspan' since it isn't a known native property
```

이 메세지에서 알 수 있듯이, <td> 엘리먼트에는 `colspan` 이라는 프로퍼티가 없다. 왜냐하면 `colspan` 은 프로퍼티가 아니라 어트리뷰트이며, 관련된 프로퍼티는 대문자가 들어간 `colSpan` 이다.

문자열 바인딩(Interpolation)이나 프로퍼티 바인딩은 모두 프로퍼티를 대상으로 동작한다. 어트리뷰트가 아니다

- 프로퍼티 바인딩은 이렇게 사용한다.

```html
<tr><td [colSpan]="1 + 1">Three-Four</td></tr>

<!-- 같은 결과가 나온다. -->
<tr><td [colSpan]="2">Three-Four</td></tr>
<tr><td colspan="2">Three-Four</td></tr>
```

- 컴포넌트에 있는 `isUnchanged` 프로퍼티 값으로 버튼을 비활성화하려면 아래와 같이 구현하면 된다.

```html
<!-- src/app/app.component.html -->

<!-- 버튼의 활성화 여부를 'isUnchanged' 프로퍼티와 바인딩한다 -->
<button [disabled]="isUnchanged">Disabled Button</button>
// src/app/app.component.ts
...  
isUnchanged = true;
...
```

- 디렉티브의 프로퍼티 값을 아래와 같이 설정

```html
<!-- src/app/app.component.html -->

<p [ngClass]="classes">[ngClass] binding to the classes property making this blue</p>
```

- 커스텀 컴포넌트에 값을 전달할 수도 있다. 부모/자식 컴포넌트끼리는 아래와 같이 데이터를 전달한다.

```html
<app-item-detail [childItem]="parentItem"></app-item-detail>

<!-- 출력 결과 : Your item is: lamp  -->
```



## 버튼 비활성화하기

버튼을 비활성화하려면 불리언 값으로 DOM `disabled` 프로퍼티 값을 지정하면 된다.

```html
<!-- src/app/app.component.html -->

<!-- 버튼의 활성화 여부를 'isUnchanged' 프로퍼티와 바인딩한다. -->
<button [disabled]="isUnchanged">Disabled Button</button>

<!-- 아래는 button 엘리먼트의 기본 어트리뷰트를 사용????-->
<button disabled>Disabled Button></button>
```

그러면 `AppComponent` 의 `isUnchanged` 프로퍼티 값이 `true` 일 때 Angular가 버튼을 비활성화 한다.

```tsx
// src/app/app.component.ts

isUnchanged = true;
```



## 디렉티브 프로퍼티 값 지정하기

디렉티브의 프로퍼티 값을 지정하려면 대괄호를 사용해서 `[ngClass]` 와 같이 대상 프로퍼티를 지정하고 그 오른쪽에 등호를 붙여 표현식을 연결하면 된다. `classes` 프로퍼티를 바인딩하려면 아래와 같이 구현하면 된다.

```html
<p [ngClass]="classes">[ngClass] binding to the classes property making this blue</p>

<!-- 아래가 아마도 어트리뷰트 -->
<p class="special"></p>
```

프로퍼티를 바인딩하려면 반드시 이 프로퍼티를 컴포넌트 클래스에 선언해야 하며, 예제의 경우에는 `AppComponent` 가 컴포넌트 클래스이다. `classes` 프로퍼티의 값은 `special` 이다

```tsx
// src/app/app.component.ts

classes = 'special';
/*
src/app/app.component.css
*/

.special {
  background-color: #1976d2;
  color: #fff;
  padding: 1rem;
}
```

그러면 Angular가 `<p>` 엘리먼트의 CSS 클래스를 `special` 로 지정하며, `special` 클래스에 맞는 CSS 스타일이 적용된다.



## 컴포넌트끼리 프로퍼티 바인딩하기

커스텀 컴포넌트의 프로퍼티 값을 설정하려면 대상 컴포넌트의 프로퍼티를 대괄호로 감싸면 된다.

아래 예제는 부모 컴포넌트에 있는 `parentItem` 을 자식 컴포넌트의 `childItem` 프로퍼티로 바인딩하는 예제이다

```html
<!-- src/app/app.component.html -->

<app-item-detail [childItem]="parentItem"></app-item-detail>
```

바인딩하려는 프로퍼티와 바인딩 대상은 반드시 컴포넌트 클래스에 선언되어 있어야 한다.

`childItem` 은 `ItemDetailComponent` 에 선언된 프로퍼티이다.

그리고 이 프로퍼티에 `@Input()` 데코레이터를 지정하면 데이터가 이 프로퍼티로 전달될 수 있다.

```tsx
// src/app/item-detail/item-detail.component.ts

import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})

export class ItemDetailComponent implements OnInit {
	@Input() childItem = '';
}
```

그리고 바인딩 대상이 되는 프로퍼티 `parentItem` 은 `AppComponent` 에 선언되어 있다.

이 예제에서 `childItem` 프로퍼티의 타입은 `string` 이기 때문에 `parentItem` 프로퍼티도 문자열 타입이어야 한다. 그래서 `parentItem` 프로퍼티에도 `lamp` 라는 문자열 값이 할당되어 있다.

```tsx
// src/app/app.component.ts

parentItem = 'lamp';
```

이렇게 구현하면 `<app-item-detail>` 은 `childItem` 으로 `lamp` 값을 받는다



## 프로퍼티 바인딩과 보안

프로퍼티 바인딩을 활용하면 보안에도 도움이 된다. 예를 들어 이런 악성코드가 있다고 해보자

```tsx
// src/app/app.component.ts

evilTitle = 'Template <script>alert("evil never sleeps")</script> Syntax';
```

이 컴포넌트 문자열이 바인딩되면 이런 내용이 된다

```html
<!-- src/app/app.component.html -->

<p><span>"{{ evilTitle }}" is the <i>interpolated</i> evil title. </span></p>
```

브라우저는 이 악성코드를 그대로 실행하지 않고 이런 메시지를 출력한다

```
Template <script>alert("evil never sleeps")</script> Syntax" is the interpolated evil title.
```

Angular는 문자열 바인딩과 프로퍼티 바인딩 문법에서 `<script>` 태그를 허용하지 않기 때문에 악성 JavaScript 코드가 실행되는 것도 막는다

Angular는 아래 예제처럼 악성 코드를 **무력화(sanitize)** 한다.

```html
<!-- src/app/app.component.html -->

<!--
 Angular가 아래와 같이 위험한 코드를 발견하면 경고를 표시.
 WARNING: 안전성 검사를 우회하는 방법은 <http://g.co/ng/security#xss> 를 참고.
-->
 <p>"<span [innerHTML]="evilTitle"></span>" is the <i>property bound</i> evil title.</p>
```

문자열 바인딩과 프로퍼티 바인딩은 `<script>` 태그를 처리하는 방식이 조금 다르지만, 결국 위험하지 않은 내용만 화면에 렌더링된다. `evilTitle` 이 프로퍼티 바인딩에 사용되면 이런 에러 메시지가 브라우저 콘솔에 출력된다

```
"Template Syntax" is the property bound evil title.
```



## 프로퍼티 바인딩과 문자열 바인딩

문자열 바인딩과 프로퍼티 바인딩은 보통 같은 결과를 낸다. 아래 예제에서도 문자열 바인딩과 프로퍼티 바인딩의 결과는 같다

```html
<!-- src/app/app.component.html -->

<p><img src="{{itemImageUrl}}"> is the <i>interpolated</i> image.</p>
<p><img [src]="itemImageUrl"> is the <i>property bound</i> image.</p>

<p><span>"{{interpolationTitle}}" is the <i>interpolated</i> title.</span></p>
<p>"<span [innerHTML]="propertyTitle"></span>" is the <i>property bound</i> title.</p>
itemImageUrl = '../assets/phone.png';
interpolationTitle = 'Interpolation';
propertyTitle = 'Property binding';
```

문자열 같은 데이터를 화면에 렌더링하는 용도라면 어느 방식을 써도 되지만, 가독성 때문에 문자열 바인딩이 더 선호되곤 한다.

하지만 문자열이 아닌 데이터를 엘리먼트 프로퍼티에 바인딩하려면 반드시 프로퍼티 바인딩을 활용해야 한다.