let employee={

    id:'101',
    name:'indu',
    sal:'20k'
};

employee.skills=function(){

console.log(" java python");

}

function attitute(){
    console.log(" good ");


}
employee.attitude=attitute;

console.log(employee);
console.log(employee.skills());
//console.log(employee.skills);
//employee.skills();
employee.skills;
employee.attitude();