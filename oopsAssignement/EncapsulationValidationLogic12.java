package oopsAssignement;

class Account
{
	private String accHolderName;
	private double balance;
	
	public void setAccHolderName(String accHoldername) {
		this.accHolderName = accHoldername;
		System.out.println("Account Holder Name: "+ accHolderName);
	}
	public void setBalance(double Balance) {
		if (Balance <0) 
		{
			System.out.println("Warning !! balance cannot accept negative numbers. !!");
		}
		else {
		this.balance = Balance;
		System.out.println("Account Balance: "+ balance);
		}
		}	
}

public class EncapsulationValidationLogic12 {

	public static void main(String[] args) {
		
		Account SBI = new Account();
		SBI.setAccHolderName("Ramesh Mehtha");
		SBI.setBalance(-21);
		
		

	}

}
