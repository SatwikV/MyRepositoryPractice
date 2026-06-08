package oopsAssignement;

class Employee                                  //Creating a class named Employee with private instance variables empId, empName, and salary.
{
	private int empId;
	private String empName;
	private double salary;
	
	public int getEmpId() {                    //Provide public getters and setters for all variables.
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void displayDetails()                               //Creating a method displayDetails() to print employee details.
	{
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary: " + salary);
	}
	
	
	
}

public class EncapsulationGetterSetter1 {

	public static void main(String[] args) {
		
		Employee EmpDetails = new Employee();              //Creating an object in the main method and assign values using setters then display them.
		EmpDetails.setEmpId(007);
		EmpDetails.setEmpName("Bond");
		EmpDetails.setSalary(007);
		
		EmpDetails.displayDetails();
		;

	}

}
