package PracticeJavaPackage;

class Temp
{
	double celsius;

Temp(double value)
{
	celsius = value;
	
}
	double Fahrenheit() 
	{
		return (celsius * 9/5) + 32;
	}
}

public class Temperature {

	public static void main(String[] args) {
		Temp conversion = new Temp(25);
		System.out.println(conversion.Fahrenheit());

	}

}
