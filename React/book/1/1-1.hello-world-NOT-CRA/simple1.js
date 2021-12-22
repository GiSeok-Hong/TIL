function LikeButton() {
  const [liked, setLiked] = React.useState(false);
  const text = liked ? '좋아요 취소' : '좋아요';
  return React.createElement('button', { onClick: () => setLiked(!liked) }, text, );
}

const domContainer = document.querySelector('#react-root');
ReactDOM.render(React.createElement(LikeButton), domContainer);

// 1. 초깃값과 함께 컴포넌트의 상탯값을 정의. 여기서 React 변수는 react.development.js 파일에서 전역 변수로 생성된다.
// 2. 컴포넌트의 상탯값에 따라 동적으로 버튼의 문구를 결정
// 3. createElement 함수는 리액트 요소를 반환한다. 여기서 생성한 리액트 요소는 최종적으로 버튼 돔 요소가 된다.
// 4. 버튼을 클릭하면 onClick 함수가 호출되고, 컴포넌트의 상탯값이 변경된다.
// 5. simple1.html 파일에 미리 만들어 뒀던 돔 요소를 가져온다.
// 6. react-dom.development.js 파일에서 전역 변수로 만든 ReactDOM 변수를 사용해서 이곳에서 만든 컴포넌트를 react-root 돔 요소에 붙인다.