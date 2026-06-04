package loopingAssignment;

import java.util.Scanner;

public class Palindrome9 {

	public static void main(String[] args) {
		System.out.print("Enter the number:  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = 0;
		int originalNum = num;
		
		while(num!=0) 
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		
		if (originalNum == reverse) 
		{
			System.out.println("Entered number " + originalNum + " is a Palindrome.");
		}
		else 
		{
			System.out.println("Entered number " + originalNum + " is not a Palindrome.");
		}
		sc.close();

	}

}
