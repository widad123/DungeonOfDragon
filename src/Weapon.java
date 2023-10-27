/**
 * The Weapon class represents a weapon that can be used by characters in the game.
 * It includes the name of the weapon and its attack bonus.
 */
public class Weapon {
    private String name;
    private int attackBonus;

    /**
     * Constructs a weapon with a given name and attack bonus.
     *
     * @param name         The name of the weapon.
     * @param attackBonus  The attack bonus provided by the weapon.
     */
    public Weapon(String name, int attackBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
    }

    /**
     * Get the name of the weapon.
     *
     * @return The name of the weapon.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the attack bonus provided by the weapon.
     *
     * @return The attack bonus of the weapon.
     */
    public int getAttackBonus() {
        return attackBonus;
    }
}
