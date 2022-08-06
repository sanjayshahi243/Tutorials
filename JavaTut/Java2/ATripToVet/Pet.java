
public abstract class Pet {
    private String name;
    private double health;
    private int painLevel;

    public Pet(String name, double health, int painLevel) {
        this.name = name;

        this.health = validateHealth(health);

        this.painLevel = validatePainLevel(painLevel);
    }

    private double validateHealth (Double health) {
        if (health < 0.0) health = 0.0;
        if (health > 1.0) health = 1.0;
        return health;
    }

    private int validatePainLevel (int painLevel) {
        if (painLevel < 1) painLevel = 1;
        if (painLevel > 10) painLevel = 10;
        return painLevel;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getHealth () {
        return this.health;
    }

    public void setHealth (Double health) {
        this.health = validateHealth(health);
    }
    public int getPainLevel () {
        return this.painLevel;
    }

    public void setPainLevel (int painLevel) {
        this.painLevel = validatePainLevel(painLevel);
    }

    public abstract int treat();

    public void speak() {
        String message = new String("Hello! My name is " + this.name);
        message = (this.painLevel > 5) ? message.toUpperCase() : message;
        System.out.println(message);
    }

    // public boolean equals(Object o) {
    //     return this.name == o.getName();
    // }

    protected void heal() {
        this.health = 1.0;
        this.painLevel = 1;
    }
}