const title = document.querySelector("#title");

function handleResize(){
  console.log("I have been resized ~!")
}

// window.addEventListener("resize", handleResize());  호출을 하지 않았는데 실행이 됨
// window 크기가 바뀌면 handleResize 함수를 실행한다.
window.addEventListener("resize", handleResize);

function handleClick(){
  title.style.color = "red"
  console.log("change title color")
}
// title 에 클릭을 하면 handleClick을 실행한다.
title.addEventListener("click", handleClick);

console.dir(title);

const age = prompt("How old are you");
if(age > 18){
  console.log("you can drink")
} else{
  console.log("you can't")
}