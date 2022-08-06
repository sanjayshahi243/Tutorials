/*
An array is defined to be a Magic array if the sum of the primes in the array is equal to the first element of the array. 
If there are no primes in the array, the first element must be 0. 
So {21, 3, 7, 9, 11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 
which is the first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13 
which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {8, 5, -5, 5, 3} is not a Magic array 
because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime numbers are positive. 

Write a function named isMagicArray that returns 1 if its integer array argument is a Magic array. Otherwise it returns 0.

If you are writing in Java or C#, the function signature is
   int isMagicArray (int[ ] a)

If you are writing in C or C++, the function signature is
   int isMagicArray (int a[ ], int len) where len is the number of elements in the array.

You may assume that a function named isPrime exists that returns 1 if its int argument is a prime, otherwise it returns 0. You do not have to write this function! You are allowed to use it.
*/

/*
Psuedocode: 
Accept and array of numbers from user.
Create a new array of numbers using prime numbers in an array.
Check 
    if first element is 0, 
        if yes, check if any prime number exists, 
            if yes, return 0
            else, return 1
        else, return 1
    calculate sum of prime numbers 
    check 
        if sum is first element of user array
            yes, return 1
            no, return 0
*/

import java.util.Scanner;

class MagicArray {
    static int isPrime (int value) {
        if (value < 2) return 0;
        else if (value == 2 ) return 1;
        // Check if n is a multiple of 2
        else if (value % 2 == 0) return 0;
        else {
            // If not, then just check the odds
            for (int i = 3; i <= Math.sqrt(value); i += 2)
            {
                if (value % i == 0)
                    return 0;
            }
        }
        return 1;
    }

    int isMagicArray (int[] arr) {
        int sum = 0;
        for (int val : arr) {
            if (isPrime(val) == 1) {
                sum += val;
            }
        }
        if (sum == arr[0]) return 1;
        else return 0;
    }

    public static void main (String[] args) {
        int[] arr = {13, 4, 4, 4, 4};
        String arrayNumbers;
        Scanner input = new Scanner(System.in);
        
        MagicArray obj = new MagicArray();
        System.out.println(obj.isMagicArray(arr));
        /*
        System.out.println("Enter an array of numbers: ");
        arrayNumbers = input.nextLine();
        String[] arrayNumbersString = arrayNumbers.split(" ");
        for (int i = 0; i < arrayNumbersString.length; i++) {
            System.out.println(arrayNumbersString[0]);
            try {
                arr[i] = Integer.parseInt(arrayNumbersString[0]);
            } catch (NumberFormatException e) {
                System.out.println("Please Enter numbers only.");
                throw e;
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }
        */
    }
}