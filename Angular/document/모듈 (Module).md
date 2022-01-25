# 모듈 (Module)



Angular는 JavaScript(ES2015) 모듈과 다르지만 서로 보완할 수 있는 `NgModule` 체계를 마련해 두었다.

NgModule은 기능적으로 관련되거나 작업 흐름이 연관된 컴포넌트를 묶어서 선언한다. 그리고 이 NgModule에는 컴포넌트 외에 서비스나 폼 기능을 포함하기도 한다.

모든 Angular 앱에는 보통 `AppModule` 이라는 이름으로 선언하는 최상위 모듈이 존재한다. 애플리케이션의 부트스트랩 방법은 이 모듈에서 지정하며, 이 모듈 아래로 여러 기능 모듈을 포함할 수 있다.

JavaScript 모듈과 비슷하게 NgModule도 다른 NgModule을 불러오거나 다른 NgModule을 위해 모듈의 기능 일부를 외부로 공개할 수 있다. 예를 들어 애플리케이션에서 라우터 서비스를 사용하려면 `Router` NgModule을 불러와야 한다.

비슷한 코드를 하나의 기능 모듈로 관리하면 코드를 더 효율적으로 관리할 수 있다. 이렇게 만든 모듈은 코드를 재사용하는 측면에서도 더 효율적이며, 복잡한 애플리케이션을 개발할수록 체감할 수 있는 효율이 증가할 것이다. 그리고 코드를 모듈로 관리하면 애플리케이션이 실행될 때 모든 모듈을 한 번에 불러오지 않고, 필요할 때 불러오는 지연 로딩을 활용할 때도 유리하다. 지연 로딩을 활용하면 애플리케이션의 초기 실행 속도를 최소화할 수 있다.

```tsx
// src/app/app.module.ts
// 예시
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

// 컴포넌트
import { AppComponent } from './app.component';
import { HeroDetailComponent } from './hero-detail.component';
import { HeroListComponent } from './hero-list.component';
import { SalesTaxComponent } from './sales-tax.component';

// 서비스
import { HeroService } from './hero.service';
import { BackendService } from './backend.service';
import { Logger } from './logger.service';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule
  ],
  declarations: [
    AppComponent,
    HeroDetailComponent,
    HeroListComponent,
    SalesTaxComponent
  ],
  providers: [
    BackendService,
    HeroService,
    Logger
  ],
  bootstrap: [ AppComponent ]
})
export class AppModule { }
```





------



## 모듈 소개

Angular 애플리케이션은 Angular에서 제공하는 NgModule이라는 모듈 체계로 구성된다. **NgModule은 애플리케이션 도메인이나 작업 흐름, 기능이 연관된 Angular 구성요소들을 묶어놓은 단위이다**. NgModule에는 컴포넌트나 서비스 프로바이더 등이 포함될 수 있으며, NgModule의 일부를 외부로 공개할 수도 있고, 다른 NgModule에서 이 부분을 가져와서 사용할 수도 있다.

모든 Angular 애플리케이션에는 최상위 모듈이 반드시 존재하며, 이 모듈은 보퉁 `app.module.ts` 파일에 `AppModule` 이라고 정의한다. 애플리케이션은 이 NgModule 을 부트스트랩하며 시작된다.

애플리케이션의 규모가 작다면 NgModule은 하나만 있을 수도 있지만, 대부분은 좀 더 많은 기능 모듈로 구성된다. 이 모듈은 `AppModule` 의 자식 계층으로 구성되기 때문에 `AppModule` 을 최상위 모듈이라고 한다.



------



## NgModule 메타데이터

NgModule은 클래스에 `@NgModule()` 데코레이터를 붙여서 정의하는데, 모듈을 정의하는 메타데이터 객체를 전달하면서 실행한다. 이 메타데이터 프로퍼티 중 다음 항목들이 특히 중요하다.

- `declarations` : 해당 NgModule에 포함될 컴포넌트나 디렉티브, 파이프를 선언한다.
- `exports` : 모듈의 구서 요소를 다른 NgModule이나 컴포넌트 템플릿으로 재사용할 수 있도록 외부로 공개한다.
- `imports` : 다른 모듈에서 공개한 클래스를 지금 정의하는 NgModule에 가져올 때 사용한다.
- `providers` : NgModule 컨텍스트 안에서 사용하는 서비스 프로바이더를 지정한다. NgModule 안에서 사용하는 서비스는 이렇게 지정된 서비스 프로바이더를 사용해서 생성되며, 필요한 경우에는 하위 계층에 사용할 서비스 프로바이더를 따로 지정할 수 있다.
- `bootstrap` : 애플리케이션의 최상위 뷰로 표시될 최상위 컴포넌트를 지정한다. `bootstrap` 프로퍼티는 최상위 NgModule 에만 지정할 수 있다.

