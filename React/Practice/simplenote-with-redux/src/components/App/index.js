// components/App/index.js
import React from 'react';
import './index.css';
import Header from '../Header/index';
import List from '../List/index';
import Note from '../Note/index';

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