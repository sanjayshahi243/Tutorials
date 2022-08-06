// Console Calculator using switch statements

import java.util.Scanner;

public class SwitchCalculator {
    public static void main (String[] args) {
        // Variable definition
        char operator;
        Double num1, num2, result = 0.0;

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get Input Numbers/Operands
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        
        // Get input for operator
        System.out.println("Choose an operator (+, -, *, /):");
        operator = input.next().charAt(0);
        
        switch (operator) {
            // Perform addition
            case '+':
                result = num1 + num2;
                break;

            // Peform substraction
            case '-':
                result = num1 - num2;
                break;
                
            // Perform multiplication
            case '*':
                result = num1 * num2;
                break;

            // Perform Division
            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Please select the operator from the list.");
        }
        System.out.println("The " + operator + " of " + num1 + " and " + num2 + " is " + result);
    }
}