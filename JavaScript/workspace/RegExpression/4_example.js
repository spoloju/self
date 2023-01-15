


var content="Welcome to Java script training for _shell #employees 2020 09 ";



//var pattern=/[^a-z]/g;
// a-z  A-Z 0-9 _
//var pattern=/\w/g;
//var pattern=/\W/g;
//var pattern=/\d/g;
var pattern=/\D/g;
var output =content.match(pattern);

console.log(output);