package oopsAssignement;

class StudentNew
{
	static String clgName = "JNTU";
	String name;
	int rollno;
	
	void displayDetails(String name, int rollno) 
	{
		System.out.println("College Name: " + clgName);
		System.out.println("Student Name: " + name);
		System.out.println("Student Roll No: " + rollno);
	}	
}
public class StaticKeyword10 {

	public static void main(String[] args) {
		
		StudentNew kiran = new StudentNew();
		kiran.displayDetails("Sai Kiran", 001);
		StudentNew Ramesh = new StudentNew();
		Ramesh.displayDetails("Sai Ramesh", 002);
		
		
		

	}

}
