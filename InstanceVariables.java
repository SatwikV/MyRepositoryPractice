package PracticeJavaPackage;

class test
{
	int y=12;
	void display() 
	{
		int z = y+10;
		System.out.println(y);
		System.out.println(z);
	}
}



public class InstanceVariables {

	public static void main(String[] args) {
		test obj = new test();
		obj.display();

	}

}
