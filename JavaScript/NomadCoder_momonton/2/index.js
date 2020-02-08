const title = document.querySelector("#title");

function handleResize(){
  console.log("I have been resized ~!")
}

// window.addEventListener("resize", handleResize());  호출을 하지 않았는데 실행이 됨
// window 크기가 바뀌면 handleResize 함수를 실행한다.
window.addEventListener("resize", handleResize);
console.dir(title);



const BASE_COLOR = "blue";
const CHANGE_COLOR = "red";

function handleClick(){
  const currentColor = title.style.color;
  if(currentColor === BASE_COLOR){
    title.style.color = CHANGE_COLOR;
    console.log("change color")
  } else {
    title.style.color = BASE_COLOR;
    console.log("change")
  }
}

function init(){
  title.style.color= BASE_COLOR;
  title.addEventListener("click", handleClick);
}
init();

function handleOffline(){
  console.log("offline");
}

function handleOnline(){
  console.log("online");
}
window.addEventListener("online", handleOnline);
window.addEventListener("offline", handleOffline);