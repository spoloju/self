
// ^  : beginning   $  end

var message= "\nMission Driven IT Solutions (MDITS) is a premier IT services firm, \nthe distinguished in the field of rendering Web Development Services, IT Services & Solutions. \nthe Mission Driven IT Solutions (MDITS) has been providing offshore and onsite services to its global \nTHE clientele successfully through a team of Certified and Committed Professionals with extensive technical and domain expertise, which strengthens its ability \nto provide innovative solutions to customers, clients, and business partners ";
var pattern=/^the/gm

var output=message.match(pattern);

console.log(output)