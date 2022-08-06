/*
A Daphne array is defined to be an array that contains at least one odd number 
and  begins and ends with the same number of even numbers.

So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even numbers 
and ends with three even numbers and it contains at least one odd number

The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.

The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends with three even numbers.

Write a function named isDaphne that returns 1 if its array argument is a Daphne array. Otherwise, it returns 0.

If you are writing in Java or C#, the function signature is
   int isDaphne (int[ ] a)

If you are writing in C or C++, the function signature is
   int isDaphne (int a[ ], int len) where len is the number of elements in the array.
*/

public class DaphneArray {
    static int isDaphne (int[] arr) {
        boolean containOdd = false;
        int numEven = 0;
        
        if (arr.length == 0) return 0;
        if (arr[0] % 2 != 0 || arr[arr.length-1] % 2 != 0) return 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                containOdd = true;
                break;
            }
            numEven++;
        }
        if (!containOdd) return 0;

        for (int i=arr.length-1; i > 0; i--) {
            if (arr[i] % 2 != 0) {
                break;
            }
            numEven--;
        }
        
        if (containOdd && numEven == 0) return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isDaphne(new int[] {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6}));  // 1
        System.out.println("Result: " + isDaphne(new int[] {4, 8, 6, 4, 2, 9, 8,11, 8, 14, 12, 12, 6}));  // 1
        System.out.println("Result: " + isDaphne(new int[] {2, 4, 6, 8, 6}));    // 0
        System.out.println("Result: " + isDaphne(new int[] {2, 8, 7, 10, -4, 6}));    // 0
        System.out.println("Result: " + isDaphne(new int[] {}));    // 0
    }
}
