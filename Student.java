package PracticeJavaPackage;

class S
{
	String name;
	int age;
	
	S(String n, int a)
	{
		name = n;
		age = a;
	}
	
	void study() 
	{
		System.out.println(name+" "+" is studying");
	}
	
	void display() 
	{
		System.out.println(name+ " "+age);
	}

}



public class Student {

	public static void main(String[] args) {
		S Student = new S("Rahul",21);
		Student.study();
		Student.display();
		
		S Stud = new S("Mike",21);
		Stud.study();
		Stud.display();

	}

}
