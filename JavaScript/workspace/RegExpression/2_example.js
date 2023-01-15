
//Modifiers g : global   i: case insensitive   m multiline
// ^ : beginning    $ end

var information="\nMission Driven IT Solutions (MDITS) is a premier IT services firm, micro\nthedistinguished in  field of THE rendering Web Development Services, \nIT Services & Solutions. Mission Driven IT Solutions (MDITS) has been providing offshore and onsite services to its global clientele successfully through a team of Certified and Committed Professionals with extensive technical and domain expertise, \nthe which strengthens its ability to provide innovative solutions to customers, clients, micro\nand business partners.micro";


//var pattern=/^the/gmi;
var pattern=/micro$/gmi;


var output =information.match(pattern);

console.log(output);