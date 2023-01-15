const p1=Promise.resolve(40);
const p2=Promise.resolve(30);

const p3= new Promise((resolve, reject) =>{



    setTimeout(()=>{
        resolve([21,22,23]);
    },5000)
}

);


const p4=Promise.resolve(76);
const p5=Promise.reject('this is error info');


Promise.race([p1,p2,p3,p4,p5]).then(value=>{

  //  Promise.all([p1,p2,p3,p4]).then(value=>{
    console.log(value);
}).catch(error=>{

    console.log(error)
});