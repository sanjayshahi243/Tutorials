//  An Evens number is an integer whose digits are all even. For example 2426 is an Evens number but 3224 is not.

// Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it returns 0.

// The function signature is
//    int isEvens (int n)

import java.util.Scanner;

public class IntsEven {
    int isEvens (int n) {
        int is_evens = 1;
        while (n != 0) {
            int i = n % 10;
            n /= 10;
            if (i%2 != 0) {
                is_evens = 0;
                break;
            }
        }
        return is_evens;
    }
        
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        IntsEven intsEvenObj = new IntsEven();
        int result = intsEvenObj.isEvens(num);
        System.out.println("Your Result: " + result);

    }
}