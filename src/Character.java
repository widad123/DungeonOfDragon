/**
 * The Character class represents a generic character in the game.
 */
public class Character {
    private String name;
    private int lifePoints;
    private int strength;

    /**
     * Constructs a character with the specified name, life points, and strength.
     *
     * @param name The name of the character.
     * @param lifePoints The initial life points of the character.
     * @param strength The initial strength of the character.
     */
    public Character(String name, int lifePoints, int strength) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.strength = strength;
    }

    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the current life points of the character.
     *
     * @return The current life points of the character.
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * Gets the current strength of the character.
     *
     * @return The current strength of the character.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Sets the life points of the character to the specified value.
     *
     * @param lifePoints The new life points of the character.
     */
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    /**
     * Sets the strength of the character to the specified value.
     *
     * @param strength The new strength of the character.
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Checks if the character is alive based on their remaining life points.
     *
     * @return True if the character is alive, otherwise false.
     */
    public boolean isAlive() {
        return lifePoints > 0;
    }

    /**
     * Receives damage and updates the character's life points. If life points become negative, they are set to 0.
     *
     * @param damage The amount of damage to be received.
     */
    public void receiveDamage(int damage) {
        lifePoints -= damage;
        if (lifePoints < 0) {
            lifePoints = 0;
        }
    }

    /**
     * Improves the character's health points by the specified amount.
     *
     * @param points The number of health points to be added to the character's life points.
     */
    public void improveHealth(int points) {
        lifePoints += points;
    }

    /**
     * Improves the character's strength by the specified amount.
     *
     * @param points The number of strength points to be added to the character's strength.
     */
    public void improveStrength(int points) {
        strength += points;
    }
}
