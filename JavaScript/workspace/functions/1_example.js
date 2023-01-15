function math(operation,x){

   const OPERATIONS ={

      '*':(a,b)=> a*b,
      '/':(a,b)=> a/b,
      '+':(a,b)=> a+b,
      '-':(a,b)=> a-b

   }
   return function(y){

      return OPERATIONS[operation](x,y);
   }
}

const nul=math("*",5);
const add =math("+",nul(2));

console.group(typeof add);
console.log(add(math("-",25)(20)));