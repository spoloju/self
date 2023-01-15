

var dateref =new Date("December 21, 2018 20:21:00");
console.log(dateref.getDate());


dateref.setDate(27);
console.log(dateref.getDate());

console.log(dateref.getDay());

console.log(dateref.getHours());
console.log(dateref.getMinutes());
console.log(dateref.getMonth());
console.log(dateref.getFullYear());




var date2ref = new Date(1999, 6,21,14,21,16);

// 21-06-1999
console.log(date2ref.toLocaleDateString());

// ‎14‎:‎21‎:‎16 
console.log(date2ref.toLocaleTimeString());



//21‎-‎07‎-‎1999‎ ‎14‎:‎21‎:‎16 
console.log(date2ref.toLocaleString());


//Wed Jul 21 1999 14:21:16 GMT-0700 (Pacific Daylight Time) 
console.log(date2ref.toString());




