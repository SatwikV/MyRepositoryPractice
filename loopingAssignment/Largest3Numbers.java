package loopingAssignment;

import java.util.Scanner;

public class Largest3Numbers {

	public static void main(String[] args) {
		
		//Program to print largest of 3 numbers
		
		System.out.println("Enter first number ");
		Scanner m = new Scanner(System.in);
		int a = m.nextInt();
		
		System.out.println("Enter Second number ");
		Scanner n = new Scanner(System.in);
		int b = n.nextInt();
		
		System.out.println("Enter third number ");
		Scanner o = new Scanner(System.in);
		int c = o.nextInt();

		if (a>b) 
		{
			if (a>c)
			{
				System.out.println(a+ " Is largest");
			}
			else 
			{
				System.out.println(c+" Is largest");
			}
		}
		else 
		{
			if(b>c) 
			{
				System.out.println(b+ " Is largest");
			}
			else 
			{	
			System.out.println(c+ " Is Largest");
			}
		}
		
		m.close();
		n.close();
		o.close();
	}

}
