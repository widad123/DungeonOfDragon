/**
 * The StrengthPotion class represents a strength-boosting potion item in the game, which can be used by heroes.
 */

public class StrengthPotion extends Item {

        /**
     * Constructs a strength-boosting potion with the specified effect value.
     *
     * @param effectValue The amount by which the hero's strength is improved when using the potion.
     */
    
    public StrengthPotion(int effectValue) {
        super(effectValue);
    }

        /**
     * Applies the strength-boosting effect of the potion to a hero.
     *
     * @param p_hero The hero to whom the strength potion's effect is applied.
     */
    
    @Override
    public void applyEffect(Hero p_hero) {
        p_hero.improveStrength(m_iEffectValue);
    }

        /**
     * Gets the effect value of the strength potion, which represents the amount of strength improvement it provides.
     *
     * @return The effect value of the strength potion.
     */
    
    public int getEffectValue() {
        return m_iEffectValue;
    }
}
