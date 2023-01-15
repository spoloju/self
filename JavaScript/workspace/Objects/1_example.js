let person = {

id:'101',
name:'indu',
sal:'20k',
'plot no':'107'

}


console.log(person.name);

console.log(person['name']);

//console.log(person.plot no);

console.log(person['plot no']);

person.age=31;
console.log(person);

delete person.sal;
console.log(person);