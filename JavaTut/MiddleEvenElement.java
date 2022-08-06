/*
0 condition check
exist even number
find middle element, if odd add 1 else return number < 0
Array Size > 2

*/

public class MiddleEvenElement {
    static int middleElement (int[] arr) {
        if (arr.length < 2) return -1;
        if (arr.length % 2 == 0) return -1;

        int midIdx = arr.length / 2;
        if (arr[midIdx] % 2 == 0 && arr[midIdx] > 0) return arr[midIdx];
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[midIdx] == 0) return 2;
                if (arr[midIdx] % 2 == 0) return arr[midIdx];
                else return arr[midIdx] + 1;
            }
        }
        return -1;
    }
    
    public static void main (String[] args) {
        MiddleEvenElement obj = new MiddleEvenElement();
        int res = obj.middleElement(new int[] {1, 1});

        if (res < 0) System.out.println("Invalid Number");
        else {
            System.out.println("Middle Element is " + res);
        }
    }
}