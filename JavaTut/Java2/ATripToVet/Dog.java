public class Dog extends Pet {
    private double droolRate;
    
    public Dog(String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel);
        this.droolRate = validateDroolRate(droolRate);
    }

    public Dog(String name, double health, int painLevel) {
        super(name, health, painLevel);
        this.droolRate = 5;
    }

    private double validateDroolRate (Double droolRate) {
        if (droolRate <= 0.0) droolRate = 0.5;
        return droolRate;
    }

    public double getDroolRate() {
        return this.droolRate;
    }

    public void setDroolRate (double droolRate) {
        this.droolRate = validateDroolRate(droolRate);
    }

    public int treat() {
        int healTime = 0;
        if (this.droolRate < 3.5) healTime = (int) ((this.getPainLevel() * 2) / this.getHealth());
        if (this.droolRate >= 3.5 && this.droolRate <= 7.5) healTime = (int) (this.getPainLevel() / this.getHealth());
        if (this.droolRate > 7.5) healTime = (int) (this.getPainLevel() / this.getHealth() * 2);
        return healTime;
    }

    public void speak () {
        super.speak();
        String message = "bark";
        message = (this.getPainLevel() > 5) ? message.toUpperCase() : message;
        for (int i=0; i < this.getPainLevel(); i++)
            System.out.print(message);

    }
}
