I've added Javadoc comments to your `Hero` class in English:

```java
/**
 * The Hero class represents a character in the game who can wield weapons, attack monsters, and use potions.
 */
public class Hero extends Character {
    private Weapon weapon;
    private int currentRoom;

    /**
     * Constructs a Hero with a specified name, strength, life points, and a weapon.
     *
     * @param name      The name of the hero.
     * @param strength  The strength of the hero.
     * @param lifePoints The initial life points of the hero.
     * @param weapon    The weapon equipped by the hero.
     */
    public Hero(String name, int strength, int lifePoints, Weapon weapon) {
        super(name, strength, lifePoints);
        this.weapon = weapon;
    }

    /**
     * Gets the effective weapon wielded by the hero.
     *
     * @return The hero's effective weapon.
     */
    public Weapon getEffectiveWeapon() {
        return weapon;
    }

    /**
     * Gets the current room number where the hero is located.
     *
     * @return The current room number.
     */
    public int getCurrentRoom() {
        return currentRoom;
    }

    /**
     * Sets the current room number for the hero.
     *
     * @param roomNumber The room number where the hero is located.
     */
    public void setCurrentRoom(int roomNumber) {
        this.currentRoom = roomNumber;
    }

    /**
     * Performs an attack on a monster.
     *
     * @param monster The monster to be attacked.
     * @return The damage inflicted on the monster in the attack.
     */
    public int attack(Monster monster) {
        // Check if the hero's weapon is effective against the monster
        if (weapon.getClass().getSimpleName().equals(monster.getEffectiveWeaponType())) {
            int damage = weapon.getAttackBonus() + getStrength();
            return damage;
        } else {
            // The weapon is not effective, the hero only adds their strength to the damage
            return getStrength();
        }
    }

    /**
     * Uses a potion to restore health or strength to the hero.
     *
     * @param potion The potion to be used.
     */
    public void usePotion(Potion potion) {
        if (potion instanceof HealthPotion) {
            improveHealth(10);
            System.out.println("Hero has been restored 10 life points, they now have " + getLifePoints() + " total life points.");
        } else if (potion instanceof StrengthPotion) {
            improveStrength(20);
            System.out.println("Hero has been restored 20 strength points, they now have " + getStrength() + " total strength.");
        }
    }

    /**
     * Gets the type of the effective weapon wielded by the hero.
     *
     * @return The type of the hero's effective weapon.
     */
    public String getEffectiveWeaponType() {
        return weapon.getClass().getSimpleName();
    }
}
```

After adding these Javadoc comments to your code, you can generate Javadoc documentation in English by running the `javadoc` tool, following the same steps as previously mentioned.
