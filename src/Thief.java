/**
 * The Thief class represents a type of monster called "Thief" in the game.
 * Thieves are known for their agility and use daggers as weapons.
 */
public class Thief extends Monster {
    /**
     * Constructs a Thief monster with a name, strength, life points, and a Dagger as its weapon.
     */
    public Thief() {
        super("Thief", 30, 100, new Dagger());
    }
}
