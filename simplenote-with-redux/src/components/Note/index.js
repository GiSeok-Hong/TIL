// components/Note/index.js
import React from 'react';
import './index.css';

class Note extends React.Component {
  render() {
    return (
      <div className="note">
        <input 
          className="title" 
        />
        <textarea 
          className="note-contents"
        />
      </div>
    ); // end return
  } // end render()
} // end class Note

export default Note;