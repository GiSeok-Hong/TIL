// App/index.js
import React from 'react';
import './index.css';
import Header from '../Header';
import List from '../List';
import Note from '../Note';

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

  render(){
    const { notes, activeId } = this.state;
    // 현재 활성화 된 객체를 찾아서 activeNote변수에 할당
    const activeNote = notes.filter((item) => item.id === activeId[0]);
    return (
      <div className="app">
        <Header />
        <div className="container">
          {/* note와 activeId props로 전달 */}
          <List
             notes={notes}
             activeId={activeID}
             onListItemClick={this.handleListItemClick} // 메소드 전달
          />
          {/* activeNote가 존재할 때 <Note /> 를 랜더링 */}
          {/* note 속성에 activeNote 전달 */}
          {
            notes.length !== 0 && <Note note={activeNote} />
          }
        </div>
      </div>
    );
  }
}

// 아래 코드가 있어야 컴파일 됨?
export default App;