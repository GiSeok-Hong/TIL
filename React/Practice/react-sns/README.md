# React SNS 만들기

- [React SNS 만들기 시리즈](https://eomtttttt-develop.tistory.com/186)를 보고 실습하면서 작성한 글입니다.
- 처음 공부하고 있어서 부족하거나 잘못된 정보가 있을 수 있습니다. **(2020.01.03 금)**
- 조금 더 자세히 알게 되거나 수정할 부분이 있으면 바로바로 수정하겠습니다.



### 목표

* React를 사용하여 sns 만들어 보기
* React 손에 익히기



### 실습



* 시작 폴더 구조

![image](https://user-images.githubusercontent.com/48499094/71724828-17965180-2e75-11ea-8bc8-ea4282c1fb10.png)

1. package.json 작성

```json
// Front/package.json
{
  "name": "react-nodebird-front",
  "version": "1.0.0",
  "description": "",
  "main": "index.js",
  "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "dev": "next",
    "build": "next build",
    "start": "next start"
  },
  "author": "TeiEom",
  "license": "ISC",
  "dependencies": {
    "antd": "^3.20.5",
    "next": "^9.0.2",
    "react": "^16.8.6",
    "react-dom": "^16.8.6"
  },
  "devDependencies": {
    "eslint": "^6.1.0",
    "eslint-plugin-import": "^2.18.2",
    "eslint-plugin-react": "^7.14.3",
    "eslint-plugin-react-hooks": "^1.6.1",
    "nodemon": "^1.19.1",
    "webpack": "^4.36.1"
  }
}
```



2. react, react-dom, next 설치 (package.json 경로에서)

    ```bash
   $ npm install
    ```



3. 바로 실행을 하면 에러 발생

```bash
$ npm run dev
```

![image](https://user-images.githubusercontent.com/48499094/71724983-adca7780-2e75-11ea-8d10-891c5ed0c5ba.png)

* next 의 특징
  * ing



4. pages 폴더 생성 및 index, profile, signup.js 생성











### 실습을 마치며

### 참고

* [React SNS 만들기 시리즈](https://eomtttttt-develop.tistory.com/186)
* [Next JS](https://velog.io/@geonhwi/TIL-191025-Next-ssk25jaij6)