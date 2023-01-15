function addition(){

    let sum=0;

for(let i=0;i<arguments.length;i++){

    sum=sum+arguments[i];

}
return sum;
}



add= (...arguments)=>{

    let sum=0;
    
for(let i=0;i<arguments.length;i++){

    sum=sum+arguments[i];

}
return sum;
}

console.log(addition(1,2,3,4,5));

//console.log(addition(7,8,9,10));

console.log(add(1,2,3));