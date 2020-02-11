const form = document.querySelector(".js-form");
const input =  document.querySelector("input");
const greeting = document.querySelector(".js-greetings");

const USER_LS = "currentUser",
      SHOWING_CN = "showing";

function paintGreeting(text){
  form.classList.remove(SHOWING_CN);
  greeting.classList.add(SHOWING_CN);
  greeting.innerHTML = `Hello ${text}`
}

function loadName(){
  const currentUser = localStorage.getItem(USER_LS);
  if(currentUser === null){
    console.log("undefined 유저가 없습니다")
  } else {
    paintGreeting(currentUser);
    console.log("")
  }
}

function init(){
  loadName();
};

init();