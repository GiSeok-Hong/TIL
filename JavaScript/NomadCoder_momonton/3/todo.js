const toDoForm = document.querySelector(".js-toDoForm"),
      toDoInput = toDoForm.querySelector("input"),
      toDoList = document.querySelector(".js-toDoList");

const TODOS_LS = 'toDos';  // string 형태로 저장이 된다.

let toDos = [];  // object 형태로 저장이 됨

function deleteToDo(event){
  const btn = event.target;
  const li = btn.parentNode;  // 삭제할 리스트
  toDoList.removeChild(li);
  const cleanToDos = toDos.filter(function(toDo){
    // console.log(`toDo.id : ${toDo.id}, li.id : ${li.id}`);
    return toDo.id !== parseInt(li.id);
  });
  console.log("삭제하고 남은 목록 object 형식 cleanTodos : ",cleanToDos)
  toDos = cleanToDos;
  saveToDos();
}

function saveToDos(){
  localStorage.setItem(TODOS_LS, JSON.stringify(toDos));
}

function paintToDo(text){
  // console.log(text);
  const li = document.createElement("li");
  const delBtn = document.createElement("button");
  const span = document.createElement("span");
  const newId = toDos.length + 1;
  delBtn.innerHTML = "X";
  delBtn.addEventListener("click", deleteToDo);
  span.innerText = text;
  li.appendChild(span);
  li.appendChild(delBtn);
  li.id = newId
  toDoList.appendChild(li);
  const toDoObj = {
    id: newId,
    text: text
  };
  toDos.push(toDoObj); // toDos 배열에 toDoObj 를 넣음.
  saveToDos();
}

function handleSubmit(event){
  event.preventDefault();
  const currentValue = toDoInput.value;
  paintToDo(currentValue);
  toDoInput.value = "";
}

function loadToDos(){
  const loadedToDos = localStorage.getItem(TODOS_LS);
  if(loadedToDos !== null){
    // console.log("string 형태로 저장된 데이터 : " + loadedToDos);
    const parsedToDos = JSON.parse(loadedToDos);
    // console.log("object 형태로 저장된 데이터 : ", parsedToDos);
    parsedToDos.forEach(function(toDo){
      // console.log(toDo.text);
      paintToDo(toDo.text);
    });
  }
}

function init(){
  loadToDos();
  toDoForm.addEventListener("submit", handleSubmit)
}

init();