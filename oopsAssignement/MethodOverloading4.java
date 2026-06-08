package oopsAssignement;

class Calculator                                //Create a class Calculator with overloaded methods add():
{
	void add(int a, int b)                   //add(int a, int b)
	{
		System.out.println("This is int value: " + (a+b));
	}
	void add(double a, double b)                //add(double a, double b)
	{
		System.out.println("This is double value: " + (a+b));
	}

}


public class MethodOverloading4 {

	public static void main(String[] args) {
		
		Calculator addition = new Calculator();                 //Call both methods inside the main method and print results.
		addition.add(1293, 2323);
		addition.add(1293.5, 2323.5);
		

	}

}
