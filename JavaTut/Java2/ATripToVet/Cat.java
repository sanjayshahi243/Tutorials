public class Cat extends Pet {
    private int miceCaught;

    public Cat(String name, double health, int painLevel, int miceCaught) {
        super(name, health, painLevel);
        this.miceCaught = validateMiceCaught(miceCaught);
    }

    Cat(String name, double health, int painLevel) {
        super(name, health, painLevel);
        this.miceCaught = 0;
    }

    private int validateMiceCaught (int miceCaught) {
        return miceCaught < 0 ? 0 : miceCaught;
    }

    public int getMiceCaught () {
        return this.miceCaught;
    }

    public void setMiceCaught (int miceCaught) {
        this.miceCaught = validateMiceCaught(miceCaught);
    }

    public int treat() {
        int healTime = 0;
        if (this.miceCaught < 4) healTime = (int) ((this.getPainLevel() * 2) / this.getHealth());
        if (this.miceCaught >= 4 && this.miceCaught <= 7) healTime = (int) (this.getPainLevel() / this.getHealth());
        if (this.miceCaught > 7) healTime = (int) (this.getPainLevel() / this.getHealth() * 2);
        return healTime;
    }

    public void speak () {
        super.speak();
        String message = "meow";
        message = (this.getPainLevel() > 5) ? message.toUpperCase() : message;
        for (int i=0; i < this.miceCaught; i++)
            System.out.print(message);
    }
}
