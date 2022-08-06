/*
A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the array. 
So {3, 5, -2} is a Meera array because 3*2, 5*2 and -2*2 are not in the array. 
But {8, 3, 4} is not a Meera array because for n=4, 2*n=8 is in the array.

Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.

If you are programming in Java or C#, the function signature is
   int isMeera(int [ ] a)

If you are programming in C or C++, the function signature is
   int isMeera(int a[ ], int len) where len is the number of elements in the array.
*/

public class MeeraArray {
    static int isMeera(int [ ] arr) {
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                // System.out.printf("\n i: %d, j: %d\n", arr[i], arr[j]);
                if (2*arr[i] == arr[j]) {
                    return 0;
                }                
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Result " + isMeera(new int[] {3,5,6}));
    }
}