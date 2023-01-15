var promise= new Promise(function(resolve,reject){

    const person1="vara";
    const person2="vara"

    if(person1 === person2){

        resolve('both names are equal')
    }else {

        reject('not equals')
    }


});


promise.then(value=> console.log(value)).catch(error=>console.log(error));