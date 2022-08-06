/*
Two integers are defined to be factor equal, if they have the same number of factors. 
For example, integers 10 and 33 are factor equal because, 10 has four factors: 1, 2, 5, 10 and 33 also has four factors: 1, 3, 11, 33. 
On the other hand, 9 and 10 are not factor equal since 9 has only three factors: 1, 3, 9 and 10 has four factors: 1, 2, 5, 10.

Write a function named factorEqual(int n, int m) that returns 1 if n and m are factor equal and 0 otherwise.

The signature of the function is
   int factorEqual(int n, int m)
*/

public class FactorEqual {
    static int factorEqual (int n, int m) {
        int factorEqual = 0;
        int nFactorCount = 0;
        int mFactorCount = 0;
        if (n < 1 || m < 1) return 0;
        
        for (int i=1; i <= n/2; i++) {
            if (n % i == 0) nFactorCount++;
        }
        for (int i=1; i <= m/2; i++) {
            if (m % i == 0) mFactorCount++;
        }
        if (nFactorCount == mFactorCount) factorEqual = 1;
        return factorEqual;
    }

    public static void main (String[] args) {
        System.out.println ("Result: " +factorEqual(10, 9));
    }
}