// App/index.js
import React from 'react';
import './index.css';
import Header from '../Header';
import List from '../List';
import Note from '../Note';
import { generateId } from '../../utils'; // 랜덤 id 생성 함수

class App extends React.Component {
  // state : UI의 상태를 기록하는 데이터. 일반적으로 버튼의 활성화 상태, input의 입력 값,
  //         체크박스 체크 여부 등의 상태를 관리     
  // state 선언
  //  notes: 앱의 노트 정보를 담은 array
  //  activeId: 리스트에서 유저가 선택하여 활성화 된 노트의 id
  state = {
    notes: [],
    activeId: null
  }

  // 이벤트 핸들러 메소드
  // this.setState()는 state를 설정하는 메소드
  // state를 변경할 때는 반드시 this.setState() 사용
  handleListItemClick = (id) => {
    this.setState({ activeId: id });
  }

  // 편집 이벤트 핸들러
  handleEditNote = (type, e) => {
    // 새 notes 어레이 생성
    const notes = [ ... this.state.notes ];
    
    // notes에서 현재 activeId 와 일치하는 노트 객체 찾기
    const note = notes.find((item) => item.id === this.state.activeId);

    // 객체의 속성에 값 할당. note.title 또는 note.contents
    note[type] = e.target.value;

    // notes에 새 array 를 할당하여 state 변경
    this.setState({
      notes,
    });
  }


  handleAddNote = () => {
    const id = generateId(); // 랜덤 ID 생성
    this.setState({
      notes: [
        ...this.state.notes,
        {
          id,
          title: '제목',
          contents: '내용',
        },
      ],
      activeId: id,
    });
  }


  handleDeleteNote = () => {
    // 현재 선택한 노트를 제외한 새로운 array를 생성
    const notes = this.state.notes.filter((item) => item.id !== this.state.activeId);

    // 새 array를 notes에 할당
    this.setState({
      notes,
      activeId: notes.length === 0 ? null : notes[0].id, 
    });
  }


  render(){
    const { notes, activeId } = this.state;
    // 현재 활성화 된 객체를 찾아서 activeNote변수에 할당
    const activeNote = notes.filter((item) => item.id === activeId[0]);
    return (
      <div className="app">
        <Header 
          onAddNote={this.handleAddNote}
          onDeleteNote={this.handleDeleteNote}
        />
        <div className="container">
          {/* note와 activeId props로 전달 */}
          <List
             notes={notes}
             activeId={activeId}
             onListItemClick={this.handleListItemClick} // 메소드 전달
          />
          {/* activeNote가 존재할 때 <Note /> 를 랜더링 */}
          {/* note 속성에 activeNote 전달 */}
          {
            notes.length !== 0 && 
              <Note
                note={activeNote} 
                onEditNote={this.handleEditNote} // 메소드 전달
              />
          }
        </div>
      </div>
    );
  }
}

// 아래 코드가 있어야 컴파일 됨?
export default App;