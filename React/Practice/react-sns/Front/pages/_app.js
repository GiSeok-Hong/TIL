// next JS에서 제공하는 형태?로 root를 담당한다.
import React from 'react';
import Head from 'next/head';
import PropTypes from 'prop-types';
import AppLayout from '../components/AppLayout';
import withRedux from 'next-redux-wrapper';
import { applyMiddleware, compose, createStore } from 'redux';
import { Provider } from 'react-redux';
import reducers from '../reducers';

const HongSns = ({ Component, store }) => {
  return (
    <Provider store={store}>
      <Head>
        <title>Hong Sns</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/antd/3.20.5/antd.css" />
      </Head>
      <AppLayout>
        <Component/>
      </AppLayout>
    </Provider>
  )
}

// 타입 선언
HongSns.propTypes = {
  Component: PropTypes.elementType,
  store: PropTypes.object
}

export default withRedux((initialState, Options) => {
  const middlewares = [];
  const enhancer = compose(
    applyMiddleware(...middlewares),
    !Options.isServer && typeof window.__REDUX_DEVTOOLS_EXTENSION__ !== 'undefined' ? window.__REDUX_DEVTOOLS_EXTENSION__() : (f) => f,  
  );
  const store = createStore(reducers, initialState, enhancer);
  return store;
})(HongSns);