// src/components/Counter.js
import React from 'react';

const Counter = () => {
  return (
    <div>
      <h1>myCounter</h1>  {/* 카운터를 표시해줄 부분*/}
      <button>+</button>  {/* 증감 버튼 */}
      <button>-</button>  {/* 감소 버튼 */}
    </div>
  );
};  

export default Counter;