package loopingAssignment;

import java.util.Scanner;

public class MultiplicationTable7 {

	public static void main(String[] args) {
		
		System.out.print("Enter the number for table: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i<=10; i++) 
		{
			System.out.println(num + " * " + i + " = " + num * i);
		}
		sc.close();
	}

}
