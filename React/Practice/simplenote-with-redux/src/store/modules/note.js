// src/store/modules/note.js

/* Ducks 패턴
   리덕스 공식 매뉴얼을 보면 액션을 위한 파일과
   리듀서를 위한 파일을 따로 작성하지만
   이를 하나의 파일로 작성하는 방법도 있는데 이를 Ducks 패턴이라고 한다.
*/

/* module
   특정 기능을 구현하기 위하여 필요한 액션과, 액션생성함수, 초깃값,
   리듀서 함수가 들어있는 파일
*/

// ****** 액션 타입 정의 *****
const CREATE = 'note/CREATE';
const REMOVE = 'note/REMOVE';
const UPDATE = 'note/UPDATE';

/* Ducks 패턴을 사용 할 땐 액션 이름을 지을 때 
   문자열의 앞부분에 모듈 이름을 넣는다.
   이는 다른 모듈에서 작성하게 될 수도 있는 액션들과 충돌되지 않게 하기 위함.
*/

// ***** 액션 생성함수 정의 *****
export const create = () => ({ type: CREATE });
export const remove = id => ({ type: REMOVE, id}); 
export const update = id => ({ type: UPDATE, id});

// ***** 초기상태 정의 *****
const initialState = {
  notes: [
    {
      id: 'initial',
      title: 'Hong\'s 노트입니다.',
      contents: 'react-redux app 만들기 도전'
    }
  ]
}

// ***** 리듀서 작성 *****
export default function simplenote(state = initialState, action) {
  switch (action.type) {
    case CREATE:
      return {

      };
    case REMOVE:
      return {

      };
    case UPDATE:
      return {

      };
    default:
      return state;
  } // end switch
} // end simplenote