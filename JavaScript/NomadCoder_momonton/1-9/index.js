// Array
const monday = "Mon";
const tuesday = "Tue";
const wednesday = "Wed";
const thursday = "Thu";;
const friday = "Fri";
const saturday = "Sat";
const sunday = "Sun";

const daysOfWeek = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"];

console.log(daysOfWeek);  // 
console.log(daysOfWeek[2]); // Wed

const hongInfo = ["hong", "30", true, "Seoul"];

// object
const hongInfo2 = {
  name: "hong",
  age: 30,
  gender: "Male",
  person: true,
  favMovies: ["gods", "notebook", "water"],
  favFood: [
    { name: "kimchi", fatty: false },
    { name: "cheese burger", fatty: true }
  ]
}

console.log(hongInfo);
console.log(hongInfo2);
console.log(hongInfo2.gender);

hongInfo2.gender = "Female";
console.log(hongInfo2.gender);
console.log(hongInfo2);

