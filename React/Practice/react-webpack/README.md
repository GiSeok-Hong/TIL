# WEBPACK

* [개발환경을 구축하면서 배우는 Webpack 기초](https://velog.io/@jeff0720/React-%EA%B0%9C%EB%B0%9C-%ED%99%98%EA%B2%BD%EC%9D%84-%EA%B5%AC%EC%B6%95%ED%95%98%EB%A9%B4%EC%84%9C-%EB%B0%B0%EC%9A%B0%EB%8A%94-Webpack-%EA%B8%B0%EC%B4%88)를 보고 실습하면서 작성한 글입니다.

* 처음 공부하고 있어서 부족하거나 잘못된 정보가 있을 수 있습니다. (2019.10.30 수)
* 조금 더 자세히 알게 되거나 수정할 부분이 있으면 바로바로 수정하겠습니다.

{:TOC}



***

### Webpack이란?

웹팩에 대한 개념을 잡기 위해서는 우선 모듈 번들러(Module Bundler)가 무엇인지 알아야 한다.

#### Module

* 프로그램을 구성하는 구성 요소의 일부
* 관련된 데이터와 함수들이 묶여서 모듈을 형성하고 파일 단위로 나뉘는 것이 일반적이다.
* 모듈화 프로그래밍은 기능별로 파일을 나눠가며 프로그래밍을 하는 것으로 유지보수가 쉽다는 장점이 있다.

#### Bundler

* 번들러는 지정한 단위로 파일들을 하나로 만들어서 요청에 대한 응답으로 전달할 수 있는 환경을 만들어주는 역할을 한다.
* 번들러를 사용하면 소스 코드를 모듈별로 작성할 수 있고 모듈간 또는 외부 라이브러리의 의존성도 쉽게 관리할 수 있다.

#### Webpack

* 웹팩(Webpack)은 자바스크립트 정적 모듈 번들러(Static Module Bundler)이다
* 웹팩에서 모든 것은 모듈이다. 자바스크립트, 스타일시트, 이미지 등 모든 것을 자바스크립트 모듈로 로딩해서 사용한다.

* 웹팩의 주요 네 가지 개념으로 **Entry**, **Output**, **Loader**, **Plugin**이 있다.

##### 1. Entry

* 의존성 그래프의 시작점을 웹팩에서는 엔트리(Entry)라고 한다.
* 웹팩은 엔트리를 통해서 필요한 모듈을 로딩하고 하나의 파일로 묶는다.
* 여러개의 엔트리가 존재할 수 있다.

##### 2. Output

* 엔트리에 설정한 자바스크립트 파일을 시작으로 하나로 묶는다. 그후 번들된 결과물을 처리할 위치를 output에 기록한다.

##### 3. Loader

* 웹팩은 오직 JavaScript와 Json만 이해할 수 있다.
* 로더는 다른 Type의 파일(img, font, stylesheet 등)을 웹팩이 이해하고 처리 가능한 모듈로 변환 시키는 작업을 한다.

##### 4. Plugin

* 로더가 파일단위로 처리하는 반면 플러그인은 번들된 결과물을 처리한다.
* 로더가 변환하는 동안 플러그인은 bundle optimization, asset management and injection of environment과 같은 일을 진행할 수 있다.



### 실습

#### 1. `package.json` 파일 생성

실습을 위한 디렉터리(react-webpack)를 만든 후 아래 명령어를 통해 초기화

```react
npm init -y
```

#### 2. Webpack 및 사용할 라이브러리 설치

```react
npm install -save-dev @babel/core @babel/preset-env @babel/preset-react babel-loader clean-webpack-plugin css-loader html-loader html-webpack-plugin mini-css-extract-plugin node-sass react react-dom sass-loader style-loader webpack webpack-cli webpack-dev-server
```

#### 3. `./src/test.js` 생성

```react
// ./src/test.js

console.log("webpack test");
```

#### 4. `./webpack.config.js` 생성

```react
// ./webpack.config.js

const path = require("path");

module.exports = {
  entry: "./src/test.js",
  output: {
    filename: "bundle.js",
    path: path.resolve(__dirname + "/build")
  },
  mode: "none"
};
```

> * entry 
>
>   웹팩이 빌드할 파일을 알려주는 역할
>
>   여기서는 src/test.js 파일 기준으로 import 되어 있는 모든 파일들을 찾아 하나의 파일로 합치게 된다.
>
> * output
>
>   웹팩에서 빌드를 완료하면 output에 명시되어 있는 정보를 통해 빌드 파일을 생성
>
> * mode : 웹팩 빌드 옵션
>   * production : 최적화되어 빌드 되어지는 특징
>   * development : 빠르게 빌드하는 특징
>   * none : 아무 기능 없이 웹팩으로 빌드

#### 5. `./package.json`에 내용 수정

```react
  "scripts": {
    "build": "webpack"
  },
```

>webpack 명령어가 실행되면 디폴트로 실행할 파일은 같은 경로에 있는 webpack.config.js에 내용을 가지고 빌드 된다.

#### 6. Build 하기

```react
npm run-script build
```

![image](https://user-images.githubusercontent.com/48499094/67845431-d024d980-fb42-11e9-99e3-11d78175e7b6.png)



정상적으로 실행이 되었다면 `build` 폴더와 `bundle.js` 파일이 생성된다.

![image](https://user-images.githubusercontent.com/48499094/67845568-08c4b300-fb43-11e9-8635-cf4af65e9de5.png)



#### 7. Webpack으로 HTML 빌드하기

>웹팩은 자바스크립트 파일뿐만 아니라 다른 파일들도 모듈로 관리 할 수 있는데 Loader 기능이 자바스크립트 이외의 파일을 웹팩이 이해할 수 있게 해준다.
>
>* 로더 사용법
>
>```react
>module : {
>    rules: {
>        test: '가지고올 파일 정규식',
>        use: [
>            {
>                loader: '사용할 로더 이름',
>                options: { 사용할 로더 옵션 }
>            }
>        ]
>    }
>}
>```

##### 1 ) `./public/index.html` 생성

```html
<!-- ./public/index.html -->
<!DOCTYPE html>
<html lang="kr">
  <head>
    <meta charset="utf-8" />
    <title>WEBPACK4-REACT</title>
  </head>
  <body>
    <noscript>스크립트가 작동되지 않습니다!</noscript>
    <div id="root"></div>
  </body>
</html>
```

##### 2 ) `./webpack.config.js` 수정

```react
// ./webpack.config.js

const path = require("path");
const HtmlWebPackPlugin = require("html-webpack-plugin");

module.exports = {
  entry: "./src/test.js",
  output: {
    filename: "bundle.js",
    path: path.resolve(__dirname + "/build")
  },
  mode: "none",
  module: {
    rules: [
      {
        test: /\.html$/,
        use: [
          {
            loader: "html-loader",
            options: { minimize: true }
          }
        ]
      }
    ]
  },
  plugins: [
    new HtmlWebPackPlugin({
            template: './public/index.html', // public/index.html 파일을 읽는다.
      filename: 'index.html' // output으로 출력할 파일은 index.html 이다.
    })
  ]
};
```

> **HtmlWebPackPlugin **은 웹팩이 html 파일을 읽어서 html 파일을 빌드할 수 있게 해준다.
>
> **loader** 는 html 파일을 읽었을 때 **html-loader**를 실행하여 웹팩이 이해할 수 있게 하고 **options** 로는 **minimize**라는 코드 최적화 옵션을 사용하고 있다.

##### 3 ) Build 하기

```react
npm run-script build
```

정상적으로 실행이 되었다면 `./build/index.html` 파일이 생성된다.

![image](https://user-images.githubusercontent.com/48499094/67847768-c2715300-fb46-11e9-97a3-e4ff7e02ca39.png)

> **minimize** 옵션이 켜져 있어서 파일 내용이 한줄로 되어 있다. 
>
> **minimize** 옵션을 끈다면 줄바꿈된 형태로 나온다.
>
> **HtmlWebPackPlugin** 은 웹팩 빌드시 output에 있는 bundle.js를 자동으로 import 한다.



#### 8. Webpack으로 React 빌드하기

##### 1 ) `./src/index.js` 생성

```react
import React from "react";
import ReactDOM from "react-dom";
import Root from "./Root";

ReactDOM.render(<Root />, document.getElementById("root"));
```

##### 2 ) `./src/Root.js` 생성

```react
import React from 'react';

const Root = () => {
  return (
    <h3>Hello, React</h3>
  );
};

export default Root;
```

##### 3 ) `./.babelrc` 생성

```react
{
  "presets": ["@babel/preset-env", "@babel/preset-react"]
}
```

> 바벨(Babel)은 ES6에서 ES5로 자바스크립트를 변환해주는 역할을 한다.
>
> 위 코드는 바벨이 ES6와 리액트를 ES5로 변환할 수 있게 해주는 내용이다.

##### 4 ) `./webpack.config.js` 수정

```react
// ./webpack.config.js

const path = require("path");
const HtmlWebPackPlugin = require("html-webpack-plugin");

module.exports = {
  entry: "./src/index.js",
  output: {
    filename: "bundle.js",
    path: path.resolve(__dirname + "/build")
  },
  mode: "none",
  module: {
    rules: [
      {
        test: /\.(js|jsx)$/,
        exclude: "/node_modules",
        use: ['babel-loader'],
      },
      {
        test: /\.html$/,
        use: [
          {
            loader: "html-loader",
            options: { minimize: true }
          }
        ]
      }
    ]
  },
  plugins: [
    new HtmlWebPackPlugin({
      template: './public/index.html', // public/index.html 파일을 읽는다.
      filename: 'index.html' // output으로 출력할 파일은 index.html 이다.
    })
  ]
};
```

##### 5 ) Build 하기

```react
npm run-script build
```

build 후 index.html 파일을 열면 **Hello, React** 가 보인다.

![image](https://user-images.githubusercontent.com/48499094/67849897-ad96be80-fb4a-11e9-9e7b-e47c2f1ec5af.png)

![image](https://user-images.githubusercontent.com/48499094/67849962-d15a0480-fb4a-11e9-9167-2576963daee0.png)



#### 9. Webpack에서 CSS 사용하기





### 참고

* [Webpack github](https://github.com/webpack/webpack)
* [개발환경을 구축하면서 배우는 Webpack 기초](https://velog.io/@jeff0720/React-%EA%B0%9C%EB%B0%9C-%ED%99%98%EA%B2%BD%EC%9D%84-%EA%B5%AC%EC%B6%95%ED%95%98%EB%A9%B4%EC%84%9C-%EB%B0%B0%EC%9A%B0%EB%8A%94-Webpack-%EA%B8%B0%EC%B4%88)
* [TOAST UI](https://ui.toast.com/fe-guide/ko_BUNDLER/)
* [왜 번들러를 사용하는가?](http://blog.naver.com/PostView.nhn?blogId=magnking&logNo=220959942351&redirect=Dlog&widgetTypeCall=true)
* [Wikipedia](https://ko.wikipedia.org/wiki/%EC%9B%B9%ED%8C%A9)
* [생활코딩](https://opentutorials.org/course/743/4750)

