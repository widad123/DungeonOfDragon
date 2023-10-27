/**
 * The Barbarian class represents a type of monster known as a "Barbarian" in the game.
 */
public class Barbarian extends Monster {
    /**
     * Constructs a Barbarian monster with custom attributes, such as name, strength, health points, and weapon.
     */
    public Barbarian() {
        super("Barbarian", 50, 200, new Axe());
    }

    // Customize the attributes of the Barbarian based on the game rules, such as its strength, health points, and weapon.
}
