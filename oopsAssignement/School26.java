package oopsAssignement;


class School
{
	String name;
	String address;
	int strength;
	
	School(String n, String a)
	{
		this.name = n;
		this.address = a;
		System.out.println("Name of the School is "+ name);
		System.out.println("Address of the School is "+ address);
		
	}
	School(String n, String a, int s)
	{
		this.name = n;
		this.address = a;
		this.strength = s;
		System.out.println("Name of the School is "+ name);
		System.out.println("Address of the School is "+ address);
		System.out.println("Strength of the School is "+ strength);
	}
	
	void display() 
	{
		System.out.println("Name of the School is "+ name);
		System.out.println("Address of the School is "+ address);
		System.out.println("Strength of the School is "+ strength);
	}
	
}

public class School26 {

	public static void main(String[] args) {
		
		School sch = new School("Sri","New building");
		School sch1 = new School("Master Minds","Old building",250);
		sch.display();
		sch1.display();
		
		

	}

}
