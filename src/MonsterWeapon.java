/**
 * The MonsterWeapon class represents weapons used by monsters in the game.
 * These weapons have a name and deal a specific amount of damage.
 */
public class MonsterWeapon extends Weapon {
    /**
     * Constructs a MonsterWeapon with a name and damage value.
     *
     * @param name   The name of the MonsterWeapon.
     * @param damage The amount of damage the weapon can deal.
     */
    public MonsterWeapon(String name, int damage) {
        super(name, damage);
    }

    // You can add additional methods or attributes specific to monster weapons if needed.
}
