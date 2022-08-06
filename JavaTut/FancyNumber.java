/*
A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .
Note that first two fancy numbers are 1 and any fancy number other than the first two is sum of the three times 
previous one and two times the one before that. See below: 
1,
1,
3*1 +2*1 = 5
3*5 +2*1 = 17
3*17 + 2*5 = 61
Write a function named isFancy that returns 1 if its integer argument is a Fancy number, otherwise it returns 0.
The signature of the function is
   int isFancy(int n)
*/

public class FancyNumber {
    static int isFancy(int n) {
        int isFancy = 0;
        int next = 0;
        int x = 1; int y = 1;
        while (y <= n) {
            if (y == n) {
                isFancy = 1;
                break;
            }
            if (y > n) break;
            next = (2*x) + (3*y);
            x = y;
            y = next;
        }
        return isFancy;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isFancy(-1));
    }
}