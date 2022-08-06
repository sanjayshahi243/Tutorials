// Fly.java

public class Fly {
    private double mass;
    private double speed;
    private static final double DEFAULT_MASS = 5.0;
    private static final double DEFAULT_SPEED = 10.0;

    public Fly () {
        this (DEFAULT_MASS, DEFAULT_SPEED);
    }

    public Fly (double mass) {
        this (mass, DEFAULT_SPEED);
    }

    public Fly (double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    public double getMass () {
        return this.mass;
    }

    public void setMass (double mass) {
        if (validateMass(mass)) this.mass = mass;
    }

    public static boolean validateMass (double mass) {
        return mass >= 0 ? true : false;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        if (validateSpeed(speed)) this.speed = speed;
    }

    public static boolean validateSpeed (double speed) {
        return speed > 0 ? true : false;
    }

    public boolean isDead () {
        return mass <= 0 ? true : false;
    }

    public void grow (int addedWeight) {
        if (this.mass < 20) {
            if (this.mass + addedWeight > 20) {
                this.speed += (this.mass + addedWeight - 20);
                this.speed -= (this.mass + addedWeight - 20)  * 0.5;
            } else {
                this.speed += addedWeight;
            }

        } else {
            this.speed -= (addedWeight * 0.5);
        }

        this.mass += addedWeight;
    }

    public String toString () {
        return mass == 0 ? "I'm dead, but I used to be a fly with a speed of " + speed +"." : "I'm a speedy fly with " + speed + " speed and " + mass + " mass.";
    }

    public static void main(String[] args) {
        Fly fly1 = new Fly ();
        Fly fly2 = new Fly (10, 5);
        Fly fly3 = new Fly (10);
        Fly fly4 = new Fly (5);
    }
}
