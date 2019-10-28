// src/actions/index.js

// 액션 타입 정의
export const ADD_TODO = 'ADD_TODO';
export const LOAD_TODO_LIST = 'LOAD_TODO_LIST';     // 11단계에서 추가
export const RENDER_TODO_LIST = 'RENDER_TODO_LIST'; // 11단계에서 추가
export const USER_PROFILE_LOADED = 'USER_PROFILE_LOADED';
export const HANDLE_AUTHENTICATION_CALLBACK = 'HANDLE_AUTHENTICATION_CALLBACK';

// 액션 생성함수 정의
export function addToDo(title) {
  return {
    type: ADD_TODO,
    toDoItem: {
      _id: (new Date().getTime()).toString(),
      title
    }
  };
}

// 11단계에서 추가
export function loadToDoList() {
  return {
    type: LOAD_TODO_LIST
  };
}

export function handleAuthenticationCallback() {
  return {
    type: HANDLE_AUTHENTICATION_CALLBACK
  };
}