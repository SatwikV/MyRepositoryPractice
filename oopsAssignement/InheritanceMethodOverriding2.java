package oopsAssignement;

class Vehical                    //Create a base class Vehicle with a method fuelType() which prints "Runs on fuel".
{
	void fuelType() 
	{
		System.out.println("Runs on Fuel");
		
	}
	
}

class ElectricCar extends Vehical       //Create a child class ElectricCar and override the fuelType() method to print "Runs on electricity".
{
	void fuelTpye() 
	{
		System.out.println("Runs on electricity");         
	}
}

public class InheritanceMethodOverriding2 {

	public static void main(String[] args) {
		Vehical motor = new Vehical();               //Create objects of both classes and call their respective methods.
		motor.fuelType();
		ElectricCar emotor = new ElectricCar();
		emotor.fuelTpye();
		

	}

}
