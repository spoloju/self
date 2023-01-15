function assignment(callback){

  console.log("Assignment completed");

  callback();


}

function sendEmail(){

    console.log("email sent");
}




assignment(sendEmail);

