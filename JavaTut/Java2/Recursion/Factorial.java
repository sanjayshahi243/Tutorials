public class Factorial {

    public static int getFactorial (int n) {
        if (n == 0) return 1;
        if(n < 0) throw new IllegalArgumentException("Non-negative input required");
        return n * getFactorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(getFactorial(0));
    }
}
