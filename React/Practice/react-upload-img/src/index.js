import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
// import App from './App';
import ImageUploadExample from './ImageUploadExample';
import reportWebVitals from './reportWebVitals';
import ImagesUpload from './ImagesUpload';

ReactDOM.render(
  <React.StrictMode>
    {/* <App /> */}
    <ImageUploadExample />
    <ImagesUpload />
  </React.StrictMode>,
  document.getElementById('root')
);


reportWebVitals();
