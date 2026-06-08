package oopsAssignement;

class Engine 
{
	void engineInfo() 
	{
		System.out.println("Built for high performance");
	}
	
}

class Car extends Engine
{
	void engineDetails() 
	{
		System.out.println("V Stroke Engine with 4 claws. V01005 Made in India");
	}
}
public class Aggregation20 {

	public static void main(String[] args) {
		Car Tisto = new Car();
		Tisto.engineDetails();
		Tisto.engineInfo();
		

	}

}
