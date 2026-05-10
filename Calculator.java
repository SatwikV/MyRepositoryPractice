package PracticeJavaPackage;

class CalculatorClass
{
	int multiply(int a, int b) 
	{
		return a*b;
	}
	
}

public class Calculator {

	public static void main(String[] args) {
		CalculatorClass Multiplier = new CalculatorClass();
		System.out.println(Multiplier.multiply(10, 5));
	}

}
