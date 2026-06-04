package loopingAssignment;

import java.util.Scanner;


public class EvenOrOdd {

	public static void main(String[] args) {
		
		//program to check whether a number is even or odd using if-else.
	
		int num;
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num = n.nextInt();
		
		if (num % 2 == 0)
		{
			System.out.println("Given Number is Even");
		}
		else
		{
			System.out.println("Given number is odd");
		}
		n.close();
	
		
	}

}
