package PracticeJavaPackage;

class EmployeeAI
{
	String employeeName;
	static String companyName = "OpenAI";
	
	EmployeeAI(String ename)
	{
		employeeName = ename;
	}
	
}

class Developer extends EmployeeAI
{
	Developer(String n)
	{
		super(n);
	}
	
	void display() 
	{
		System.out.println("Name: "+ employeeName);
		System.out.println("Company: "+ companyName);
		System.out.println("Role: "+ "Developer");
	}

}

class Tester extends EmployeeAI
{
	
	Tester(String qa)
	{
		super(qa);
	}
	
	void display() 
	{
		System.out.println("Name: "+ employeeName);
		System.out.println("Company: "+ companyName);
		System.out.println("Role: "+ "Tester");
	}

}
public class HierarchicalInheritanceStaticVariable {

	public static void main(String[] args) {
		Developer Dev = new Developer("Rahul");
		Tester QA = new Tester("Mike");
		Dev.display();
		QA.display();
		

	}

}
