/*
An array is defined to be complete if the conditions (a), (d) and (e) below hold.
  a. The array contains even numbers
  b. Let min be the smallest even number in the array.
  c. Let max be the largest even number in the array.
  d. min does not equal max
  e. All numbers between min and max are in the array

For example {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7} is complete because 
  a. The array contains even numbers
  b. 2 is the smallest even number
  c. 8 is the largest even number
  d. 2 does not equal 8
  e. the numbers 3, 4, 5, 6, 7 are in the array.

Examples of arrays that are not complete are:
{5, 7, 9, 13} condition (a) does not hold, there are no even numbers.
{2, 2} condition (d) does not hold
{2, 6, 3, 4} condition (e) does not hold (5 is missing)

Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.

If you are writing in Java or C#, the function signature is
   int isComplete (int[ ] a)
*/

import java.util.Scanner;
import java.util.Arrays;

class CompleteArray {
    static int[] sort (int[] arr) {
        for (int i=0; i < arr.length; i++) {
            for (int j=i+1; j < arr.length; j++ ) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    /*
    int isComplete(int[] arr) {
        int evenArr[] = new int[arr.length];
        int arrCounter = 0;
        for (int elem : arr) {
            if (elem % 2 == 0 && elem > 0) {
                evenArr[arrCounter] = elem;
                arrCounter++;
            }
        }
        
        if (arrCounter < 1) return 0;   // Return 0 if there are no even numbers
        
        // Displaying even array
        System.out.println("Array Elements: " + Arrays.toString(evenArr));

        int min = min(evenArr);
        int max = max(evenArr);
         
        // Displaying even array
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);

        if (min == max) return 0;

        int[] sortedArr = sort(evenArr);

        // Displaying sorted array
        System.out.println("Sort Array Elements: " + Arrays.toString(sortedArr));

        return 1;
    }
    */

    int isComplete(int[] arr) {
        // Sorting Array in ascending order
        int[] sortedArr = sort(arr);
        int min = 0;
        int max = 0;
        int minIndex = -1;
        int maxIndex = -1;

        // Find minimum element in array. Since the array is sorted in ascending order. The positive even number at start will be the minimum
        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] > 0 && sortedArr[i] % 2 == 0) {
                min = sortedArr[i];
                minIndex = i;
                break;
            }
        }
        
        // min = 0 indicates that the array has no positive even numbers greater than 0. Therefore, not complete Array
        if (min == 0) return 0;
        
        // Find maximum element in array. Since the array is sorted in ascending order. The positive even number at last will be the maximum

        for (int i=sortedArr.length-1; i >= 0; i--) {
            if (sortedArr[i] > 0 && sortedArr[i] % 2 == 0) {
                max = sortedArr[i];
                maxIndex = i;
                break;
            }
        }

        // Display sorted array, minimum and maximum
        System.out.println("Sorted Array Elements: " + Arrays.toString(sortedArr));
        System.out.printf("\nMinimum: %d \nMaximum: %d", min, max);

        // If minimum element value is same as maximum element value, then it is not complete array
        if (min == max) return 0;

        /*
            Code breakdown:
            | => suggests other array input

            arr = [8 -6 10 2 5] | [6 5 2 1 3 4]

            sortedArr = [-6 2 5 8 10] | [1 2 3 4 5 6]

            min = 2 | 2
            minIndex = 1 | 1

            max = 10 | 6
            maxIndex = 4 | 5

            1. Initiate a loop from minimum element index to maximum element index. i.e. for first array is 1-4 and for 2nd is 1-5
            Loop- 1 to 4 | 1 to 5

            if ((sortedArr[i+1] != sortedArr[i]) && sortedArr[i+1] != (sortedArr[i] + 1) )
            If condition is satisfied, then it is not complete array.

            In first loop for first array, 
            i = minIndex = 1, sortedArr[i+1] = sortedArr[2] = 5
            5 != 2 and 5 != (2+1 = 3), 
            So when the array is sorted, the next element should be either self value i.e 2 or next value i.e. 3.
            Since this is not the condition, we can safely assume, the array is not complete.
            
            In first loop of second array
            i = minIndex = 1, sortedArr[i+1] = sortedArr[2] = 3
            3 != 2 and 3 != (2+1 = 3), 
            So when the array is sorted, the next element should be either self value i.e 2 or next value i.e. 3.
            Since the next element is 3 we proceed to next loop and so on to the maxIndex.
        */
        for (int i = minIndex; i < maxIndex; i++) {
            if ((sortedArr[i+1] != sortedArr[i]) && sortedArr[i+1] != (sortedArr[i] + 1) ) {
                return 0;
            }
        }
        return 1;
    }

    public static void main (String[] args) {
        int arr_size;
        // Make scanner object for accepting array from user.
        Scanner input = new Scanner(System.in);

        // Getting input from user
        System.out.println("Enter the size of array: ");
        arr_size = input.nextInt();

        int arr[]=new int[arr_size];//declaration and instantiation  
        for (int i=0; i < arr_size; i++) {
            System.out.printf("Enter %d element: ", i);
            arr[i] = input.nextInt();
        }

        // Displaying input array
        System.out.println("Array Elements: " + Arrays.toString(arr));

        CompleteArray obj = new CompleteArray();
        
        int result = obj.isComplete(arr);
        
        // Displaying result
        System.out.printf("\nResult: %d", result);

    }
}