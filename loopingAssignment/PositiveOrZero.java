package loopingAssignment;

import java.util.Scanner;

public class PositiveOrZero {

	public static void main(String[] args) {
		// Program to check if an entered value is Positive, Negative or Zero
		
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		if(value < 0) 
		{
			System.out.println("Entered value is Negative");
		}
		else if (value > 0) 
		{
			System.out.println("Entered value is Positive");
		}
		else 
		{
			System.out.println("Enterd value is Zero");
		}
		sc.close();
		
				

	}

}
