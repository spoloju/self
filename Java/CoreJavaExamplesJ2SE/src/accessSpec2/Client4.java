package accessSpec2;


import accessSpec1.Course;

public class Client4 {
	
	void display(){
		Course crc = new Course();
		//crc.m1(); - this is a private method 
		//crc.m2(); -- this is a default method 
		//crc.m3(); -- this is a protected Method. when you create object you can't access the method too. 
		crc.m4();
		
	}

}
