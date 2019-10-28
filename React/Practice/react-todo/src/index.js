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
import { BrowserRouter } from 'react-router-dom';

// saga를 redux store에 연결하기 위해서는 미들웨어를 사용해야 한다.
const sagaMiddleware = createSagaMiddleware();

// 스토어 생성 및 스토어에 미들웨어 mount
const store = createStore(toDoApp, applyMiddleware(sagaMiddleware));

// saga를 실행
sagaMiddleware.run(rootSaga);

store.dispatch(loadToDoList());

render(
  <Provider store={store}>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </Provider>,
  document.getElementById('root')
);

serviceWorker.unregister();
