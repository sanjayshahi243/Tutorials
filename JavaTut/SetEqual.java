/*
Let us define two arrays as "set equal" if every element in one is also in the other and vice-versa. 
For example, any two of the following are equal to one another: {1, 9, 12}, {12, 1, 9}, {9, 1, 12, 1}, {1, 9, 12, 9, 12, 1, 9}. 
Note that {1, 7, 8} is not set equal to {1, 7, 1} or {1, 7, 6}.   
Write a function named isSetEqual(int[ ] a, int[ ] b) that returns 1 if its array arguments are set equal, 
otherwise it returns 0. 
*/

public class SetEqual {
    static int isSetEqual(int[ ] a, int[ ] b) {
        int isSetEqual = 1;
        int[] c;
        int[] d;
        if (a.length < b.length) {
            c = a; d = b;
        } else {
            c=b; d=a;
        }
        for (int i = 0; i < c.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < d.length; j++) {
                if (c[i] == d[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) return 0;
        }
        return isSetEqual;
    }
    public static void main (String[] args) {
        int[] a = new int[] {1, 7, 1, 8 };
        int[] b = new int[] {8, 1, 9, 19, 7};
        System.out.println ("Result: " + isSetEqual(a, b));
    }
}