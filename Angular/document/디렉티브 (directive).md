# 디렉티브 (directive)



디렉티브는 Angular 애플리케이션 안에 있는 엘리먼트에 어떤 동작을 추가하는 클래스를 의미한다.

Angular는 폼, 목록, 스타일 등에 적용할 수 있는 기본 디렉티브를 다양하게 제공한다.

Angular 디렉티브는 구체적으로 이렇게 구분할 수 있다.

1. 컴포넌트(Component) - 템플릿이 존재하는 디렉티브이다. 디렉티브 중에서는 컴포넌트 타입이 가장 많이 사용된다.
2. 어트리뷰트 디렉티브(Attribute directives) - 엘리먼트, 컴포넌트, 디렉티브의 모습이나 동작을 변경하는 디렉티브이다.
3. 구조 디렉티브(Structural directives) - 조건에 따라 DOM 엘리먼트를 추가하거나 제거하는 디렉티브이다.

------

## 기본 어트리뷰트 디렉티브

어트리뷰트 디렉티브는 HTML 엘리먼트(Element), 어트리뷰트(Attribute), 프로퍼티(Property), 컴포넌트(Component)의 동작을 변경한다.

`RouterModule` 이나 `FormsModule` 과 같이 어트리뷰트 디렉티브를 제공하는 NgModule도 많다. 이 중 자주 사용하는 어트리뷰트 디렉티브는 이런 것들이 있다

- `NgClass` - CSS 클래스를 추가하거나 제거한다.
- `NgStyle` - HTML 스타일을 추가하거나 제거한다
- `NgModel` - HTML 폼 엘리먼트에 양방향 데이터 바인딩을 연결한다

> 기본 디렉티브는 모듈 외부로 공개된 API만 사용해야한다. 외부로 공개되지 않은 API는 접근할 수 없다.

------

## NgClass로 클래스 추가/제거하기

`ngClass` 를 사용하면 CSS 클래스 여러 개를 엘리먼트에 동시에 추가하거나 제거할 수 있다.

> 클래스를 하나만 추가하거나 제거한다면 `NgClass` 보다 클래스 바인딩을 사용하는 것이 더 좋다

### NgClass에 표현식 사용하기

엘리먼트에 스타일을 지정하듯이, 엘리먼트에 `[ngClass]` 를 추가하고 이 디렉티브에 표현식을 지정할 수 있다.

`app.component.ts` 파일에서 `isSpecial` 프로퍼티 값이 `true` 로 지정되었다고 해보자. 그러면 `isSpecial` 의 값이 `ngClass` 에 반영되면서 `<div>` 에 `special` 클래스가 추가된다.

```html
<!-- src/app/app.component.html -->

<!-- "special" 클래스는 프로퍼티 바인딩으로 켜고 끌 수 있다.-->
<div [ngClass]= " isSpecial ? 'special' : '' ">This div is special</div>
```

### NgClass에 메서드 사용하기

1. `NgClass` 에 메서드를 사용하려면 이 메서드를 컴포넌트 클래스에 정의해야 한다. 아래 예제에서 `setCurrentClasses()` 메서드는 컴포넌트의 다른 프로퍼티 값을 참조해서 객체 형태로 `currentClasses` 프로퍼티 값을 할당한다. 이 때 객체의 키는 CSS클래스 이름이다. 키에 할당된 값이 `true` 이면 `ngClass` 가 해당 키를 클래스로 추가한다. 키에 할당된 값이 `false` 이면 `ngClass` 가 해당 키를 클래스에서 제거한다

   ```tsx
   // src/app/app.component.ts
   
   currentClasses: Record<string, boolean> = {};
   /* . . . */
   setCurrentClasses() {
     // CSS 클래스는 컴포넌트 프로퍼티 값에 따라 추가되거나 제거된다.
     this.currentClasses =  {
       saveable: this.canSave,
       modified: !this.isUnchanged,
       special:  this.isSpecial
     };
   }
   ```

2. 템플릿에서는 엘리먼트의 `ngClass` 를 `currentClasses` 프로퍼티와 바인딩하면 된다.

   ```html
   <!-- src/app/app.component.html -->
   
   <div [ngClass]="currentClasses">This div is initially saveable, unchanged, and special</div>
   ```

이렇게 구현하면 Angular는 변화를 감지할 때마다 엘리먼트에 적용되는 클래스를 계산한다. 그래서 `ngOnInit()` 이 실행될 때 `setCurrentClasses()` 가 처음 실행되며, 버튼을 클릭할 때마다 계속 실행된다.

## NgStyle로 인라인 스타일 지정하기