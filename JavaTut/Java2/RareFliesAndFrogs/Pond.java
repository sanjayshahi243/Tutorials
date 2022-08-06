// Pond.java

public class Pond {
    public static void main(String[] args) {
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10/12, 15);
        Frog peepaw = new Frog("Peepaw", (int) Math.round(4.6) * 12, 5);
        Frog peepa = new Frog("Peepa", 15, 15);

        Fly f1 = new Fly(1, 3);
        Fly f2 = new Fly(6);
        Fly f3 = new Fly();
        
        // Set the species of any Frog to "1331 Frogs"
        Frog.setSpecies("1331 Frogs");
        System.out.println(Frog.getSpecies());

        // Print out on a new line the description of the Frog named Peepo given by the toString method.
        System.out.println(peepo);

        // Have the Frog named Peepo attempt to eat the Fly with a mass of 6.
        peepo.eat(f2);

        // Print out on a new line the description of the Fly with a mass of 6 given by the toString method.
        System.out.println(f2);

        // Have the Frog named Peepo grow by 8 months.
        peepo.grow(8);

        // Have the Frog named Peepo attempt to eat the Fly with a mass of 6.
        peepo.eat(f2);

        // Print out on a new line the description of the Fly with a mass of 6 given by the toString method.
        System.out.println(f2);

        // Print out on a new line the description of the Frog named Peepo given by the toString method.
        System.out.println(peepo);

        // Print out on a new line the description of your own Frog given by the toString method.
        System.out.println(peepa);

        // Have the Frog named Peepaw grow by 4 months.
        peepaw.grow(4);

        // Print out on a new line the description of the Frog named Peepaw given by the toString method.
        System.out.println(peepaw);

        // Print out on a new line the description of the Frog named Pepe given by the toString method.
        System.out.println(pepe);
    }
}
