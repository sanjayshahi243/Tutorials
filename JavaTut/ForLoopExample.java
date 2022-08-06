public class ForLoopExample {
    public static void main (String[] args) {
        for (var i=0; i<5; i++) {
            System.out.println("Hello");
        }
        
        var count = 0;
        while (count > 0) {
            count--;
            System.out.println("Hello "+count);
        }

        int countDoWhile = 0;
        do {
            countDoWhile--;
            System.out.println("Do while "+countDoWhile);
        } while(countDoWhile > 0);
    }
}