package loopingAssignment;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		// Sum of N Natural numbers

		System.out.println("Enter the value of N: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int sum = 0;
		
		while (i <= n) 
		{
			sum = sum+i; 
			i++;
		}
		
		System.out.println(sum);
		sc.close();
		
	}

}
