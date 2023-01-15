var promise = new Promise((resolve,reject)=>{



    resolve([21,22,23]);
}


);

promise.then(value => {

    console.log(value[0]);
})