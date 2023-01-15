

function multiply(i,j,callback){
  var result=i*j;

callback(result);
}



function reply(input){


    console.log(input);
}



multiply(4,5,reply);