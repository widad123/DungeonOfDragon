public class Potion {
    private String name;
    private int healthPoints;
    private int strengthPoints;

    public Potion(String name, int healthPoints, int strengthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }
}
