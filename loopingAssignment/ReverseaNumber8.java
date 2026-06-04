package loopingAssignment;

import java.util.Scanner;

public class ReverseaNumber8 {

	public static void main(String[] args) {
		//program using a while loop to reverse a number.
		System.out.print("Enter a number more than 2 digit:  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = 0;
		
		while(num!=0) 
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
			
		}
		System.out.println("Reversed Number: " + reverse);
		sc.close();
		

	}

}
