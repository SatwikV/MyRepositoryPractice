package oopsAssignement;

abstract class PEmployee
{
	abstract void calculateSalary(double salary);
	void employeeDetails(String name) 
	{
		System.out.println("Employee Name: " + name);
	}
	
}
class FullTimeEmployee extends PEmployee
{
	
	void calculateSalary(double salary) 
	{
	System.out.println("Salary is :" + salary);	
	}
}
class PartTimeEmployee extends PEmployee
{
	void calculateSalary(double salary)  
	{
		System.out.println("Salary is :" + (salary / 2));
	}
	
}
public class AbstractclassRealUsage17 {

	public static void main(String[] args) {
		
		PartTimeEmployee PE = new PartTimeEmployee();
		PE.employeeDetails("Sat");
		PE.calculateSalary(1000000);
		FullTimeEmployee FE = new FullTimeEmployee();
		FE.employeeDetails("Ram");
		FE.calculateSalary(200000);
		

	}

}
