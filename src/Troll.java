/**
 * The Troll class represents a type of monster called "Troll" in the game.
 * Trolls are known for their brute strength and wield clubs as their weapons.
 */
public class Troll extends Monster {
    /**
     * Constructs a Troll monster with a name, strength, life points, and a Club as its weapon.
     */
    public Troll() {
        super("Troll", 40, 150, new Club());
    }

    // Customize the attributes of the Troll based on the game's rules, such as its strength, life points, and weapon.
}
