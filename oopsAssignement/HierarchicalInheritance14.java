package oopsAssignement;

class Course
{
	void courseInfo() 
	{
		System.out.println("This is a MasterClasss of new BI");
	}
}
class Science extends Course
{
	void sifi() 
	{	
	System.out.println("This is a MasterClasss of new Science");
	}
}
	
class Commerce extends Science
{
	void com() 
	{	
	System.out.println("This is a MasterClasss of new Commerce");
	}
}
class Arts extends Commerce
{
	void art() 
	{	
	System.out.println("This is a MasterClasss of new Arts");
	}
	void courses() 
	{
		art();
		sifi();
		com();
		courseInfo();
	}
}

public class HierarchicalInheritance14 {

	public static void main(String[] args) {
		Science sub = new Science();
		Commerce sub2 = new Commerce();
		Arts sub3 = new Arts();
		
		sub.courseInfo();
		sub2.sifi();
		sub3.courses();
		

	}

}
