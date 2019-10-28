// src/reducers/index.js

import { ADD_TODO } from '../actions';
import { RENDER_TODO_LIST } from '../actions';  // 11단계에서 추가
import { USER_PROFILE_LOADED } from '../actions';

// 초기상태 정의
const initialState = {
  toDoList: []
};

// 리듀서 작성
export default function toDoApp(state = initialState, action) {
  switch (action.type) {
    case RENDER_TODO_LIST:                     // 11단계에서 추가
      return {
        ...state,
        toDoList: action.toDoList
      };
    case ADD_TODO:
      let newToDoList = [
        ...state.toDoList,
        {
          ...action.toDoItem
        }
      ];
      return {
        ...state,
        toDoList: newToDoList
      };
    case USER_PROFILE_LOADED:
      return {
        ...state,
        user: action.user
      };
    default:
      return state;
  }
}