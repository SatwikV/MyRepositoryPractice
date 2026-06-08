package oopsAssignement;

class Bank
{
	final int IFSC= 007;
	
	final void showIFSC() 
	{
		System.out.println("This is my final IFSC Code: " + IFSC);
	}
}

class HDFCBank extends Bank
{
	void showIFSC1() //marking it +1 to save my code (Compile time error was observed)
	{
		System.out.println("This is my overriden IFSC Code: " + IFSC+1);
	}
	
}

public class FinalKeyword9 {

	public static void main(String[] args) {
		
		HDFCBank code = new HDFCBank();
		code.showIFSC();

	}

}
