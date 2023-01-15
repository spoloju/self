var array1 = [1,2,3]
var array2 = [2,3,5]

function uniqueAfterMerge(array1,array2){
    var arr = array1.concat(array2);
    var uniqueArray =[];

    for(var i of arr){
        if(uniqueArray.indexOf(i)== -1){
            uniqueArray.push(i);
        }

    }
    console.log(uniqueArray);
}
uniqueAfterMerge(array1,array2);