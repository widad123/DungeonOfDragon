/**
 * The Zombie class represents a zombie monster in the game.
 * It is a type of monster with its specific attributes, such as strength, life points, and weapon.
 */
public class Zombie extends Monster {
    /**
     * Constructs a Zombie monster with default attributes.
     */
    public Zombie() {
        super("Zombie", 30, 100, new Bite());
    }

    // You can customize the attributes of the Zombie based on the game rules, such as its strength, life points, and weapon.
}
