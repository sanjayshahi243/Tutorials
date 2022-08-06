/*
A Meera array is an array that contains the value 0 if and only if it contains a prime number. 
The array {7, 6, 0, 10, 1} is a Meera array because it contains a prime number (7) and also contains a 0. 
The array {6, 10, 1} is a Meera array because it contains no prime number and also contains no 0. 

The array {7, 6, 10} is not a Meera array because it contains a prime number (7) but does not contain a 0. 
The array {6, 10, 0} is not a Meera array because it contains a 0 but does not contain a prime number.

It is okay if a Meera array contains more than one value 0 and more than one prime, 
so the array {3, 7, 0, 8, 0, 5} is a Meera array (3, 5 and 7 are the primes and there are two zeros.).

Write a function named isMeera that returns 1 if its array argument is a Meera array and returns 0 otherwise.

You may assume the existence of a function named isPrime that returns 1 if its argument is a prime and returns 0 otherwise. 
You do not have to write isPrime, you can just call it.

If you are programming in Java or C#, the function signature is
   int isMeera(int [ ] a)

If you are are programming in C or C++, the function signature is
   int isMeera(int a[ ], int len) where len is the number of elements in the array.
*/

public class MeeraArray3 {
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

    static int isMeera(int [ ] arr) {
        int isMeera = 0;
        boolean containsZero = false, containsPrime = false;
        for (int i=0; i<arr.length; i++) {
            if (isPrime(arr[i])) containsPrime = true;
            if (arr[i] == 0) containsZero = true;
            if (containsZero && containsPrime) {
                isMeera = 1; 
                break;
            }
        }
        return isMeera;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isMeera(new int[] {0, 6, 10}));
    }
}