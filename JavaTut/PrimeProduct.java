/*
    A primeproduct is a positive integer that is the product of exactly two primes greater than 1. 
    For example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1. 
    Write a function named isPrimeProduct  with an integer parameter that returns 1 if the parameter is a primeproduct, otherwise it returns 0. 
    Recall that a prime number is a positive integer with no factors other than 1 and itself. 

    You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime number. 
    You do not need to write isPrime. You are allowed to use this function.

    The function signature 
    int isPrimeProduct(int n)
*/

import java.util.Scanner;

public class PrimeProduct {
    static boolean isPrime (int n) {
        boolean isprime = true;

        // Check if number is positive and greater than 1.
        if (n <= 1) isprime = false;
        
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }

        return isprime;
    }

    static boolean isPrimeProduct(int n) {
        boolean primeProduct = false;
        if (!isPrime(n)) {
            for (int i = 2; i <= n/2; i++) {
                if (isPrime(i) && (n % i) == 0 && isPrime(n/i)) {
                    primeProduct = true;
                    break;
                }
            }
        }
        
        return primeProduct;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        System.out.printf("\n%d is %b", num, isPrime(num));

        System.out.printf("\n%d is primeproduct? %b", num, isPrimeProduct(num));
    }
}
