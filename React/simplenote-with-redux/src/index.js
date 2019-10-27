// src/index.js
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
// createStore 와 루트 리듀서 불러오기
import { createStore } from 'redux';
import rootReducer from './store/modules';
// provider 불러오기 : 리액트 프로젝트에 스토어를 연동 할 때 react-redux
//                    라이브러이 안에 있는 Provider 컴포넌트를 사용한다.
//                    기존의 JSX를 Provider로 감싸고, store는 props로 provider에 넣는다.
import { Provider } from 'react-redux';


// 리덕스 개발자도구 적용
const devTools =
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__();
// 스토어를 생성
const store = createStore(rootReducer, devTools);


// Provider 렌더링해서 기존의 App 감싸기
// ReactDOM.render(<App />, document.getElementById('root'));   // 기존코드
ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  document.getElementById('root')
);

serviceWorker.unregister();
