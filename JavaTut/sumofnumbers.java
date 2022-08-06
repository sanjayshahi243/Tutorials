// Program to accept 2 numbers from user and return sum of the numbers.

import java.util.Scanner;


class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first numeber: ");
        int first_number = input.nextInt();

        System.out.println("Enter second number: ");
        int second_number = input.nextInt();

        int sum = first_number + second_number;

        System.out.println("Sum of " + first_number + " and " + second_number + " is " + sum);
    }
}