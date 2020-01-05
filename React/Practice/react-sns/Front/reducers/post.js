export const initialState = {
  mainPosts: [{
    id: 1,
    User: {
      id: 1,
      nickname: 'Hong is Happy reducers/post.js'
    },
    content: '첫번째 카드',
    img: 'https://t1.daumcdn.net/cfile/tistory/99C98B505CB7BF252D',
    Comments: [],
  }], // 화면에 보일 포스트들
  imagePaths: [], // 미리보기 이미지 경로
  addPostErrorReason:'', // 포스트 업로드 실패 사유
  isAddingPost: false, // 포스트 업로드 중
  postAdded: false, // 포스트 업로드 성공
  isAddingComment: false, // 댓글 업로드 중
  addCommentErrorReason:'', // 댓글 업로드 실패 사유
  commentAdded: false, // 댓글 업로드 성공
};

const dummyPost = {
  id: 2,
  User: {
    id: 1,
    nickname: '박철현 reducers/post.js',
  },
  content: 'Dummy POST',
  Comments: [],
};

const dummyComment = {
  id: 1,
  User: {
    id: 1,
    nickname: '노민우 reducers/post.js',
  },
  createdAt: new Date(),
  content: 'Dummy REPLY',
};

// Action types
export const ADD_POST_REQUEST = 'ADD_POST_REQUEST';
export const ADD_POST_SUCCESS = 'ADD_POST_SUCCESS';
export const ADD_POST_FAILURE = 'ADD_POST_FAILURE';

export const ADD_COMMENT_REQUEST = 'ADD_COMMENT_REQUEST';
export const ADD_COMMENT_SUCCESS = 'ADD_COMMENT_SUCCESS';
export const ADD_COMMENT_FAILURE = 'ADD_COMMENT_FAILURE';

// Action creators
export const addPostRequest = data => ({
  type: ADD_POST_REQUEST,
  payload: {
    addPostData: data,
  },
});

export const addCommentRequest = data => ({
  type: ADD_COMMENT_REQUEST,
  payload: {
    addCommentData: data,
  },
});

// reducers
export default (state = initialState, action) => {
  const { type, payload, error } = action;
  switch (type) {
    case ADD_POST_REQUEST: 
      return {
        ...state,
        isAddingPost: true,
        postAdded: false,
        addPostErrorReason: '',
      };
    case ADD_POST_SUCCESS:
      return {
        ...state,
        isAddingPost: false,
        postAdded: true,
        mainPosts: [dummyPost, ...state.mainPosts],
      };
    case ADD_POST_FAILURE:
      return {
        ...state,
        isAddingPost: false,
        addPostErrorReason: error,
      };
    case ADD_COMMENT_REQUEST:
      return {
        ...state,
        isAddingComment: true,
        commentAdded: false,
        addCommentErrorReason: '',
      };
    case ADD_COMMENT_SUCCESS:
      const postIndex = state.mainPosts.findIndex(v => v.id === payload.postId);
      const post = state.mainPosts[postIndex];
      const Comments = [...post.Comments, dummyComment];
      const mainPosts = [...state.mainPosts];
      mainPosts[postIndex] = { ...post, Comments };

      return {
        ...state,
        isAddingComment: false,
        commentAdded: true,
        mainPosts,
      };
    case ADD_COMMENT_FAILURE:
      return {
        ...state,
        isAddingComment: false,
        addCommentErrorReason: error,
      };
    default:
      return state;
  }
}