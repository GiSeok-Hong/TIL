// console.log("hello hong");
// console.log("hello park");
// console.log("hello kim");
// console.log("hello world");

// function sayHello(name, age){
//   console.log('Hello!', name, " you are ", age, "years old");
// };

function sayHello(name, age){
  console.log(`Hello ${name} you are ${age} years old`);
};

sayHello("hong", 20);
// sayHello("hong", 20) 의 리턴 값을 greetHong 이라는 변수에 담음
const greetHong = sayHello("hong", 20)
console.log(greetHong)  // undefined 가 발생 반환값이 없기 때문에...



function sayHello2(name, age){
  return (`Hello ${name} you are ${age} years old`);
}
const greetHong2 = sayHello2("hong2", 22);
console.log(greetHong2);



// 객체 안에 함수 기능을 구현
const calculator = {
  plus: function(a, b){
    return (
      a + b
    );
  },
  minus: function(a, b){
    return(
      a - b
    );
  },
  multiply: function(a, b){
    return(
      a * b
    );
  },
  divide: function(a, b){
    return(
      a / b
    )
  },
  square: function(a, b){
    return(
      a ** b
    );
  }
};

const resPlus = calculator.plus(5,5)
const resMinus = calculator.minus(5,5)
const resMultipy = calculator.multiply(5,5)
const resDivide = calculator.divide(5,5)
const resSquare = calculator.square(5,5)
console.log(resPlus);     // 10
console.log(resMinus);    //  0
console.log(resMultipy);  // 25
console.log(resDivide);   // 1
console.log(resSquare);   // 3125