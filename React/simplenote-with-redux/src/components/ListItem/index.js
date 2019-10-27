// components/ListItem/index.js
import React from 'react';
import './index.css';

class ListItem extends React.Component {
  render() {
    return (
      <div 
        className='hana'  
      >
        <div className="title">제목</div>
        <div className="list-item-contents">내용</div>
      </div>
    ); // end return()
  } // end render()
} // end class ListItem

export default ListItem;