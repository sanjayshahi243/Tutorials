/*
Write a function fill with signature
 
int[ ] fill(int[ ] arr, int k, int n) 

which does the following: It returns an integer array arr2 of length n whose first k elements are the same as 
the first k elements of arr, and whose remaining elements consist of repeating blocks of the first k elements.  
You can assume array arr has at least k elements. The function should return null if either k or n is not positive.  

Examples:  
fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. 
fill({4, 2, -3, 12}, 1, 5)  returns {4, 4, 4, 4, 4}. 
fill({2, 6, 9, 0, -3}, 0, 4) returns null.
*/

import java.util.Arrays;

public class FillArr {
    int[] fill(int[] arr, int k, int n) {
        if (k < 1 || n < 1) return null;
        if (arr.length < k) return null;
        int count = 0;
        int[] arr2 = new int[n];
        for (int i=0; i<n; i++) {
            if (count >= k) count = 0;
            arr2[i] = arr[count];
            count++;
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr1;
        int[] a;
        FillArr obj = new FillArr();
        arr1 = new int[] {1,2,3,5, 9, 12,-2,-1};
        a = obj.fill(arr1, 3, 10);
        System.out.println(Arrays.toString(a));
        arr1 = new int[] {4, 2, -3, 12};
        a = obj.fill(arr1, 1, 5);
        System.out.println(Arrays.toString(a));
        arr1 = new int[] {2, 6, 9, 0, -3};
        a = obj.fill(arr1, 0, 4);
        System.out.println(Arrays.toString(a));
    }
}
