function User(firstName , lastName,dob){

    this.firstName=firstName;
    this.lastName=lastName;
    this.dob=dob;

    this.getfullName=function(){

        return this.firstName+" " +this.lastName;
    }
}

var user1= new User("jhon","smith",1987);

console.log(user1);

console.log(user1.getfullName());
