// Modifiers : g- global  i case insensitive m multiline

var message= "welcome to java the large world.THE info provided is dummy the info is copy write";
var pattern=/THE/g;
//var pattern=/THE/i;
var output=message.match(pattern);

console.log(output);