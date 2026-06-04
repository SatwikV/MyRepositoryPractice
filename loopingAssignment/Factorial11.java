package loopingAssignment;

import java.util.Scanner;

public class Factorial11 {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num<0) {
			System.out.println("Entered num is negative number and factorial of negative number does not exist.");
		}
		else {
		long fact = 1;
		
		
		for (int i = num; i>0 ; i--) 
		{
			fact = fact * i;
		}
		System.out.println("Factorial of the given number is : " + fact);
		}
		
		sc.close();	}

}
