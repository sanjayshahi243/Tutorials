/*
An integer is defined to be "continuous factored" if it can be expressed as the product of two or more continuous integers 
greater than 1.  
Examples of "continuous factored" integers are:
6 = 2 * 3. 
60 = 3 * 4 * 5
120 = 4 * 5 * 6
90 = 9*10
Examples of integers that are NOT "continuous factored" are: 99 = 9*11, 121=11*11, 2=2, 13=13

Write a function named isContinuousFactored(int  n) that returns 1 if n is continuous factored and 0 otherwise.
*/

public class ContinuousFactored {
    static int isContinuousFactored(int n) {
        int temp = 1;
        // int contFactored = 0;
        if (n == 2) return 1;
        for (int i=2; i <= n/2; i++) {
            temp = i;
            for (int j=i+1; j <= n/2; j++) {
                if (temp > n) break;
                if (temp < n) {
                    temp = temp*j;
                }
                // System.out.println(temp);
                if (temp == n) return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + isContinuousFactored(8));
    }
}