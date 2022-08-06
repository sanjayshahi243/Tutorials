public class DiceGame {
    private Dice dice1, dice2;
    private int point;
    
    public DiceGame() {
        dice1 = new Dice();
        dice2 = new Dice();
    }

    private int toss () {
        int total = dice1.roll() + dice2.roll();
        System.out.println("Dice one: " + dice1.getFaceValue());
        System.out.println("Dice two: " + dice2.getFaceValue());
        return total;
    }

    private void stage2 () {
        boolean endGame = false;

        while(!endGame) {
            int total = toss();
            System.out.println("Total: " + total);

            if (total == point) {
                System.out.println("Winner!!!");
                endGame = true;
            }
            else if (total == 7) {
                System.out.println("You Lose!");
                endGame = true;
            }
        }
    }

    private void go () {
        point = toss();
        System.out.println("Point: " + point);

        if (point == 7 || point == 11) System.out.println("Winner!!!");

        else if (point == 2 || point == 3 || point == 12) System.out.println("You Lose!");

        else {
            System.out.println("Entering next Stage...");
            stage2 ();
        }
    }

    public static void main(String[] args) {
        DiceGame dg = new DiceGame ();

        dg.go();
    }
}
