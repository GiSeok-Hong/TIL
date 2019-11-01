# TypeScript 기초 연습

- [리액트 프로젝트에서 타입스크립트 사용하기 시리즈](https://velog.io/@velopert/using-react-with-typescript)를 보고 실습하면서 작성한 글입니다.
- 처음 공부하고 있어서 부족하거나 잘못된 정보가 있을 수 있습니다. **(2019.11.01 금)**
- 조금 더 자세히 알게 되거나 수정할 부분이 있으면 바로바로 수정하겠습니다.

{:TOC}

***

### TypeScript 란?

**Microsoft**에 의해 개발/관리되고 있는 오픈소스 프로그래밍 언어이다.

대규모 어플리케이션을 개발하는 데 **JavaScript**가 어렵고 불편하다는 불만에 대응하기 위해 개발이 되었다.

TypeScript는 스크립트 언어의 표준인 **ECMA Script (줄여서 ES)** 의 표준을 따르기 때문에 JavaScript영역을 침범하지 않고 최신 ES를 지원한다.

#### TypeScript의 특징

* 가장 큰 특징은 Type을 지정하는 것으로 **TypeScript = JavaScript + Type** 으로 볼 수 있다.

  JS에 없는 타입이 지원되면서 장점이 생긴다.

  1. Type이 추가되어 안정성 확보

  2. Type에 대한 예외 처리를 하지 않아도 된다. (오버헤드 감소)

  3. JavaScript 엔진의 최적화를 돕는다.

* 컴파일 언어, 정적 타입의 언어이다.

### 목표

TypeScript를 react 프로젝트에서 사용해보기 전에 알아두면 유용한 TypeScript 기초 핵심을 배워본다.



### 실습

#### 1. 환경 준비

##### 1 ) TS 프로젝트 생성

원하는 디렉터리 경로로 이동 후 디렉터리 생성 및 package.json 파일 생성

```powershell
$ mkdir ts-practice
$ cd ts-practice
$ npm init -y
```

##### 2 ) TS 설정파일 생성

타입스크립트 설정파일 tsconfig.json 을 생성

*  **(1) 디렉터리에 tsconfig.json 파일 생성 후 직접 작성**

```json
{
  "compilerOptions": {
    "target": "es5",
    "module": "commonjs",
    "strict": true,
    "esModuleInterop": true
  }
}
```

* **(2) 명령어를 사용하여 생성**

typescript를 글로벌 설치

```powershell
$ npm install -g typescript
```

tsconfig.json 파일 생성

```powershell
$ tsc --init
```

> 19.11.01 아래와 같은 에러가 발생
>
> ![image](https://user-images.githubusercontent.com/48499094/68021809-cdaeb500-fce5-11e9-831d-a118f44bbc43.png)
>
> 찾아보니 이런 에러는 Windows에서 정책적으로 Powershell 실행에 제한이 있어서 발생한다고 한다.
>
> 해결방법으로 **관지라 권한이 있는 powershell**로 **ExecutionPolicy**를 **RemoteSigned**로 변경해주는 것으로 해결이 가능하다
>
> ```powershell
> $ Set-ExecutionPolicy RemoteSigned
> ```
>
> 권한이 바뀌었는지 확인하기
>
> ```powershell
> $ Get-ExecutionPolicy
> ```
>
> ![image](https://user-images.githubusercontent.com/48499094/68022447-a953d800-fce7-11e9-8807-225c6f6fd51e.png)

##### 3 ) `./tsconfig.json` 수정

tsconfig.json 파일에서는 타입스크립트가 컴파일 될 때 필요한 옵션을 지정한다.

* **target **: 컴파일된 코드가 어떤 환경에서 실행될 지 정의한다.
* **module** : 컴파일된 코드가 어던 모듈 시스템을 사용할지 정의한다.
* **strict** : 모든 타입 체킹 옵션을 활성화한다는 것을 의미한다.
* **esModuleInterop** : commonjs 모듈 형태로 이루어진 파일을 es2015 모듈 형태로 불러올 수 있게 해준다.
* **outDir** : 컴파일된 파일들이 저장되는 경로를 지정 할 수 있다.

```json
// ./tsconfig.json

{
  "compilerOptions": {
    "target": "es5",
    "module": "commonjs",
    "strict": true,
    "esModuleInterop": true,
    "outDir": "./dist"			// 추가 코드
  }
}
```

##### 4 )  `./src/practice.ts` 생성

```typescript
// ./src/practice.ts

const message: string = 'hello world';
console.log(message);
```

`: string` 이라는 코드를 통해서 message 상수의 값이 문자열이라고 명시했다.

만약 문자열이 아닌 숫자를 설정한다면 오류가 발생한다.

![image](https://user-images.githubusercontent.com/48499094/68023754-85929100-fceb-11e9-9b50-456cac488aea.png)



코드 작성이 끝난 후 해당 프로젝트의 디렉터리에 위치한 터미널에서 `tsc` 명령어(또는 `npx tsc`)를 입력하면 `./dist/practice.js` 경로에 다음과 같은 파일이 생성이 된다.

![image](https://user-images.githubusercontent.com/48499094/68023888-ed48dc00-fceb-11e9-9b50-871fc1eaf039.png)

* ts 파일에서 명시한 값의 타입이 컴파일이 되는 과정에서 모두 사라지게 된다.



>지금까지는 글로벌로 설치한 타입스크립트 CLI를 통해 코드를 컴파일 했었다.
>
>만약 프로젝트 내에 설치한 타입스크립트 패키지를 사용하여 컴파일 하고 싶을 땐 다음과 같은 작업을 따라야 한다. (일반적으로 타입스크립트를 사용하는 프로젝트들은 로컬로 설치한 타입스크립트 패키지를 사용해서 컴파일한다.)
>
>**(1)** 타입스크립트 로컬 설치
>
>```powershell
>$ npm install --save typescript
>```
>
>**(2)** package.json 수정
>
>`build` 스크립트 추가
>
>```json
>{
>  "name": "ts-practice",
>  "version": "1.0.0",
>  "main": "index.js",
>  "license": "MIT",
>  "dependencies": {
>    "ts-node": "^8.4.1",
>    "typescript": "^3.6.3"
>  },
>  "scripts": {
>    "build": "tsc"
>  }
>}
>```
>
>이후 빌드를 할 때 `npm run build` 라고 입력하면 된다.



#### 2. 기본 타입

`let` 과 `const` 를 사용하여 여러가지 기본 타입을 지정, 선언하는 연습

```typescript
// ./src/practice.ts

let count = 0; // 숫자
count += 1;
count = '문자열열열'; // 에러 발생

const message: string = 'hello typescript'; // 문자열

const done: boolean = true; // 불리언 값

const numbers: number[] = [1, 2, 3]; // 숫자 배열
const messages: string[] = ['hello', 'world']; // 문자열 배열

messages.push(1); // 에러 발생

let mightBeUndefined: string | undefined = undefined; // string 일수도 있고 undefined 일수도 있음
let nullableNumber: number | null = null; // number 일수도 있고 null 일수도 있음

let color: 'red' | 'orange' | 'yellow' = 'red'; // red, orange, yellow 중 하나임
color = 'yellow';
color = 'green'; // 에러 발생
```



타입스크립트를 사용하면 특정 변수 또는 상수의 타입을 지정 할 수 있고 사전에 지정한 타입이 아닌 값이 설정 될 때 바로 에러를 발생시킨다.

에러가 발생했을 땐 컴파일이 되지 않는다. 

![image](https://user-images.githubusercontent.com/48499094/68025298-c68ca480-fcef-11e9-8f9f-dbf85bacf4fb.png)



##### 1 ) 함수에서 타입 정의하기

```typescript
// ./src/practice.ts

function sum(x: number, y: number): number {
  return x + y;
}

sum(1, 2);
```

타입스크립트를 사용하면 다음과 같이 코드를 작성하는 과정에서 함수의 파라미터로 어떤 타입을 넣어야 하는지 바로 알 수 있다.

![image](https://user-images.githubusercontent.com/48499094/68025684-d35dc800-fcf0-11e9-9814-2726f5552a5c.png)



```typescript
// ./src/practice.ts

// 수자 배열의 총합을 구하는 함수
function sumArray(numbers: number[]): number {
  return numbers.reduce((acc, current) => acc + current, 0);
}

const total = sumArray([1, 2, 3, 4, 5]);
```

타입스크립트를 사용했을 때 편리한 점은 배열의 내장함수를 사용할 때도 타입 유추가 잘 이루어진다는 것이다.

![image](https://user-images.githubusercontent.com/48499094/68026438-1456dc00-fcf3-11e9-9680-ac388e7ca9e1.png)



만약 함수에서 아무것도 반환하지 않아야 한다면 반환 타입을 `void` 로 설정하면 된다.

```typescript
function returnNothing(): void {
  console.log('I am just saying hello world');
}
```



##### 2 ) Interface 사용해보기

**Interface** 는 클래스 또는 객체를 위한 타입을 지정할 때 사용되는 문법이다.

**(1) 클래스에서 interface를 implements 하기**

클래스를 만들 때 특정 조건을 준수해야 함을 명시하고 싶을 때 **interface** 를 사용하여 클래스가 가지고 있어야 할 요구사항을 설정한다. 그리고 클래스를 선언 할 때 **implements** 키워드를 사용하여 해당 클래스가 특정 **interface **의 요구사항을 구현한다는 것을 명시한다. 

```typescript
// ./src/practice.ts

// Shape 라는 interface 를 선언
interface Shape {
  getArea(): number; // Shape interface 에는 getArea 라는 함수가 꼭 있어야 하며 해당 함수의 반환값은 숫자
}

class Circle implements Shape {
  // implements 키워드를 사용하여 해당 클래스가 Shape interface 의 조건을 충족하겠다는 것을 명시

  radius: number; // 멤버 변수 radius 값을 설정

  constructor(radius: number) {
    this.radius = radius;
  }

  // 너비를 가져오는 함수를 구현
  getArea() {
    return this.radius * this.radius * Math.PI;
  }
}

class Rectangle implements Shape {
  width: number;
  height: number;
  constructor(width: number, height: number) {
    this.width = width;
    this.height = height;
  }
  getArea() {
    return this.width * this.height;
  }
}

const shapes: Shape[] = [new Circle(5), new Rectangle(10, 5)];

shapes.forEach(shape => {
  console.log(shape.getArea());
});
```

코드 작성 후 터미널에 `npm run build` 명령어 실행. 그 다음에 `node dist/practice` 명령어를 입력하여 컴파일된 스크립트를 실행해보기

![image](https://user-images.githubusercontent.com/48499094/68028225-afea4b80-fcf7-11e9-9ac8-43be031f03ca.png)



클래스의 **constructor(생성자)** 쪽 코드를 보면  

```typescript
class Rectangle implements Shape {
  width: number;
  height: number;
  constructor(width: number, height: number) {
    this.width = width;
    this.height = height;
  }
  getArea() {
    return this.width * this.height;
  }
}
```

이와 같이 `width`, `height` 멤버 변수를 선언한 다음에 `constructor` 에서 해당 값들을 하나 하나 설정했다. 타입스크립트에서는 `constructor` 의 파라미터 쪽에 `public` 또는 `private` **accessor(접근자)** 를 사용하면 직접 하나하나 설정해주는 작업을 생략해줄 수 있다.

```typescript
class Rectangle implements Shape {
  constructor(private width: number, private height: number) {
    this.width = width;
    this.height = height;
  }
  getArea() {
    return this.width * this.height;
  }
}
```



**(2) 일반 객체를 Interface 로 타입 설정하기**

```typescript
// ./src/practice.ts

interface Person {
  name: string;
  age?: number; // 물음표가 들어갔다는 것은 설정을 해도 되고 안 해도 되는 값이라는 것을 의미
}
interface Developer {
  name: string;
  age?: number;
  skills: string[];
}

const people: Person = {
  name: '홍길동',
  age: 20
};

const expert: Developer = {
  name: '임꺽정',
  skills: ['javascript', 'react']
};
```

Person과 Developer의 형태가 유사한 것을 볼 수 있다. 이럴 때 interface를 선언할 때 다른 interface를 **extends** 해서 상속받을 수 있다.

```typescript
// ./src/practice.ts

interface Person {
  name: string;
  age?: number; // 물음표가 들어갔다는 것은 설정을 해도 되고 안 해도 되는 값이라는 것을 의미
}
interface Developer extends Person{
  skills: string[];
}

const man: Person = {
  name: '홍길동',
  age: 20
};

const expert: Developer = {
  name: '임꺽정',
  skills: ['javascript', 'react']
};

const people: Person[] = [man, expert];
```



##### 3 ) Type Alias 사용하기

`type`은 특정 타입에 별칭을 붙이는 용도로 사용한다. 

```typescript
// ./src/practice.ts

type Person = {
  name: string;
  age?: number; // 물음표가 들어갔다는 것은, 설정을 해도 되고 안해도 되는 값이라는 것을 의미
};

// & 는 Intersection 으로서 두개 이상의 타입들을 합쳐준다.
type Developer = Person & {
  skills: string[];
};

const man: Person = {
  name: '홍길동'
};

const expert: Developer = {
  name: '김개발',
  skills: ['javascript', 'react']
};

type People = Person[]; // Person[] 를 앞으로 People 이라는 타입으로 사용 할 수 있다.
const people: People = [man, expert];

type Color = 'red' | 'orange' | 'yellow';
const color: Color = 'red';
const colors: Color[] = ['red', 'orange'];
```



##### 4 ) Generics

**Generics(제네릭)**은 타입스크립트에서 함수, 클래스, 인터페이스, 타입을 사용하게 될 때 여러 종류의 타입에 대하여 호환을 맞춰야 하는 상황에서 사용하는 문법이다.

**(1) 함수에서 Generics 사용하기**

예를 들어 객체 A, B를 합치는 `merge` 라는 함수를 만든다고 할 때 A 와 B 가 어떤 타입이 올지 몰라 `any` 라는 타입을 쓸 수도 있다.

```typescript
// ./src/practice.ts

function merge(a: any, b: any): any {
  return {
    ...a,
    ...b
  };
}

const merged = merge({ foo: 1 }, { bar: 1 });
```

그러나 이렇게 하면 타입추론이 깨진거라 할 수 있다. 결과가 **any** 라는 것은 **merged** 안에 무엇이 있는지 알 수 없다는 것이다.

![image](https://user-images.githubusercontent.com/48499094/68034651-67d22580-fd05-11e9-8710-4242771113c9.png)



이런 상황에 제네릭을 사용한다.

```typescript
// ./src/practice.ts

function merge<A, B>(a: A, b: B): A & B {
  return {
    ...a,
    ...b
  };
}

const merged = merge({ foo: 1 }, { bar: 1 });
```

제네릭을 사용 할 때는  `< T >` 처럼 꺽쇠 안에 타입의 이름을 넣어서 사용한다. 제네릭을 사용하면 함수의 파라미터로 넣은 실제 값의 타입을 활용하게 된다.



다른 예시

```typescript
// ./src/practice.ts

function wrap<T>(param: T) {
  return {
    param
  }
}

const wrapped = wrap(10);
```

`wrap(10)` 으로 받았기에 `wrapped` 의 타입은 `number` 가 된다.



**(2) Interface 에서 Generics 사용하기**

```typescript
// ./src/practice.ts

interface Items<T> {
  list: T[];
}

const items: Items<string> = {
  list: ['a', 'b', 'c']
};
```



**(3) Type alias 에서 Generics 사용하기**

```typescript
// ./src/practice.ts

type Items<T> = {
  list: T[];
};

const items: Items<string> = {
  list: ['a', 'b', 'c']
};
```



**(4) Class 에서 Generics 사용하기**

Queue 는 데이터를 등록 할 수 있는 자료형이며, 먼저 등록(`enqueue`)한 항목을 먼저 뽑아올 수(`dequeue`) 있는 성질을 가지고 있다.

```typescript
// ./src/practice.ts

class Queue<T> {
  list: T[] = [];
  get length() {
    return this.list.length;
  }
  enqueue(item: T) {
    this.list.push(item);
  }
  dequeue() {
    return this.list.shift();
  }
}

const queue = new Queue<number>();
queue.enqueue(0);
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4);
console.log(queue.dequeue());
console.log(queue.dequeue());
console.log(queue.dequeue());
console.log(queue.dequeue());
console.log(queue.dequeue());
```



### 실습을 마치며

기존에 공부했던 언어들과 비슷한 부분도 있어서 실습을 하는데 엄청나게 어렵지는 않았지만 손에 익히기 위해 부지런히 공부를 해야겠다. 

또 중간중간에 오류들이 뜰 때마다 어디서 오류가 났는지 헤매는 부분도 개선해 나가고 싶다...



### 참고

* [리액트 프로젝트에서 타입스크립트 사용하기](https://velog.io/@velopert/using-react-with-typescript)
* [TypeScript를 시작하기 전에 이정도는 해줘야지!](https://velog.io/@dongwon2/TypeScript%EB%A5%BC-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0-%EC%A0%84%EC%97%90-%EC%9D%B4%EC%A0%95%EB%8F%84%EB%8A%94-%ED%95%B4%EC%A4%98%EC%95%BC%EC%A7%80)
* [TypeScript란](https://medium.com/sjk5766/typescript-%EB%9E%80-37b5b6a6f884)
* [정적언어와 동적언어](https://itmining.tistory.com/65)
* [TypeScript Handbook](https://www.typescriptlang.org/docs/handbook/basic-types.html)
* [TypeScript Handbook 한글문서](https://typescript-kr.github.io/?q=)
* [이 시스템에서 스크립트를 실행 할 수 없으므로...](https://www.hahwul.com/2017/08/powershell-execution-of-scripts-is.html)