import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
// createStore와 루트 리듀서 불러오기
import { createStore } from 'redux';
import rootReducer from './store/modules';
import { Provider } from 'react-redux';


// 리덕스 개발자 도구 적용
const devTools =
  window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__();

// 스토어 생성
const store = createStore(rootReducer, devTools);


ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>, 
  document.getElementById('root'));


serviceWorker.unregister();
