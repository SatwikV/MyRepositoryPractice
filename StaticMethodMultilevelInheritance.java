package PracticeJavaPackage;

class Vehical
{
	String brandName;
	
	Vehical(String name)
	{
		brandName = name;
	}
	static void showCompanyPolicy() 
	{
		System.out.println("Follow traffic rules");
	}
	
}
class Car extends Vehical
{
	String modelName;
	Car(String name, String n)
	{
		super(name);
		modelName = n;
	}
	
}
class SportsCar extends Car
{
	double speed;
	SportsCar(String name, String n, double f)
	{
		super(name, n);
		speed = f;
	}
	
	void carDetails() 
	{
		System.out.println("Brand:" + brandName);
		System.out.println("Model Name:" + modelName);
		System.out.println("TopSpeed:" + speed);
	}
	
}



public class StaticMethodMultilevelInheritance {

	public static void main(String[] args) {
		Vehical.showCompanyPolicy();
		SportsCar obj = new SportsCar("Satwik","R8",450);
		obj.carDetails();
		

	}

}
