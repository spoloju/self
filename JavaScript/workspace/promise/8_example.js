var p1=Promise.reject('this is for sure failure');

p1.catch(error=>{

console.log(error);

})