package loopingAssignment;

import java.util.Scanner;

public class Calculator_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int c;

        do {

            System.out.println("\n*** Calculator ***");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            c = sc.nextInt();

            switch (c) {

                case 1:
                    System.out.println("Result = " + (a + b));
                    break;

                case 2:
                    System.out.println("Result = " + (a - b));
                    break;

                case 3:
                    System.out.println("Result = " + (a * b));
                    break;

                case 4:
                        System.out.println("Result = " + (a / b));
                    break;

                case 5:
                    System.out.println("Calculator Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (c != 5);

        sc.close();
    }
}