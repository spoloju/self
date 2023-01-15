let employees= new Set();

let emp1 ={name:'vara',id:'101',sal:'20k'};
let emp2 ={name:'naga',id:'102',sal:'30k'};
let emp3 ={name:'prasad',id:'103',sal:'40k'};
let emp4 ={name:'prasad',id:'103',sal:'40k'};
//let employees= new Set([emp1,emp2,emp3]);

employees.add(emp1);
employees.add(emp2);
employees.add(emp3);
employees.add(emp4);

for(let employee of employees){

    console.log(employee.name);
    console.log(employee.id);
    console.log(employee.sal);
}


