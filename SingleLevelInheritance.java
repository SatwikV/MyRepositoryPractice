package PracticeJavaPackage;

class Parent
{
	void parent() 
	{
		System.out.println("This is parent class");
	}
}

class child extends Parent
{
	void test() 
	{
		System.out.println("This is child class");
	}
}


public class SingleLevelInheritance {

	public static void main(String[] args) {
		child obj = new child();
		obj.test();
		obj.parent();

	}

}
