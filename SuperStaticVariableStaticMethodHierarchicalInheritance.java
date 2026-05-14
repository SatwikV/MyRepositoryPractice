package PracticeJavaPackage;

class University
{
	String studentName;
	int rollNumber;
	static String universityName = "IIT Bangalore";
	
	University(String n, int r)
	{
		studentName = n;
		rollNumber = r;
	}
	static void universityRules()
	{
		System.out.println("University Rules: Maintain Discipline");
	}
}

class EngineeringStudent extends University
{
	EngineeringStudent(String n, int r)
	{
		super(n,r);
		
	}
	void display() 
	{
		System.out.println("University: "+ universityName);
		System.out.println("Name: "+ studentName);
		System.out.println("Roll Number: "+ rollNumber);
		System.out.println("Course: Engineering");
	}
	
	
}

class MedicalStudent extends University
{
	MedicalStudent(String n, int r)
	{
		super(n,r);
		
	}
	void display() 
	{
		System.out.println("University: "+ universityName);
		System.out.println("Name: "+ studentName);
		System.out.println("Roll Number: "+ rollNumber);
		System.out.println("Course: Medical");
	}
	
}


public class SuperStaticVariableStaticMethodHierarchicalInheritance {

	public static void main(String[] args) {
		University.universityRules();
		EngineeringStudent Engstudent = new EngineeringStudent("Rahul",101);
		Engstudent.display();
		MedicalStudent MedStudent = new MedicalStudent("Anjali",202);
		MedStudent.display();
	}

}
