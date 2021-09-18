# React 시작하기

- [React 자습서](https://ko.reactjs.org/tutorial/tutorial.html#setup-for-the-tutorial)를 보고 실습하면서 작성한 글입니다.
- 처음 공부하고 있어서 부족하거나 잘못된 정보가 있을 수 있습니다. (2021.09.15 수)
- 조금 더 자세히 알게 되거나 수정할 부분이 있으면 바로바로 수정하겠습니다.

---



## 목표

Tic Tac Toe 게임 만들기

* 틱택토는 두 명이 번갈아가며 **O**와 **X**를 3×3 판에 써서 같은 글자를 가로, 세로, 혹은 대각선 상에 놓이도록 하는 놀이이다.

![image](https://user-images.githubusercontent.com/48499094/133380985-ca5fddb2-8085-4e52-852a-c24cebd834d5.png)

## 환경설정

1. `npx create-react-app my-app` 를 통해 새로운 프로젝트 생성
2. 생성된 프로젝트의 `src 폴더`에 있는 모든 파일 삭제
3. `src 폴더`에 `index.css` 파일 생성 후 아래 코드 추가

```css
body {
  font: 14px "Century Gothic", Futura, sans-serif;
  margin: 20px;
}

ol, ul {
  padding-left: 30px;
}

.board-row:after {
  clear: both;
  content: "";
  display: table;
}

.status {
  margin-bottom: 10px;
}

.square {
  background: #fff;
  border: 1px solid #999;
  float: left;
  font-size: 24px;
  font-weight: bold;
  line-height: 34px;
  height: 34px;
  margin-right: -1px;
  margin-top: -1px;
  padding: 0;
  text-align: center;
  width: 34px;
}

.square:focus {
  outline: none;
}

.kbd-navigation .square:focus {
  background: #ddd;
}

.game {
  display: flex;
  flex-direction: row;
}

.game-info {
  margin-left: 20px;
}
```

4. 'src 폴더'에 `index.js` 파일 생성 후 아래 코드 추가

```javascript
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

// React Component를 상속한 Square 클래스
class Square extends React.Component {
  render() {
    return (
      <button className="square">
        {/* TODO */}
      </button>
    );
  }
}

class Board extends React.Component {
  renderSquare(i) {
    return <Square />;
  }

  render() {
    const status = 'Next player: X';

    return (
      <div>
        <div className="status">{status}</div>
        <div className="board-row">
          {this.renderSquare(0)}
          {this.renderSquare(1)}
          {this.renderSquare(2)}
        </div>
        <div className="board-row">
          {this.renderSquare(3)}
          {this.renderSquare(4)}
          {this.renderSquare(5)}
        </div>
        <div className="board-row">
          {this.renderSquare(6)}
          {this.renderSquare(7)}
          {this.renderSquare(8)}
        </div>
      </div>
    );
  }
}

class Game extends React.Component {
  render() {
    return (
      <div className="game">
        <div className="game-board">
          <Board />
        </div>
        <div className="game-info">
          <div>{/* status */}</div>
          <ol>{/* TODO */}</ol>
        </div>
      </div>
    );
  }
}

// ========================================

ReactDOM.render(
  <Game />,
  document.getElementById('root')
);

```





