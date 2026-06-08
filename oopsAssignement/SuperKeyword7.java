package oopsAssignement;

class Person
{
	Person()                    //Create a class Person with a constructor that prints "Person Created".
	{
		System.out.println("Person Created");
	}
}

class Student extends Person           //Create a subclass Student that calls the parent constructor using super() and prints "Student Created".
{
	Student()
	{
		super();
		System.out.println("Student Created");
	}
	
	void ignore() 
	{
		System.out.println("Please Ignore this line"); //Want to save my code, so creating this extra line
	}
}

public class SuperKeyword7 {

	public static void main(String[] args) {
		Student sai = new Student();
		sai.ignore();

	}

}
