var array =[2,4,7,"10",75,90,"12"]
var sum =0;
for (var i=0;i<array.length;i++){
    sum += parseInt(array[i]);
}

var avg = sum/array.length;

console.log("the sum"+sum + "average"+ avg)