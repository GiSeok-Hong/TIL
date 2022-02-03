# 의존성 주입(Dependency Injection)



Angular는 TypeScript 클래스를 활용하는 의존성 주입 시스템을 제공하기 때문에 컴포넌트에 필요한 객체의 인스턴스를 어떻게 생성하는지 직접 신경쓸 필요가 없다. 인스턴스 생생은 Angular 가 알아서 처리한다. 이런 패턴 덕분에 애플리케이션 코드를 좀 더 유연하게 작성할 수 있으며 테스트하기도 쉽다.

- 예제

  `logger.service.ts` 에는 `Logger` 클래스가 정의되어 있고 이 클래스에는 인자로 받은 숫자를 콘솔에 출력하는 `writeCount` 함수가 정의되어 있다.

```tsx
// src/app/logger.service.ts

import { Injectable } from '@angular/core';

@Injectable({providedIn: 'root'})
export class Logger {
  writeCount(count: number) {
    console.warn(count);
  }
}
```

그리고 `hello-wordl-di.component.ts` 파일에는 Angular 컴포넌트가 정의되어 있다. 이 컴포넌트에는 버튼이 하나 있는데, 이 버튼을 클릭하면 Logger 클래스에 있는 `writeCount` 함수를 실행하려고 한다. 그러면 `HelloWorldDI` 클래스 생성자에 `private logger:Logger`  라는 코드는 추가해서 `Logger` 서비스가 의존성 객체로 주입되도록 요청할 수 있다.

```tsx
// src/app/hello-world-di/hello-world-di.component.ts

import { Component } from '@angular/core';
import { Logger } from '../logger.service';

@Component({
  selector: 'hello-world-di',
  templateUrl: './hello-world-di.component.html'
})
export class HelloWorldDependencyInjectionComponent  {
  count = 0;

  constructor(private logger: Logger) { }

  onLogMe() {
    this.logger.writeCount(this.count);
    this.count++;
  }
} 
```