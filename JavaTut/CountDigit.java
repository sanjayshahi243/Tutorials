/*
. Write a function named countDigit that returns the number of times that a given digit appears in a positive number. 
For example countDigit(32121, 1) would return 2 because there are two 1s in 32121. Other examples:
countDigit(33331, 3) returns 4
countDigit(33331, 6) returns 0
countDigit(3, 3) returns 1

The function should return -1 if either argument is negative, so
countDigit(-543, 3) returns -1.

The function signature is 
	int countDigit(int n, int digit)

Hint: Use modulo base 10 and integer arithmetic to isolate the digits of the number.

*/

public class CountDigit {
    public int countDigit(int n, int digit) {
        if (n < 0) return -1;
        int counter = 0;
        while (n != 0) {
            if (n % 10 == digit) counter++;
            n /= 10;
        }
        return counter;
    }

    public static void main (String[] args) {
        CountDigit obj = new CountDigit();
        System.out.println("Digit Counter: " + obj.countDigit(33131,6));
    }
}