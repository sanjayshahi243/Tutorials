/*
An array is defined to be complete if all its elements are greater than 0 and all even numbers that are less than 
the maximum even number are in the array. 

For example {2, 3, 2, 4, 11, 6, 10, 9, 8} is complete because 
  a. all its elements are greater than 0
  b. the maximum even integer is 10
  c. all even numbers that are less than 10 (2, 4, 6, 8) are in the array.

But {2, 3, 3, 6} is not complete because the even number 4 is missing. {2, -3, 4, 3, 6} is not complete 
because it contains a negative number.

Write a function named isComplete that returns 1 if its array argument is a complete array. Otherwise it returns 0.

The function signature is
   int isComplete (int[ ] a)

*/

public class CompleteArray2 {
    static int isComplete (int[ ] arr) {
        int isComplete = 0;
        int[] mustHaveElems = new int [] {2, 4, 6, 8};
        int[] evenElems = new int[arr.length];
        int counter = 0;
        for (int i=0; i < arr.length; i++) {
            if ((arr[i] < 0) || (arr[i] % 2 == 0 && arr[i] > 10)) {
                return 0;
            }
            if (arr[i] % 2 == 0 && arr[i] > 0 && arr[i] < 10) {
                boolean elemExist = false;
                for (int x: evenElems) {
                    if (arr[i] == x) {
                        elemExist = true;
                        break;
                    }
                }
                if (!elemExist) {
                    evenElems[counter] = arr[i];
                    counter++;
                }
            }
        }
        if (counter == mustHaveElems.length) {
            isComplete = 1;
        }
        return isComplete;
    }

    public static void main(String[] args) {
        System.out.println ("Result: " + isComplete(new int[] {2, 3, 2, 4, 11, 6, 10, 9, 8}));
    }
}