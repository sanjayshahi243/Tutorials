// Frog.java

public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private static String species;

    private static final int defaultAge = 5;
    private static final double defaultTongueSpeed = 5;

    public Frog (String name) {
        this(name, defaultAge, defaultTongueSpeed);
    }

    public Frog (String name, Double ageInYears) {
        this (name, (int) Math.round(ageInYears) * 12, defaultTongueSpeed);
    }
    
    public Frog (String name, int age, double tongueSpeed) {
        this.name = name; 
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }

    public boolean isFroglet() {
        return age > 1 && age < 7 ? true : false;
    }

    public void grow () {
        this.grow(1);
    }

    public void grow (int addedAge) {
        if (age < 12 && (age + addedAge) <= 30) {
            tongueSpeed = addedAge;
        } else if (age < 12 && (age + addedAge) > 30) {
            tongueSpeed += (addedAge - (age + addedAge - 12));
        }
        if (age + addedAge > 30) {
            tongueSpeed -= (age + addedAge - 30);
            if (tongueSpeed < 0) tongueSpeed = 0;
        }
        this.age += addedAge;
    }

    public void eat (Fly fly) {
        boolean isCaught = false;

        if (fly.isDead()) return;

        isCaught = tongueSpeed > fly.getSpeed() ? true : false;

        if (isCaught) {
            Double mass = fly.getMass();
            if (mass * 2 >= age) this.grow();

            fly.setMass(0);
        } else {
            fly.grow(1);
        }
    }

    public static String getSpecies () {
        return species;
    }

    public static void setSpecies (String speciesName) {
        species = speciesName;
    }

    public String toString () {
        if (isFroglet()) {
            return "My name is "+ name +" and I'm a rare froglet! I'm " + age +" months old and my tongue has a speed of " + tongueSpeed + ".";
        }
        return "My name is "+ name +" and I'm a rare frog! I'm " + age +" months old and my tongue has a speed of " + tongueSpeed + ".";
    }

    public static void main(String[] args) {
        Frog frog2 = new Frog("name");
        Frog frog3 = new Frog("WithAge", 2.0);
        Frog frog4 = new Frog("WithSpeed", 1, 5);
    }
}
