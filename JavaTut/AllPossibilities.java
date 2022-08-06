/*
A non-empty array of length n is called an array of all possibilities, if it contains all numbers between 0 and n - 1 inclusive. 
Write a method named isAllPossibilities that accepts an integer array and returns 1 if the array is an array of all possibilities, 
otherwise it returns 0. Examples {1, 2, 0, 3} is an array of all possibilities, {3, 2, 1, 0} is an array of all possibilities, 
{1, 2, 4, 3} is not an array of all possibilities, (because 0 not included and 4 is too big), 
{0, 2, 3} is not an array of all possibilities, (because 1 is not included), {0} is an array of all possibilities, 
{} is not an array of all possibilities (because array is empty).
If you are programming in Java or C#, the function signature is  
int isAllPossibilities(int[ ] a)
If you are programming in C or C++, the function signature is  
int isAllPossibilities(int a[ ], int len) 
where len is the number of elements in the array.
*/

public class AllPossibilities {
    static int isAllPossibilities ( int[] arr ) {
        int num = arr.length;
        if (num == 0) return 0;

        for (int i = 0; i < num; i++) {
            if (arr[i] >= num) return 0;
            
            for (int j = 0; j < num; j++) {
                if (arr[i] == arr[j] && i != j) return 0;
            }
        }
        return 1;
    } 

    public static void main(String[] args) {
        System.out.println("Result: " + isAllPossibilities(new int[] {1, 2, 0, 3}));  // 1
        System.out.println("Result: " + isAllPossibilities(new int[] {3, 2, 1, 0}));    // 1   
        System.out.println("Result: " + isAllPossibilities(new int[] {1, 2, 4, 3}));    // 0
        System.out.println("Result: " + isAllPossibilities(new int[] {0, 2, 3}));   // 0
        System.out.println("Result: " + isAllPossibilities(new int[] {}));  // 0
    }
}
