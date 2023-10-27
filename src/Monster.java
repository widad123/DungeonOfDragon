/**
 * The Monster class represents a type of character in the game that the hero can encounter and battle.
 * Monsters have their own weapons and attributes.
 */
public class Monster extends Character {
    private Weapon weapon;
    private int attackCount;

    private static final int MAX_ROUNDS_BEFORE_CRITICAL = 4;

    /**
     * Constructs a Monster with a name, strength, life points, and a weapon.
     *
     * @param name       The name of the Monster.
     * @param strength   The strength of the Monster.
     * @param lifePoints The initial life points of the Monster.
     * @param weapon     The weapon equipped by the Monster.
     */
    public Monster(String name, int strength, int lifePoints, Weapon weapon) {
        super(name, strength, lifePoints);
        this.weapon = weapon;
        this.attackCount = 0;
    }

    /**
     * Performs an attack on the hero using the Monster's weapon.
     *
     * @param hero The hero to attack.
     * @return The damage inflicted on the hero.
     */
    public int attack(Hero hero) {
        int damage = weapon.getAttackBonus();

        // Check for critical attack
        if (++attackCount % getCriticalAttackFrequency() == 0) {
            damage *= 2;
            System.out.println("Critical attack, twice the damage");
        }

        hero.receiveDamage(damage);
        System.out.println("The " + weapon.getClass().getSimpleName() + " is inflicting " + damage + " damages to the hero");
        System.out.println("Hero has been hit and has now " + hero.getLifePoints() + " life points left");
        return damage;
    }

    /**
     * Get the type of the Monster's effective weapon.
     *
     * @return The type of the Monster's effective weapon.
     */
    public String getEffectiveWeaponType() {
        return weapon.getClass().getSimpleName();
    }

    // Abstract method to get the critical attack frequency for each type of monster.
    protected int getCriticalAttackFrequency() {
        return 4; // Default is one critical attack every 4 turns.
    }

    // Method to determine if the Monster performs a critical attack.
    public boolean isCriticalAttack() {
        return (attackCount % MAX_ROUNDS_BEFORE_CRITICAL) == 0;
    }

    private Map<Class<? extends Potion>, Integer> potions = new HashMap<>();

    /**
     * Add a potion to the Monster's inventory.
     *
     * @param potionType The type of potion to add.
     */
    public void addPotion(Class<? extends Potion> potionType) {
        if (potions.containsKey(potionType)) {
            int count = potions.get(potionType);
            potions put(potionType, count + 1);
        } else {
            potions.put(potionType, 1);
        }
    }
}
