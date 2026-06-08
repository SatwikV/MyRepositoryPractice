package oopsAssignement;

class LoanCalculator
{
	void calculateLoan(int amt) 
	{
		System.out.println("Loan Amount is :" + amt);
	}
	void calculateLoan(int amt, double interestRate) 
	{
		System.out.println("Loan Amount is: "+ amt + " " + "with interest rate of " +  " " + interestRate + " " + " %");
	}
	
}

public class Methodoverloading15 {

	public static void main(String[] args) {
		LoanCalculator cal = new LoanCalculator();
		cal.calculateLoan(240000);
		cal.calculateLoan(240000,8);
	}

}
