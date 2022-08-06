// A Simple OOP app. 
// In this app, we will have 2 dices. We will roll the dice.

// Value we will get is the sum of face values of the 2 dice.

// If we get 7 or 11 in first roll, we will win and Game Over.
// If we get 2, 3 or 12 in first roll, we lose and Game Over. 

// If any other number, i.e. 4, 5, 6, 8, 9, 10, we will call that number => point number. 
// If we get a point number, we will move on to the 2nd stage of game. 
// Win condition, 
// Keep Rolling the dice until we get the point number. Game Over. 
// Lose, 
// If we roll a 7 before we reach the point number. Game Over. 


import java.util.Random;

public class Dice {

    private Random rand;
    private int faceValue;

    public static final int SIDES = 6;

    public Dice () {
        faceValue = 1;
        rand = new Random();
    }

    public int roll () {
        faceValue = rand.nextInt(SIDES) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public String toString () {
        return "Dice with face value: " + faceValue;
    }

    public static void main(String[] args) {
        Dice d1 = new Dice();
        System.out.println(d1.toString());
        System.out.println(d1.roll());
        System.out.println(d1.roll());
    }
}
