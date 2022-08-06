/*
A wave array is defined to an array which does not contain two even numbers or two odd numbers in adjacent locations. 
So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave arrays. 
But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each other.

Write a function named isWave that returns 1 if its array argument is a Wave array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isWave (int [ ] a)

If you are programming in C or C++, the function signature is
   int isWave (int a[ ], int len) where len is the number of elements in the array.
*/

public class WaveArray {
    public int isWave (int [ ] a) {
        int isWave = 1;

        for (int i=1; i < a.length; i++) {
            if ((a[i] % 2 == 0 && a[i-1] % 2 == 0) || (a[i] % 2 != 0 && a[i-1] % 2 != 0)) {
                isWave = 0;
                break;
            }
        }
        return isWave;
    }

    public static void main(String[] args) {
        WaveArray obj = new WaveArray();
        System.out.println("{7, 2, 9, 10, 5}: " + obj.isWave(new int[] {7, 2, 9, 10, 5}));
        System.out.println("{4, 11, 12, 1, 6}: " + obj.isWave(new int[] {4, 11, 12, 1, 6}));
        System.out.println("{1, 0, 5}: " + obj.isWave(new int[] {1, 0, 5}));
        System.out.println("{2}: " + obj.isWave(new int[] {2}));
        System.out.println("{2, 6, 3, 4}: " + obj.isWave(new int[] {2, 6, 3, 4}));
    }
}