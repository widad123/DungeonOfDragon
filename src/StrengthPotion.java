/**
 * The StrengthPotion class represents potions that increase the strength of the character in the game.
 * These potions have a name and provide a specific amount of strength points.
 */
public class StrengthPotion extends Potion {
    /**
     * Constructs a StrengthPotion with a name and strength point value.
     *
     * @param name          The name of the StrengthPotion.
     * @param healthPoints  The amount of health points this potion restores (set to 0).
     * @param strengthPoints The amount of strength points this potion provides.
     */
    public StrengthPotion() {
        super("StrengthPotion", 0, 20); // Example of strength points added for a strength potion.
    }
}
