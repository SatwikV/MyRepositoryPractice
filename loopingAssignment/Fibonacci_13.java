package loopingAssignment;

import java.util.Scanner;

public class Fibonacci_13 {

	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first = 0;
		int second = 1;
		
		if (num<=0) 
		{
			System.out.println("Febonacci series for the number doesn't exist.");
		}
		else 
		{
			for (int i = 0 ; i<num ; i++) 
			{
				 int next = first + second;
				 System.out.print(first + " ");
				 first = second;
				 second = next;
			}
		}
		sc.close();

	}

}
