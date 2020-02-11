const form = document.querySelector(".js-form");
const input =  document.querySelector("input");
const greeting = document.querySelector(".js-greetings");

const USER_LS = "currentUser",
      SHOWING_CN = "showing";

function saveName(text){
  localStorage.setItem(USER_LS, text);
}

function handleSubmit(event) {
  event.preventDefault(); // 기본 이벤트를 막음. enter 입력시 적어둔 값이 사라지지 않고 유지하기 위해
  const currentValue = input.value;
  // console.log(currentValue);
  paintGreeting(currentValue);
  saveName(currentValue);
}

function askForName(){
  form.classList.add(SHOWING_CN);
  form.addEventListener("submit", handleSubmit)
}

function paintGreeting(text){
  form.classList.remove(SHOWING_CN);
  greeting.classList.add(SHOWING_CN);
  greeting.innerHTML = `Hello ${text}`
}

function loadName(){
  const currentUser = localStorage.getItem(USER_LS);
  if(currentUser === null){
    askForName();
  } else {
    paintGreeting(currentUser);
    
  }
}

function init(){
  loadName();
};

init();