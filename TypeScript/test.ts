let city = 'new york city';
console.log(city.toUpperCase());

const states = [
  { name: 'hong', capital: 'capital1' },
  { name: 'hong2', capital: 'capital2' },
  { name: 'hong3', capital: 'capital3' }
];

for (const state of states) {
  console.log(state.capital);
}


interface State {
  name: string;
  capital: string;
}

const states2: State[] = [
  { name: 'hong', capital: 'test' },
  { capital: 'test2', name: 'hong2' },
  {name:'hong3', capital: 'test3'}
  
]

const names = ['hong', 'park'];
console.log(names[2].toUpperCase);

// alert('hong', 'park');