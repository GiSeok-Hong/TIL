export const initialState = {
  imagePaths: [],
  mainPosts: [{
    User: {
      id: 1,
      nickname: 'Hong is Happy reducers/post.js'
    },
    content: '첫번째 카드',
    img: 'https://t1.daumcdn.net/cfile/tistory/99C98B505CB7BF252D'
  }],
};

// Action types
const ADD_POST = 'ADD_POST';
const ADD_DUMMY = 'ADD_DUMMY';

// Action creators
export const addPost = {
  type: ADD_POST,
}

export const addDummy = {
  type: ADD_DUMMY,
}

// reducers
export default (state = initialState, action) => {
  const { type } = action;
  switch (type) {
    case ADD_POST: {
      return {
        ...state,
      };
    }
    case ADD_DUMMY: {
      return {
        ...state,
      };
    }
    default:
      return state;
  }
}