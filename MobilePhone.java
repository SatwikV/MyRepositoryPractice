package PracticeJavaPackage;

class Samsung{
	void test () {
		System.out.println("Test Mobile");
	}
	
}

class Nokia{
	void display() {
		System.out.println("Nokia");
		
	}
	
}

public class MobilePhone {
	
	public static void main(String[] args) {
		
		Samsung obj = new Samsung();
		obj.test();
		
 System.out.println("Hello World!");
 
 		Nokia series = new Nokia();
 		series.display();
	}

}

