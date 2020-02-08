const title = document.getElementById("title");

console.log(title)

// 아래 코드를 작성하면 title 내용이 변경이 된다.
title.innerHTML = "Change content"
// 마찬가지로 title 색이 흰색에서 빨강으로 변함
title.style.color = "red"
// head의 title 부분이 test로 변경
document.title = "test"
console.dir(title)

//
const title2 = document.querySelector("#title");
title2.innerHTML = "Change querySelector";
title2.style.color = "blue";