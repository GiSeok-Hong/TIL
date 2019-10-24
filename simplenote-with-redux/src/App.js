// src/App.js  -> 실질적인 화면을 보여주는 페이지
import React from 'react';
import './App.css';
import Header from './components/Header/index';
import List from './components/List/index';
import Note from './components/Note/index';

class App extends React.Component {
  render() {
    return (
    <div className="app">
      <Header />
      <div className="container">
        <List />
        <Note />
      </div>
    </div>
    ); // end return
  } // end render()
} // end class App




export default App;
