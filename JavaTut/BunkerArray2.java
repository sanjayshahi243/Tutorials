/*
. A Bunker array is an array that contains the value 1 if and only if it contains a prime number. 
The array {7, 6, 10, 1} is a Bunker array because it contains a prime number (7) and also contains a 1.  
The array {7, 6, 10} is not a Bunker array because it contains a prime number (7) but does not contain a 1. 
The array {6, 10, 1} is not a Bunker array because it contains a 1 but does not contain a prime number.

It is okay if a Bunker array contains more than one value 1 and more than one prime, 
so the array {3, 7, 1, 8, 1} is a Bunker array (3 and 7 are the primes).

Write a function named isBunker that returns 1 if its array argument is a Bunker array and returns 0 otherwise.

You may assume the existence of a function named isPrime that returns 1 if its argument is a prime and returns 0 otherwise. You do not have to write isPrime, you can just call it.

If you are programming in Java or C#, the function signature is
   int isBunker(int [ ] a)

If you are programming in C or C++, the function signature is
   int isBunker(int a[ ], int len) where len is the number of elements in the array.

*/

public class BunkerArray2 {
    static boolean isPrime (int n) {
        boolean isPrime = true;
        if (n < 2) isPrime = false;

        for (int i=2; i<n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static int isBunker(int [ ] arr) {
        int isBunker = 0;
        boolean contains1 = false;
        boolean containsPrime = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) continue;
            if (arr[i] == 1) contains1 = true;
            else if (isPrime(arr[i])) containsPrime = true;
            if (containsPrime && contains1) {
                break;
            }
        }
        // System.out.println(" "+containsPrime);
        // System.out.println(" "+contains1);
        if (containsPrime && contains1) isBunker = 1;
        return isBunker;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isBunker(new int[] {5, 6, 10, 1}));
    }
}
