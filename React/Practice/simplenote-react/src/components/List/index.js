// List/index.js
import React from 'react';
import './index.css';
import ListItem from '../ListItem';

class List extends React.Component {
  render() {
    const {
      notes, 
      activeId,
      onListItemClick // App에서 전달 받은 이벤트 핸들러
    } = this.props;
    return (
      <div className="list">
        {notes.map((item) => {
          const { id, title, contents } = item;
          return (
            <ListItem
              key={id}
              id={id}
              active={id === activeId}
              title={title}
              contents={contents}
              onClick={() => onListItemClick(id)} // 메소드 전달
            />
          );
        })}
      </div>
    );
  }
}

export default List;

// list 컴포넌트는 this.props.notes 데이터에 대해 반복문을 돌면서 
/* listItem 컴포넌트를 반환한다. 이 때, 각 노트의 정보인 item 객체에서
   id, title, contents 데이터를 listitem 컴포넌트에 전달?

   반복문을 돌 때에는 key가 필수.
   리액트는 어떤 엘리먼트가 변경, 생성, 삭제 되었는지 판단할 때
   key를 활용
 */