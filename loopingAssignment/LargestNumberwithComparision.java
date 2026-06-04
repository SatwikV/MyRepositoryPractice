package loopingAssignment;

import java.util.Scanner;

public class LargestNumberwithComparision {

	public static void main(String[] args) {
		
		System.out.println("Enter three number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b && a>c) 
		{
			System.out.println(a + " is the largest number");
		}
		else if (b>a && b>c) 
		{
			System.out.println(b + " Is the largest number");
		}
		else 
		{
			System.out.println(c + " Is the largest number");
		}
		sc.close();
		
	}

}
