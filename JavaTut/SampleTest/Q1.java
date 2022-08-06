package SampleTest;

public class Q1 {
    static int isCentered (int[] arr) {
        if (arr.length % 2 == 0) return 0;
        // Get Middle Index position of array
        int midIndex = arr.length / 2;

        for (int i=0; i < arr.length; i++) {
            if (i != midIndex  && arr[midIndex] < arr[i]) {
                return 0;
            }
        }
        return 1;
    }
    public static void main (String[] args) {

    }
}
