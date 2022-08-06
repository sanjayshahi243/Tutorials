// Fahrenheit to Celcius Input

import java.util.Scanner;

public class FahrenheitToCelciusInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.println("Enter day of week: ");
        String day = input.next();
        double celcius = (5.0/9) * (fahrenheit-32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celcius: " + celcius);
    }
}