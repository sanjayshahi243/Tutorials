/* 
    Hello, and welcome! Please make sure to read all parts carefully.

    For homework 02, you will be creating a calculator that can perform the following operations: add, subtract, multiply, divide, and alphabetize. The operations work as follows:

    add - takes two integers, adds them together and prints out the result
    subtract - takes two integers, subtracts the second entered integer from the first and prints out the result
    multiply - takes two doubles, multiplies them together and prints out the result to two decimal places
    divide - takes two doubles, divides the first entered double by the second and prints out the result to two decimal places
    alphabetize - takes two words of only letters, and tells which word comes before the other lexicographically
*/

import java.util.Scanner;

public class Calculator {
    static int add (int num1, int num2) {
        return num1 + num2;
    }

    static int subtract (int num1, int num2) {
        return num1 - num2;
    }
    
    static double multiply (double num1, double num2) {
        return num1 * num2;
    }

    static double division (double num1, double num2) {
        return num1 / num2;
    }

    public static void main (String[] args) {
        System.out.println ("List of operations: add subtract multiply divide alphabetize.");
        System.out.println("Select one of the operations.");

        Scanner input = new Scanner(System.in);
        String operation = input.nextLine();
        
        operation = operation.toLowerCase();
        
        System.out.printf("Operation %s \n", operation);

        int num1, num2;
        double dnum1, dnum2;
        switch (operation) {
            case "add":
                System.out.println("Enter 2 integers: ");
                if(input.hasNextInt()) {
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.printf("\nResult: %d", add(num1, num2));
                } else
                    System.out.println ("Invalid input entered. Terminating...");
                break;
            
            case "subtract":
                System.out.println("Enter 2 integers: ");
                if(input.hasNextInt()) {
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.printf("\nResult: %d", subtract(num1, num2));
                } else
                    System.out.println ("Invalid input entered. Terminating...");
                break;
            
            case "multiply":
                System.out.println("Enter 2 doubles: ");
                dnum1 = input.nextDouble();
                dnum2 = input.nextDouble();
                System.out.printf("\nResult: %.2f", multiply(dnum1, dnum2));
                break;
            
            case "divide":
                System.out.println("Enter 2 doubles: ");
                dnum1 = input.nextDouble();
                dnum2 = input.nextDouble();
                if (dnum2 == 0) 
                    System.out.println ("Invalid input entered. Terminating...");
                else
                    System.out.printf("\nResult: %.2f", division(dnum1, dnum2));
                break;

            case "alphabetize":
                System.out.println("Enter 2 words: ");
                String w1 = input.next();
                String w2 = input.next();
                if (w1.compareTo(w2) < 0) 
                    System.out.printf("\n%s comes before %s alphabetically.\n", w1, w2);
                else if (w1.compareTo(w2) > 0)
                    System.out.printf("\n%s comes before %s alphabetically.\n", w2, w1);
                else
                    System.out.printf("\nChicken or Egg.\n");
                break;
            default:
                System.out.println ("Invalid input entered. Terminating...");
        }
    }
}
