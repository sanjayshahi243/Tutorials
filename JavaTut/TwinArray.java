/*
Consider the prime number 11. Note that 13 is also a prime and 13 – 11 = 2. So, 11 and 13 are known as twin primes. 
Similarly, 29 and 31 are twin primes. So is 71 and 73. However, there are many primes for which there is no twin. 
Examples are 23, 67. A twin array is defined to an array which every prime that has a twin appear with a twin. Some examples are 
{3, 5, 8, 10, 27}, 	     // 3 and 5 are twins and both are present
{11, 9, 12, 13, 23},       // 11 and 13 are twins and both are present, 23 has no twin
{5, 3, 14, 7, 18, 67}.      // 3 and 5 are twins, 5 and 7 are twins, 67 has no twin

The following are NOT twin arrays:

{13, 14, 15, 3, 5} 	 // 13 has a twin prime and it is missing in the array
{1, 17, 8, 25, 67}     // 17 has a twin prime and it is missing in the array

Write a function named isTwin(int[ ] arr) that returns 1 if its array argument is a Twin array, otherwise it returns 0. 
*/

public class TwinArray {
    static boolean isPrime (int n) {
        boolean isPrime = true;
        if (n < 2) return false;
        for (int i = 2; i<=n/2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static int isTwin(int[] arr) {
        int isTwin = 0;
        for (int i=0; i < arr.length; i++) {
            // Check if array element is prime.
            boolean isElemPrime = isPrime(arr[i]);
            if (isElemPrime) {
                int postwin = isPrime(arr[i]+2) ? arr[i]+2 : -1;
                int negtwin = isPrime(arr[i]-2) ? arr[i]-2 : -1;
                if (postwin < 0 && negtwin < 0) continue;
                for (int j = 0; j< arr.length; j++) {
                    System.out.println("Twin: " + postwin + ", " + negtwin);
                    if ((postwin > 0 && arr[j] == postwin) || (negtwin > 0 && arr[j] == negtwin)) {
                        isTwin = 1;
                        break;
                    } 
                }
                if (isTwin == 0) {
                    return 0;
                }
            }
        }
        return isTwin;
    }

    public static void main (String[] arr) {
        System.out.println ("Result: " +isTwin(new int[] {3, 5, 8, 10, 27}));
    }
}