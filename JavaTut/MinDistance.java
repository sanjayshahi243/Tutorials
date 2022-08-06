/*
Write a function named minDistance that returns the smallest distance between two factors of a number. 
For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013. 
minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2). 
As another example, minDistance (8) would return 1 because the factors of 8 are 1, 2, 4, 8 and the smallest 
distance between any two factors is 1 (2 – 1 = 1).

The function signature is
   int minDistance(int n)

   */

public class MinDistance {
    public int minDistance(int n) {
        int distance = n;
        int prev = 0;
        for (int i = 1; i<=n; i++) {
            if (n % i == 0) {
                // System.out.printf("i: %d, prev: %d \n", i, prev);
                if ((i - prev) < distance && prev > 0) {
                    distance = i-prev;
                } 
                prev = i;    
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        MinDistance obj = new MinDistance();
        System.out.println("Min Distance Factors of 8 is " + obj.minDistance(8));
        System.out.println("Min Distance Factors of 13013 is " + obj.minDistance(13013));
    }
}
