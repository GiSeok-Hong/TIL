// src/components/Counter.js
import React from 'react';

// 화면생성
const Counter = ({ value, onIncrement, onDecrement}) => {
  return (
    <div>
      <h1>{value}</h1>  {/* 카운터를 표시해줄 부분*/}
      <button onClick={onIncrement}>+</button>  {/* 증감 버튼 */}
      <button onClick={onDecrement}>-</button>  {/* 감소 버튼 */}
    </div>
  );
};  

export default Counter;