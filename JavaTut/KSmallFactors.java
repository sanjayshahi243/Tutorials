/*
    Given a positive integer k, another positive integer n is said to have k-small factors if n can be written as a product u*v where u and v are both less than k. 
    For instance, 20 has 10-small factors since both 4 and 5 are less than 10 and 4*5 = 20. 
    (For the same reason, it is also true to say that 20 has 6-small factors, 7-small factors, 8-small factors, etc). 
    However, 22 does not have 10-small factors since the only way to factor 22 is as 22 = 2 * 11,   and 11 is not less than 10.

    Write a function hasKSmallFactors with signatuare

    boolean hasKSmallFactors(int k, int n) 

    which returns true if n has k-small factors. The function should return false if either k or n is not positive.  

    Examples:  
    hasKSmallFactors(7, 30) is true (since 5*6 = 30 and 5 < 7, 6 < 7). 
    hasKSmallFactors(6, 14) is false (since the only way to factor 14 is 2*7 = 14 and 7 not less than 6)
    hasKSmallFactors(6, 30) is false (since 5*6 = 30, 6 not less than 6; 3 * 10 = 30, 10 not less than 6; 2 * 15 = 30, 15 not less than 6) 
*/

import java.util.Scanner;
public class KSmallFactors {
    public static boolean hasKSmallFactors(int k, int n) {
        boolean result = false;
        if (k <= 0 || n <= 0) return result;

        for (int i=1; i<n/2; i++) {
            for (int j=i; j<n/2; j++) {
                System.out.printf("\n n: %d, k: %d, i: %d, j: %d\n", n, k, i, j);
                if (n%i == 0 && n%j==0 && i*j==n && i<k && j<k) {
                    result = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean result = hasKSmallFactors(10, 20);
        System.out.println("Result: " + result);
    }
}