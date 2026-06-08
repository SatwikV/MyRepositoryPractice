package oopsAssignement;

class Hospital
{
	void emergencyService() 
	{
		System.out.println("This is parent class method.");
	}
	
}

class CityHospital extends Hospital
{
	void emergencyService() 
	{
		super.emergencyService();
		System.out.println("This is child class method.");
		
	}
	
}

public class MethodOverridingwithSuper {

	public static void main(String[] args) {
		
		CityHospital AIM = new CityHospital();
		AIM.emergencyService();
		

	}

}
