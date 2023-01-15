var promise = new Promise((resolve, reject) =>{



    setTimeout(()=>{
        resolve([21,22,23]);
    },5000)
}

);

promise.then(value => {

    console.log(value);
})