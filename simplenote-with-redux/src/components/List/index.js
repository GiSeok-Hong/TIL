// components/List/index.js
import React from 'react';
import './index.css';
import ListItem from '../ListItem/ListItem-index';

class List extends React.Component {
  render() {
    return (
      <div className="list">
        <ListItem />
      </div>
    ); // end return()
  } // end render()
} // end class List

export default List;