NgModule을 구성하는 방법에 따라 애플리케이션이 조합되는 방식이 달라지기 때문에 NgModule은 인젝터(Injector)와 컴파일러에 영향을 미친다.

최상위 NgModule을 간단하게 만들면 다음처럼 구현할 수 있다.

```tsx
// src/app/app.module.ts
// 심볼 로드하기
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';

// @NgModule 데코레이터에 메타데이터 사용하기
@NgModule({
	imports:      [ BrowserModule ],
	providers:    [ Logger ],
	declarations: [ AppComponent ],
	exports:      [ AppComponent ],
	bootstrap:    [ AppComponent ]
)}
export class AppModule { }
```

> 위 코드에서 `exports` 프로퍼티는 이 프로퍼티를 어떻게 사용하는지 설명하기 위해 추가했다. 최상위 모듈은 다른 NgModule에서 참조할 일이 없기 때문에 어떤 구성요소라도 exports로 지정할 필요가 없다.



------



## NgModule과 컴포넌트

NgModule은 컴포넌트가 컴파일되는 시점의 컨텍스트를 제공한다. 최상위 NgModule은 생성하는 컴포넌트가 최상위 컴포넌트 하나지만, 다른 NgModule은 컴포넌트를 여러개 갖고 있을 수도 있고, 이 컴포넌트들은 라우터나 템플릿의 동작에 따라 뷰에 로드된다. 모듈에 속한 컴포넌트는 그 NgModule에서 제공하는 컴파일 컨텍스트를 사용한다.

컴포넌트는 템플릿과 함께 뷰를 정의한다. 컴포넌트는 뷰 계층을 구성할 수도 있고, 이 뷰 계층을 활용하면 복잡한 화면에서 일부 엘리먼트만 추가하거나 제거할 수 있고 갱신을 할 수도 있다. 뷰 계층은 다른 NgModule에 정의된 컴포넌트와 조합할 수도 있다. 서드파티 UI 라이브러리를 사용하는 것이 이 경우에 해당된다.



컴포넌트를 정의할 때는 호스트 뷰(host view)라는 뷰가 연결된다. 호스트 뷰는 뷰 계층에서 컴포넌트가 차지하는 최상위 뷰를 가리키며, 뷰 안에 컴포넌트를 추가해서 종속된 뷰(enbedded view)를 자유롭게 구성할 수도 있다. 이 때 추가되는 컴포넌트는 부모 컴포넌트와 같은 NgModule에 있거나 다른 NgModule에서 가져온 컴포넌트가 될 수 있다.

> 뷰 계층은 Angular가 DOM이나 앱 데이터가 변할 때 변화를 감지하는 단위가 되기 때문에 효율적으로 구성하는 것이 중요하다.





------



## NgModule과 JavaScript 모듈

Angular가 제공하는 NgModule 체계는 JavaScript에서 객체를 묶어 관리하는 JavaScript(ES2015)모듈 시스템과 다르다. 두 모듈 체계는 독립적이지만 상호 보완적이며 Angular 애플리케이션에는 두 모듈 체계가 함께 사용된다.

JavaScript 에서는 각각의 파일이 하나의 모듈이며, 이 파일에 정의된 모든 객체가 이 모듈 안에 속한다고 할 수 있다. 그리고 모듈 안에 있는 객체를 외부로 공개하려면 `export` 키워드를 사용하며, 다른 JavaScript 모듈에서는 import 구문을 사용해서 이 객체에 접근할 수 있다.

```tsx
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
export class AppModule {}
```





------



## Angular 라이브러리 모듈



Angular 프레임워크는 JavaScript 모듈 형태로 제공되며, 프레임워크 자체를 라이브러리 모듈의 묶음으로 생각할 수도 있다. 각각의 Angular 라이브러리는 `@angular` 라는 접두사로 시작하며, `npm` 패키지 매니저를 사용해서 설치하고 JavaScript `import` 구문으로 불러와서 사용한다.

예를 들어, Angular의 `@angular/core` 라이브러리에 있는 `Component` 데코레이터는 다음과 같이 사용한다.

```tsx
import { Component } from '@angular/core';

@Component ({
	...
)}
```

그리고 Angular에서 제공하는 NgModule도 비슷한 방법으로 불러와서 사용한다. 다음 코드는 `platform-browser` 라이브러리에서 `BrowserModule` NgModule을 로드하는 코드이다

```tsx
import { BrowserModule } from '@angular/platform-browser';
```

위에서 본 최상위 모듈 예제처럼, Angular 모듈은 `BrowserModule` 안에 정의되어 있는 객체를 사용한다.

이 객체에 접근하려면 `@NgModule` 메타데이터의 `imports` 프로퍼티를 다음과 같이 사용하면 된다.

```tsx
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
@NgModule({
	imports: [ BrowserModule ],
)}
```