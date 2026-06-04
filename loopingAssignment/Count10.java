package loopingAssignment;

import java.util.Scanner;

public class Count10 {

	public static void main(String[] args) {
		
		// Write a program using a while loop to count the number of digits in an integer.
		
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        int count = 0;
        int i = 0;

        while (i < num.length()) {
            count++;
            i++;
        }

        System.out.println("Count of digits: " + count);

        sc.close();
    }
}
