# Create React App: React Router, Redux Saga, and More

[Bruno Krebs님의 글](https://auth0.com/blog/beyond-create-react-app-react-router-redux-saga-and-more/)을 보고 실습하면서 작성한 글입니다.



목차

{:toc}

***



### 전제 조건

Node.js 와 NPM 설치를 해야한다.

* [Node.js Download](https://nodejs.org/en/download/)



### 만드려는 것

매우 간단한 To-do list manager application

![image](https://user-images.githubusercontent.com/48499094/67721763-bbe5bd00-fa1a-11e9-834c-4714332211b5.png)



### 실습

#### 1. 터미널을 통해 app 생성

```react
npx create-react-app react-todo
```

> 만약 npm이 아니라 yarn을 설치했다면 npm 대신 yarn을 쓰면 된다.
>
> ex)
>
> ```react
> yarn create-react-app react-todo
> ```

설치하는데 약 2분 정도 소요된다.

![image](https://user-images.githubusercontent.com/48499094/67688473-398ad800-f9dd-11e9-9324-b361678b5da1.png)



#### 2. Prettier 설치

```react
npm install husky lint-staged prettier
```

> Husky
>
> * GitHook을 편하게 작성할 수 있게 도와주는 도구
>   * 프로그래밍에서 Hook이란 특정 이벤트 또는 함수가 호출 되기 전, 후에 호출이 되는 코드를 말한다.
>   * 즉 Git에서 commit, pull, merge 등과 같은 이벤트가 발생 할 때 호출이 되는 코드를 GitHook이라 한다
>
> Lint-staged
>
> * staged된 파일들을 lint 해주는 도구
>   * Lint 툴은 원래 유닉스계열에서 C언어 코드가 제대로 코딩이 되었는지를 체크하는 스크립트이다.
>   * staged는 커밋으로 저장소에 기록할 상태
>
> Prettier
>
> * Visual Studio Code Extention 으로 정해진 규칙에 따라 자동으로 코드 스타일을 정리 해주는 도구
>
> [출처]
>
> * [코드 컨벤션 자동화](http://guswnsxodlf.github.io/auto-js-code-convention)
> * [githook](http://meonggae.blogspot.com/2017/03/git-git-hooks.html)
> * [Javascript Lint](http://blog.naver.com/PostView.nhn?blogId=hji7000&logNo=220658622248&parentCategoryNo=&categoryNo=43&viewDate=&isShowPopularPosts=false&from=postView)
> * [staged]([https://git-scm.com/book/ko/v2/Git%EC%9D%98-%EA%B8%B0%EC%B4%88-%EC%88%98%EC%A0%95%ED%95%98%EA%B3%A0-%EC%A0%80%EC%9E%A5%EC%86%8C%EC%97%90-%EC%A0%80%EC%9E%A5%ED%95%98%EA%B8%B0](https://git-scm.com/book/ko/v2/Git의-기초-수정하고-저장소에-저장하기))

![image](https://user-images.githubusercontent.com/48499094/67694549-d9009880-f9e6-11e9-9cb2-7f4cd80cd56b.png)



#### 3. React Bootstrap 설치

``` react
npm install react-bootstrap bootstrap
```



![image](https://user-images.githubusercontent.com/48499094/67695109-e8ccac80-f9e7-11e9-9dd3-73032d42cda8.png)

설치 후 link 코드 추가

```react
// ./public/index.html
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- ... title and other elements ... -->
    <link
      rel="stylesheet"
   	  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
      integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
      crossorigin="anonymous"
    />
  </head>

```



#### 4. `./src/App.js`  수정

```react
import React, { Component } from 'react';
import Container from 'react-bootstrap/Container';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';

class App extends Component {
  render() {
    return (
      <Container>
        <Row className="row">
          <Col xs={12}>
            <h1>My New React Bootstrap SPA</h1>   {/* 원하는 내용 */}
            <Button>Look, I'm a button!</Button>  {/* 원하는 내용 */} 
          </Col>
        </Row>
      </Container>
    );
  }
}

export default App;
```

실행을 해보면 아래와 같이 나온다.

![image](https://user-images.githubusercontent.com/48499094/67696150-b15eff80-f9e9-11e9-9f7b-a385bde712d7.png)

#### 5. Prop Types 설치

```react
npm install --save prop-types
```

> Prop Type
>
> * component에 들어온 값이 유효한 값인지 prop의 type을 미리 정의해 놓는 것
>
> [출처]
>
> * [proptype이란?](https://13akstjq.github.io/react/2019/06/02/react-proptypes.html)



#### 6. Redux와 React-redux 설치

```react
npm install --save redux react-redux
```



#### 7. Redux action 정의

```react
// src/actions/index.js

// 액션 타입 정의
export const ADD_TODO = 'ADD_TODO';

// 액션 생성함수 정의
export function addToDo(title) {
  return {
    type: ADD_TODO,
    toDoItem: {
      _id: (new Date().getTime()).toString(),
      title
    }
  };
}
```

* action은 type이 필수이다.



#### 8. Redux reducer 생성

```react
// src/reducers/index.js

import { ADD_TODO } from '../actions';

// 초기상태 정의
const initialState = {
  toDoList: []
};

// 리듀서 작성
export default function toDoApp(state = initialState, action) {
  switch (action.type) {
    case ADD_TODO:
      let newToDoList = [
        ...state.toDoList,
        {
          ...action.toDoItem
        }
      ];
      return {
        ...state,
        toDoList: newToDoList
      };
    default:
      return state;
  }
}
```

* 이 파일의 두 가지 목표
  1. 초기값인 initialState를 정의
  2. 리듀서인 toDoApp이 ADD_TODO action을 받았을 때 무엇을 하는지 정의



#### 9. Redux store 생성

```react
// ./src/index.js

import React from 'react';
import { render } from 'react-dom';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import toDoApp from './reducers';
import App from './App';
import * as serviceWorker from './serviceWorker';

// 스토어 생성
const store = createStore(toDoApp);

render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);

serviceWorker.unregister();
```

* 스토어를 생성 할 때는 createStore 함수에 파라미터로 reducer를 넣는다



#### 10. React components 정의

* containers 폴더 : Container Components를 생성
  * Container Component( = Smart Component) : 리덕스와 연동된 컴포넌트
  * 컨테이너 컴포넌트 쪽에서는 유저 인터랙션쪽에 집중 할 수 있다는 장점이 있다

```react
// ./src/containers/AddToDo.js

import React from 'react';
import { connect } from 'react-redux';
import { addToDo } from '../actions';
import Button from 'react-bootstrap/Button';
import Form from 'react-bootstrap/Form';
import InputGroup from 'react-bootstrap/InputGroup';


// 유저가 submit 하면 이 컴포넌트가 액션함수인 addToDo를 생성하는 작업을 리듀서인 리듀서인 toDoApp에 전송
let AddToDo = ({ dispatch }) => {
  let input;

  return (
    <Form
      onSubmit={e => {
        e.preventDefault();
        if (!input.value.trim()) {
          return;
        }
        dispatch(addToDo(input.value));
        input.value = '';
      }}
    >
      <Form.Group controlId="formBasicEmail">
        <InputGroup>
          <Form.Control
            type="text"
            placeholder="Enter an item"
            ref={node => {
              input = node;
            }}
          />
          <InputGroup.Append>
            <Button type="submit">Add To-Do</Button>
          </InputGroup.Append>
        </InputGroup>
      </Form.Group>
    </Form>
  );
};

// 컴포넌트에 redux store를 연동해줄 때는 connect 함수 사용
AddToDo = connect()(AddToDo);

export default AddToDo;
```

* components 폴더 : Presentational Components를 생성
  * Presentational Component( = Dumb Component) : 단순히 props를 전달해주면 그대로 보여주는 컴포넌트들
  * UI의 모양새에만 집중 할 수 있다는 장점이 있다.

```react
// ./src/components/ToDo.js
// 하나의 to-do item을 랜더링함

import React from 'react';
import PropTypes from 'prop-types';
import ListGroup from 'react-bootstrap/ListGroup';

const ToDo = ({ title }) => <ListGroup.Item>{title}</ListGroup.Item>;

ToDo.propTypes = {
  title: PropTypes.string.isRequired
};

export default ToDo;
```



```react
// ./src/components/ToDoList.js
// to-do items의 리스트를 랜더링함

import React from 'react';
import PropTypes from 'prop-types';
import ListGroup from 'react-bootstrap/ListGroup';
import Jumbotron from 'react-bootstrap/Jumbotron';
import ToDo from './ToDo';

const ToDoList = ({ toDoList }) => (
  <Jumbotron>
    <ListGroup>
      {toDoList.map((toDo, index) => (
        <ToDo key={index} {...toDo} />
      ))}
    </ListGroup>
  </Jumbotron>
);

ToDoList.propTypes = {
  toDoList: PropTypes.arrayOf(
    PropTypes.shape({
      _id: PropTypes.string.isRequired,
      title: PropTypes.string.isRequired
    }).isRequired
  ).isRequired
};

export default ToDoList;
```



```react
// ./src/containers/ToDoListContainer.js

import { connect } from 'react-redux';
import ToDoList from '../components/ToDoList';

const mapStateToProps = state => {
  return {
    toDoList: state.toDoList
  };
};

const ToDoListContainer = connect(mapStateToProps)(ToDoList);

export default ToDoListContainer;
```



```react
// ./src/App.js

import React, { Component } from 'react';
import Container from 'react-bootstrap/Container';
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';

import AddToDo from './containers/AddToDo';
import ToDoListContainer from './containers/ToDoListContainer';

class App extends Component {
  render() {
    return (
      <Container>
        <Row className="row">
          <Col xs={12}>
            <h1>To Do List</h1>
            <AddToDo />
            <ToDoListContainer />
          </Col>
        </Row>
      </Container>
    );
  }
}

export default App;
```



* 별 문제 없이 진행했다면 실행했을 때 다음과 같이 작동을 한다.

![image](https://user-images.githubusercontent.com/48499094/67704745-08200580-f9f9-11e9-8e1b-fc3f6bb5e6bb.png)



#### 11. Redux-saga 설치

```react
npm i redux-saga
```

* Redux-saga : 리액트/리덕스 애플리케이션의 사이드 이펙트, 예를 들면 데이터 fetching이나 브라우저 캐시에 접근하는 순수하지 않은 비동기 동작들을, 더 쉽고 좋게 만드는 것을 목적으로하는 라이브러리입니다.

```react
// src/actions/index.js

// 액션 타입 정의
export const ADD_TODO = 'ADD_TODO';
export const LOAD_TODO_LIST = 'LOAD_TODO_LIST';     // 11단계에서 추가
export const RENDER_TODO_LIST = 'RENDER_TODO_LIST'; // 11단계에서 추가

// 액션 생성함수 정의
export function addToDo(title) {
  return {
    type: ADD_TODO,
    toDoItem: {
      _id: (new Date().getTime()).toString(),
      title
    }
  };
}

// 11단계에서 추가
export function loadToDoList() {
  return {
    type: LOAD_TODO_LIST
  };
}
```

* `LOAD_TODO_LIST` : 외부서버에서 to-do list를 불러온다
* `RENDER_TODO_LIST` : load된 to-do list를 랜더링한다.



```react
// src/reducers/index.js

import { ADD_TODO } from '../actions';
import { RENDER_TODO_LIST } from '../actions';  // 11단계에서 추가

// 초기상태 정의
const initialState = {
  toDoList: []
};

// 리듀서 작성
export default function toDoApp(state = initialState, action) {
  switch (action.type) {
    case RENDER_TODO_LIST:                     // 11단계에서 추가
      return {
        ...state,
        toDoList: action.toDoList
      };
    case ADD_TODO:
      let newToDoList = [
        ...state.toDoList,
        {
          ...action.toDoItem
        }
      ];
      return {
        ...state,
        toDoList: newToDoList
      };
    default:
      return state;
  }
}
```



#### 12. Saga 생성

```react
// ./src/sagas/index.js

import { all, call, put, takeEvery } from 'redux-saga/effects';
import { LOAD_TODO_LIST, RENDER_TODO_LIST } from '../actions';

export function* fetchToDoList() {
  const endpoint = 'https://gist.githubusercontent.com/brunokrebs/f1cacbacd53be83940e1e85860b6c65b/raw/to-do-items.json';
  const response = yield call(fetch, endpoint);
  const data = yield response.json();
  yield put({ type: RENDER_TODO_LIST, toDoList: data });
}

export function* loadToDoList() {
  yield takeEvery(LOAD_TODO_LIST, fetchToDoList);
}

export default function* rootSaga() {
  yield all([loadToDoList()]);
}
```

* 우리가 생성한 saga는 fetchToDoList와 loadToDoList

* fetchToDoList saga가 api(여기서는 static JSON file)에서 data를 로딩하는게 끝이 나면 put함수를 통해 RENDER_TODO_LIST action과 to-do items의 새 리스트를 dispatch(reducer에게 보낸다)한다. 그 다음에 위에서 추가한 리듀서가 이 action(RENDER_TODO_LIST)을 받아 state를 변경한다.

> * put :  redux store에 dispatch하는 역할을 한다.
> * all : all 함수를 통해 saga들을 하나로 묶어줄 수 있다.



```react
// ./src/index.js

import React from 'react';
import { render } from 'react-dom';
import { Provider } from 'react-redux';
import { createStore, applyMiddleware } from 'redux';
import createSagaMiddleware from 'redux-saga';
import toDoApp from './reducers';
import { loadToDoList } from './actions';
import rootSaga from './sagas';
import App from './App';
import * as serviceWorker from './serviceWorker';

// saga를 redux store에 연결하기 위해서는 미들웨어를 사용해야 한다.
const sagaMiddleware = createSagaMiddleware();

// 스토어 생성 및 스토어에 미들웨어 mount
const store = createStore(toDoApp, applyMiddleware(sagaMiddleware));

// saga를 실행
sagaMiddleware.run(rootSaga);

store.dispatch(loadToDoList());

render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);

serviceWorker.unregister();
```



* 별 문제 없이 진행했다면 실행했을 때 다음과 같이 원격서버에서 **Buy pizza**와 **Watch Netflix** 2개의 to-do item들을 가져온 상태로 시작이 된다.

![image](https://user-images.githubusercontent.com/48499094/67709822-14f52700-fa02-11e9-8e3a-d04effaab27c.png)



#### 13. React-router 설치

```react
npm i react-router-dom
```

> angular이나 angular2, backbone같은 프레임워크는 프레임워크이기 때문에 라우팅 기능이 기본적으로 들어있습니다. 하지만 react는 view만 담당하는 라이브러리입니다. 그래서 라우팅을 담당하는 react-router을 따로 설치해주어야 합니다. 그리고 나중에 model과 controller를 담당하는 패키지를 또 설치해야 합니다.
>
> * 라우팅? : 목적지까지 갈 수 있는 여러 경로 중 한 가지 경로를 설정해 주는 과정
>
>   하나의 컴퓨터로 자신이 속하지 않은 네트워크게 속한  PC와 통신할 때 발생된 패킷을 목적지까지 전달해 주는 과정
>
> [출처]
>
> * [react-router란](https://www.zerocho.com/category/React/post/57a71751c90c5815005babc4)
> * [routing이란](http://blog.naver.com/PostView.nhn?blogId=ssdyka&logNo=221068508093&parentCategoryNo=&categoryNo=11&viewDate=&isShowPopularPosts=true&from=search)



```react
// ./src/index.js

// ... other imports ...
import { BrowserRouter } from 'react-router-dom';

// ... saga and redux config ...

render(
  <Provider store={store}>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </Provider>,
  document.getElementById('root')
);
```



#### 14. Navigation component 생성

* route를 추가하기 전에 Navigation 컴포넌트를 만들어야 한다.

```react
// ./src/components/Navigation.js

import React from 'react';
import { Link } from 'react-router-dom';

export default () => (
  <div>
    <Link className="btn btn-primary" to="/">
      To-Do List
    </Link>
    <Link className="btn btn-secondary" to="/new-item">
      + Add New
    </Link>
  </div>
);
```

* 이 Navigation 컴포넌트는 두 개의 link 인스턴스를 만든다



#### 15. Route 정의

```react
// ./src/App.js

// ... other imports ...
import { Route } from 'react-router-dom';
import Navigation from './components/Navigation';

class App extends Component {
  render() {
    return (
      <Container>
        <Row className="row">
          <Col xs={12}>
            <h1>To Do List</h1>
            <Navigation />
            <Route exact path="/" component={ToDoListContainer} />
            <Route exact path="/new-item" component={AddToDo} />
          </Col>
        </Row>
      </Container>
    );
  }
}
export default App;
```



* 문제 없이 진행했다면 새로운 아이템을 입력 받던 **Add To-Do**가 사라지고 **Add New**로 바뀐 것을 알 수 있다.

![image](https://user-images.githubusercontent.com/48499094/67714019-5f7aa180-fa0a-11e9-9006-5b84396f9529.png)

* **+ Add New**를 클릭하면 **Add To-Do**가 있다.
* 즉 form을 나눈 것이다.

![image](https://user-images.githubusercontent.com/48499094/67714083-7caf7000-fa0a-11e9-94fe-9b03e8a8573e.png)



#### 16. Styled-components 설치

```react
npm i styled-components
```



```react
// ./src/components/Navigation.js

import React from 'react';
import { Link } from 'react-router-dom';
import styled from 'styled-components';

const NavigationBar = styled.div`
  margin-bottom: 15px;
  background-color: lightgray;
`;

export default () => (
  <NavigationBar>
    <Link className="btn btn-primary" to="/">
      To-Do List
    </Link>
    <Link className="btn btn-secondary" to="/new-item">
      + Add New
    </Link>
  </NavigationBar>
);
```

* NavigationBar를 만들어 css처럼 스타일을 바꿈



![image](https://user-images.githubusercontent.com/48499094/67714837-10ce0700-fa0c-11e9-90b8-cf478303e445.png)



#### 17. Auth0-js 설치

```react
npm i auth0-js
```

> Auth0, a global leader in Identity-as-a-Service (IDaaS), provides thousands of customers in every market sector with the only identity solution they need for their web, mobile, IoT, and internal applications. Its extensible platform seamlessly authenticates and secures more than 2.5 billion logins per month, making it loved by developers and trusted by global enterprises

* [auth0 회원가입](https://auth0.com/signup) 후 아래 상태에서 **create application** 클릭

![image](https://user-images.githubusercontent.com/48499094/67718291-d320ac80-fa12-11e9-8f8e-d86ca6d37924.png)

* 아래와 같이 설정한 후 생성

![image](https://user-images.githubusercontent.com/48499094/67718451-1d099280-fa13-11e9-878f-cff96ef88ae3.png)

* 생성 후 **Settings** 탭에서 두 가지 변경
  * Allowed Callback URLs : `http://localhost:3000/callback`
  * Allowed Logout URLs : `http://localhost:3000/`

![image](https://user-images.githubusercontent.com/48499094/67718669-92756300-fa13-11e9-8432-c8bfe3977ddb.png)



```react
// ./src/Auth.js

import auth0 from 'auth0-js';

const auth0Client = new auth0.WebAuth({
  // the following three lines MUST be updated
  domain: '<YOUR_AUTH0_DOMAIN>',
  audience: 'https://<YOUR_AUTH0_DOMAIN>/userinfo',
  clientID: '<YOUR_AUTH0_CLIENT_ID>',
  redirectUri: 'http://localhost:3000/callback',
  responseType: 'id_token',
  scope: 'openid profile email'
});

export function handleAuthentication() {
  return new Promise((resolve, reject) => {
    auth0Client.parseHash((err, authResult) => {
      if (err) return reject(err);
      if (!authResult || !authResult.idToken) {
        return reject(err);
      }
      const idToken = authResult.idToken;
      const profile = authResult.idTokenPayload;
      // set the time that the id token will expire at
      const expiresAt = authResult.idTokenPayload.exp * 1000;
      resolve({
        authenticated: true,
        idToken,
        profile,
        expiresAt
      });
    });
  });
}

export function signIn() {
  auth0Client.authorize();
}

export function signOut() {
  auth0Client.logout({
    returnTo: 'http://localhost:3000',
    clientID: '<YOUR_AUTH0_CLIENT_ID>'
  });
}
```

* **<YOUR_AUTH0_DOMAIN>** 과 **<YOUR_AUTH0_CLIENT_ID>** 자리에 본인의 정보를 넣는다



#### 18. Redux action 추가

```react
// ./src/actions/index.js

// ... other constants ...
export const USER_PROFILE_LOADED = 'USER_PROFILE_LOADED';
export const HANDLE_AUTHENTICATION_CALLBACK = 'HANDLE_AUTHENTICATION_CALLBACK';

// ... addToDo and loadToDoList ...

export function handleAuthenticationCallback() {
  return {
    type: HANDLE_AUTHENTICATION_CALLBACK
  };
}
```



#### 19. Callback 컴포넌트 생성

```react
// ./src/containers/Callback.js

import React from 'react';
import { connect } from 'react-redux';
import { Redirect } from 'react-router';
import { handleAuthenticationCallback } from '../actions';

const mapStateToProps = state => {
  return {
    user: state.user
  };
};

let Callback = ({ dispatch, user }) => {
  if (user) return <Redirect to="/" />;
  dispatch(handleAuthenticationCallback());

  return <div className="text-center">Loading user profile.</div>;
};
Callback = connect(mapStateToProps)(Callback);

export default Callback;
```

* Callback 컴포넌트는 유저인지 아닌지 확인한다



```react
// ./src/sagas/index.js

// ... other imports ...
import { takeLatest } from 'redux-saga/effects';
import { HANDLE_AUTHENTICATION_CALLBACK, USER_PROFILE_LOADED } from '../actions';
import { handleAuthentication } from '../Auth';

// ... fetchToDoList and loadToDoList ...

export function* parseHash() {
  const user = yield call(handleAuthentication);
  yield put({ type: USER_PROFILE_LOADED, user });
}

export function* handleAuthenticationCallback() {
  yield takeLatest(HANDLE_AUTHENTICATION_CALLBACK, parseHash);
}

// replace the current rootSaga generator
export default function* rootSaga() {
  yield all([loadToDoList(), handleAuthenticationCallback()]);
}
```

* callback 추가로 인한 코드 수정
* **parseHash** saga와 **handleAuthenticationCallback** saga를 추가



```react
// ./src/reducers/index.js

// ... other imports ...
import { USER_PROFILE_LOADED } from '../actions';

// ... initialState ...

export default function toDoApp(state = initialState, action) {
  switch (action.type) {

    // ... RENDER_TODO_LIST and ADD_TODO ...

    case USER_PROFILE_LOADED:
      return {
        ...state,
        user: action.user
      };
    default:
      return state;
  }
}
```

* saga 추가로 인한 코드 수정



```react
// ./src/components/Navigation.js

// ... other imports ...
import { Fragment } from 'react';
import Button from 'react-bootstrap/Button';
import { signIn, signOut } from '../Auth';

// ... NavigationBar ...

const Profile = styled.span`
  margin-left: 15px;
`;

const ProfilePicture = styled.img`
  border-radius: 50%;
  max-width: 30px;
  margin-right: 5px;
`;

export default ({ user }) => (
  <NavigationBar>
    <Link className="btn btn-primary" to="/">
      To-Do List
    </Link>
    <Link className="btn btn-secondary" to="/new-item">
      + Add New
    </Link>
    {!user && <Button onClick={signIn}>Login</Button>}
    {user && (
      <Fragment>
        <Button onClick={signOut}>Logout</Button>
        <Profile>
          <ProfilePicture src={user.profile.picture} />
          {user.profile.email}
        </Profile>
      </Fragment>
    )}
  </NavigationBar>
);
```



```react
// ./src/containers/NavigationContainer.js

import { connect } from 'react-redux';
import Navigation from '../components/Navigation';

const mapStateToProps = state => {
  return {
    user: state.user
  };
};

const NavigationContainer = connect(mapStateToProps)(Navigation);

export default NavigationContainer;
```



#### 20. `./src/App.js` 수정

```react
// ./src/App.js

// ... other imports ...
import Callback from './containers/Callback';
import NavigationContainer from './containers/NavigationContainer';

class App extends Component {
  render() {
    return (
      <Container>
        <Row className="row">
          <Col xs={12}>
            <h1>To Do List</h1>
            <NavigationContainer />
            <Route exact path="/" component={ToDoListContainer} />
            <Route exact path="/new-item" component={AddToDo} />
            <Route exact path="/callback" component={Callback} />
          </Col>
        </Row>
      </Container>
    );
  }
}

export default App;
```



* 문제 없이 진행했다면 아래와 같이 완성이 된다

![image](https://user-images.githubusercontent.com/48499094/67721763-bbe5bd00-fa1a-11e9-834c-4714332211b5.png)