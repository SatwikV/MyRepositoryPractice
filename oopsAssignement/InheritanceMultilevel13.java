package oopsAssignement;

class Device
{
	void start() 
	{
		System.out.println("A new genration Device.");
	}
	
}
class Mobile extends Device
{
	void calling() 
	{
		System.out.println("With a new AI Calling feature ");
	}
}
class SmartPhone extends Mobile
{
	void internet() 
	{
		System.out.println("All new genration SmartAIPhone ");
	}
}
public class InheritanceMultilevel13 {

	public static void main(String[] args) {
		SmartPhone SAT = new SmartPhone();
		SAT.internet();
		SAT.calling();
		SAT.start();

	}

}
