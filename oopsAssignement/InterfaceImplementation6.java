package oopsAssignement;

interface Payment
{
	void makePayment();
}

class Upi implements Payment
{
	public void makePayment() 
	{
		System.out.println("This is an UPI transaction");
	}
}

class CreditCard implements Payment
{
	public void makePayment() 
	{
		System.out.println("This is an Credit Card transaction");
	}
}
public class InterfaceImplementation6 {

	public static void main(String[] args) {
		
		Payment transaction = new Upi ();
		transaction.makePayment();
		Payment transaction2 = new CreditCard ();
		transaction2.makePayment();
	}

}
