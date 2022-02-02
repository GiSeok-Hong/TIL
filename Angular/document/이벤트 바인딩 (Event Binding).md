# 이벤트 바인딩 (Event Binding)

이벤트 바인딩 문법을 활용하면 키입력이나 마우스 이동, 클릭, 터치 이벤트에 반응할 수 있다.



## 이벤트 바인딩하기

Angular 이벤트 바인딩 문법은 소괄호(`(   )` )안에 대상이 되는 이벤트의 이름을 지정하고 등호(`=`)를 붙인 후 템플릿 실행문을 작성하면 된다. 그래서 버튼에서 발생하는 클릭 이벤트를 감지하다가 이벤트가 발생했을 때 컴포넌트에 정의된 `onSave()` 메소드를 실행하려면 이렇게 작성하면 된다.

```html
<button (click)="onSave()">저장</button>

<!-- 
	위의 코드에서
	click = target event name
	onSave() = template statement
-->
```



## 패시브 이벤트 바인딩하기

Angular는 패시브 이벤트 리스너도 지원한다. 스크롤 이벤트를 감지하는 경우를 예로 든다.

1. `src` 디렉토리 아래에 `zone-flags.ts` 파일을 생성한다.
2. 이 파일에 아래 내용을 추가한다

```tsx
(window as any)['__zone_symbol__PASSIVE_EVENTS'] = ['scroll'];
```

1. 그리고 `src/polyfills.ts` 파일에서 zone.js 를 불러오기 전에 이렇게 만든 `zone-flags` 파일을 불러온다

```tsx
import './zone-flags';
import 'zone.js'; // Included with Angular CLI
```

이렇게 작업하고 `scroll` 이벤트를 감지하는 이벤트 리스너를 추가하면, 이 이벤트 리스너는 `passive` 이벤트 리스너가 된다.



## EventEmitter로 커스텀 이벤트 생성하기

디렉티브에서 Angular EventEmitter 클래스를 활용하면 커스텀 이벤트를 발생시킬 수 있다.

1. 디렉티브에 `EventEmitter` 타입으로 프로퍼티를 선언하고 외부로 공개한다.
2. 디렉티브에서 `EventEmitter.emit(data)` 를 실행하면 이벤트를 발생시키면서 데이터를 함께 전달할 수 있다.
3. 부모 디렉티브에서 이 이벤트가 발생하는 것을 감지하고 있다가 `$event` 객체로 자식 디렉티브에서 보낸 데이터를 활용하면 된다.

`ItemDetailComponent` 는 히어로의 세부정보를 화면에 표시하고 사용자의 입력에 처리하는 컴포넌트이다. 그리고 `ItemDetailComponent` 에는 삭제 버튼이 하나 있는데, `ItemDetailComponent` 에서는 히어로를 삭제하는 방법을 알지 못 한다. 이 컴포넌트는 사용자가 삭제 요청을 보냈다는 이벤트를 발생시키는 역할만 한다.

```html
<!-- src/app/item-detail/item-detail.component.html -->

<img src="{{itemImageUrl)}}" [style.display]="displayNone">
<span [style.text-decoration]="lineThrough">{{ item.name }}</span>
<button (click)="delete()">Delete</button>
```

컴포넌트에 정의된 `deleteRequest` 프로퍼티는 `EventEmitter` 타입으로 선언되고 있다. 그리고 사용자가 delete버튼을 클릭하면 `delete()` 메소드를 실행하며 `EventEmitter` 클래스를 통해 `Item` 객체를 컴포넌트 외부로 보낸다.

```tsx
// src/app/item-detail/item-detail.component.ts (deleteRequest())

// 이 컴포넌트는 직접 히어로를 삭제하지 않고 히어로 삭제 요청을 보내기만 합니다.
@Output() deleteRequest = new EventEmitter<Item>();

delete() {
  this.deleteRequest.emit(this.item);
  this.displayNone = this.displayNone ? '' : 'none';
  this.lineThrough = this.lineThrough ? '' : 'line-through';
}
```

부모 컴포넌트에서는 `deleteRequest` 이벤트를 `deleteItem()` 메서드와 바인딩하고 있다.

```html
<!-- src/app/app.component.html (event-binding-to-component) -->

<app-item-detail (deleteRequest)="deleteItem($event)" [item]="currentItem"></app-item-detail>
```

이제 `deleteRequest` 이벤트가 발생하면 부모 컴포넌트의 `deleteItem()` 메서드가 실행된다.



### 이벤트 대상 확인하기

Angular는 이벤트 대상을 확인하기 위해 대상 이벤트 이름이 디렉티브의 이벤트 프로퍼티 이름과 같은지 검사한다. 그래서 아래 예제처럼 구현하면 `myClick` 이벤트가 `ClickDirective` 에서 발생한 커스텀 이벤트라는 것을 판단할 수 있다.

```html
<!-- src/app/app.component.html -->

<h4>myClick is an event on the custom ClickDirective:</h4>
<button (myClick)="clickMessage=$event">Click with myClick</button>
{{ clickMessage }}
```

엘리먼트 이벤트나 `ClickDirective` 프로퍼티에서 `myClick` 를 찾지 못하면 ‘unknown directive’ 에러가 발생한다.