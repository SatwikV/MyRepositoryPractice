package oopsAssignement;

class Library                                //Create a class Library with an instance variable libraryName.
{
	String libraryName;
	
	Library()                                   //Create a default constructor to print "Welcome to the Library!".
	{
		System.out.println("Welcome to the Library");
	}
	
	void showLovation()                              //Create a method showLocation() which prints "This library is located in Mumbai".
	{
		System.out.println("The Library is located in Mumbai.");
	}
	
}

public class ClassObjectMethod {

	public static void main(String[] args) {
		
		Library lib = new Library();                 //Create an object in main() and call both.
		lib.showLovation();
		

	}

}
