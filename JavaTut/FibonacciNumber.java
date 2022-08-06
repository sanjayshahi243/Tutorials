/*
A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. 
Note that first two Fibonacci numbers are 1 and any Fibonacci number other than the first two is 
the sum of the previous two Fibonacci numbers. For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.

Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number, otherwise it returns 0.

The signature of the function is
   int isFibonacci (int n)

*/

public class FibonacciNumber {
    static int isFibonacci (int n) {
        int x = 1, y = 1;
        while (y < n) {
            y = x + y;
            x = y;
        }
        if (y == n) return 1;
        return 0;
    }

    public static void main (String[] args) {
        System.out.println ("Result: " + isFibonacci(12));
    }
}