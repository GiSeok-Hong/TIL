import { combineReducers } from 'redux';
import note from './note';

export default combineReducers(
  {
    note,
    // 다른 리듀서를 만드게 되면 이곳에 적어준다.
  }
);