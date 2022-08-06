/*
An array with an odd number of elements is said to be centered if all elements (except the middle one) are strictly 
greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element.
 Write a function named isCentered that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.  

Examples: {5, 3, 3, 4, 5} is not a centered array (the middle element 3 is not strictly less than all other elements), 
{3, 2, 1, 4, 5} is centered (the middle element 1 is strictly less than all other elements), 
{3, 2, 1, 4, 1} is not centered (the middle element 1 is not strictly less than all other elements), 
{3, 2, 1, 1, 4, 6} is not centered (no middle element since array has even number of elements), 
{} is not centered (no middle element), {1} is centered (satisfies the condition vacuously). 

If you are programming in Java or C#, the function signature is  
	int isCentered(int[ ] a)

If you are programming in C or C++, the function signature is  
	int isCentered(int a[ ], int len) 
where len is the number of elements in the array.   
*/

import java.util.Scanner;

public class CenteredArray {
    static boolean isCentered (int[] arr) {
        boolean isCentered = true;
        if (arr.length < 1 || arr.length % 2 == 0 ) return false;
        
        int centeredElementIndex = (arr.length/2);  // Because array index starts from 0, no need to add 1.
        for (int i=0; i < arr.length; i++) {
            if (i != centeredElementIndex && arr[i] <= arr[centeredElementIndex]) {
                System.out.printf("i = %d, cenIndex = %d, arr_i= %d, arr_cen = %d",i, centeredElementIndex, arr[i], arr[centeredElementIndex]);
                isCentered = false;
                break;
            }
        }
        return isCentered;
    }

    public static void main(String[] args) {
        int arr_size;
        Scanner input = new Scanner (System.in);
        // Getting input from user
        System.out.println("Enter the size of array: ");
        arr_size = input.nextInt();

        int arr[]=new int[arr_size];//declaration and instantiation  

        System.out.printf("Enter elements: ");
        for (int i=0; i < arr_size; i++) {
            arr[i] = input.nextInt();
        }


        System.out.printf("\nResult: %b", isCentered(arr));
    }
}