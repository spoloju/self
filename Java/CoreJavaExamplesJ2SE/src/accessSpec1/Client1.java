package accessSpec1;



public class Client1 extends Course{
	
		
	void display(){
		
		//m1(); // this is private method
		m2();
		m3();
		m4();
		
	}

	//  
	static void display2(){
		Course crc = new Course();
		crc.m2();
		crc.m3();
		//m3(); You can't call non Static Method in static method without creating object even when you're extending parent class.  
	}
	
}
