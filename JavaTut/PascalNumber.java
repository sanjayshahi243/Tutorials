public class PascalNumber {
    static int isPascal (int n) {
        int sum = 0;
        int i = 0;
        int isPascal = 0;

        while (sum < n) {
            i++;
            sum += i;
        }
        if (sum == n) {
            isPascal = 1;
        }
        return isPascal;
    }    
    public static void main(String[] args) {
        System.out.println("Result 6: " + isPascal(6));
        System.out.println("Result 15: " + isPascal(15));
        System.out.println("Result 7: " + isPascal(7));
        System.out.println("Result 3: " + isPascal(3));
    }
}
