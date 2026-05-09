package PracticeJavaPackage;

class Mobile
{
	
	void series(String x) {
		
		System.out.println("Series of your nokia mobile is: "+ x);
	}
}

class Car{
	
	void display(String name) {
		System.out.println(name);
	}
	
}

public class MethodsWithParameter {

	public static void main(String[] args) {
 		
		Mobile series = new Mobile();
		series.series("Lumia");
		
		Car company = new Car();
		company.display("KIA");
	}

}
