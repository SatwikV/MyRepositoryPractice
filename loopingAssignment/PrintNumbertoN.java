package loopingAssignment;
import java.util.Scanner;

public class PrintNumbertoN {

	public static void main(String[] args) {
		// program using a for loop to print numbers from 1 to N
		
		System.out.print("Enter the value of N: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) 
		{
			System.out.print(i + " ");
		}
		sc.close();

	}

}
