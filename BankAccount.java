package PracticeJavaPackage;

class BankAcc
{
	String accountholder;
	double balance;
	
	BankAcc(String holder, double amount)
	{
		accountholder = holder;
		balance = amount;
	}
	
	void deposit(double amount) 
	{
		balance = balance + amount;
		
	}
	void withdraw(double amount) 
	{
		balance = balance - amount;
	}
	void display() 
	{
		System.out.println(balance);
	}
}


public class BankAccount {

	public static void main(String[] args) {
		BankAcc newaccount = new BankAcc("Satwik",10000);
		newaccount.deposit(2000);
		newaccount.withdraw(7000);
		newaccount.display();
	}

}
