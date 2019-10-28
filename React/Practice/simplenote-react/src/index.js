// index.js
import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './components/App';
import * as serviceWorker from './serviceWorker';

// import { unregister } from './registerServiceWorker'  이것도 오래된 거라 안됨

ReactDOM.render(<App />, document.getElementById('root'));

// unregister(); 오래된 코드라 이거 쓰면 작동이 안됨
serviceWorker.unregister();
