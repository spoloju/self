
//Modifiers g : global   i: case insensitive   m multiline

var information="Mission Driven IT Solutions (MDITS) is  a premier IT services firm, distinguished in  field of THE rendering Web Development Services, IT Services & Solutions. Mission Driven IT Solutions (MDITS) has been providing offshore and onsite services to its global clientele successfully through a team of Certified and Committed Professionals with extensive technical and domain expertise, which strengthens its ability to provide innovative solutions to customers, clients, and business partners.";


var pattern=/THE/i;
//var pattern=/THE/i;

var output =information.match(pattern);

console.log(output);