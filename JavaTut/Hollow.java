/*
An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and followed by the same number of 
non-zero elements. Write a function named isHollow that  accepts an integer array and returns 1 if it is a hollow array, 
otherwise it returns 0

Examples:  isHollow({1,2,4,0,0,0,3,4,5}) returns 1.  isHollow ({1,2,0,0,0,3,4,5}) returns 0. 
isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0.  isHollow ({1,2, 0,0, 3,4}) returns 0.
*/

public class Hollow {
    int isHollow(int[ ] a) {
        boolean isHollow = false;
        int counter = 0;
        int startCount=0;
        int endCount=0;
        // A hollow array will at least have 5 elements i.e. 3 0's and at least first and last non-0 element.
        if (a.length < 5) return 0;

        for (int i=0; i<a.length; i++) {
            if (a[i] == 0) {
                counter++; 
                System.out.println("Counter: " + counter);
                if (counter >= 3) {
                    startCount = startCount == 0 ? i-3 : startCount;
                    endCount = i;
                }
            } else counter = 0;
        }
        System.out.println("startCount: " + startCount + " endCount: " +endCount);
        if (startCount+1 == a.length-(endCount+1)) isHollow=true;

        return isHollow ? 1 : 0;
    }

    public static void main(String[] args) {
        Hollow obj = new Hollow();
        int result = obj.isHollow(new int[] {1,2,3,0,0,0,0,3,4,5});
        System.out.println(result);
    }
}