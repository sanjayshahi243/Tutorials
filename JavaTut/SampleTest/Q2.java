// package SampleTest;

public class Q2 {
    static int diffOfSum (int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i: arr) {
            if (i % 2 == 0) sumEven += i;
            else sumOdd += i;
        }
        return sumOdd - sumEven;
    }

    public static void main (String[] args) {
        int res = diffOfSum(new int[] {3, 3, 4, 4});
        System.out.println(res);
    }
}
