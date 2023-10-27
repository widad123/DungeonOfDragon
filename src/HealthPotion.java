/**
 * The HealthPotion class represents a health potion item in the game, which can be used by heroes.
 */

public class HealthPotion extends Item{

        /**
     * Constructs a health potion with the specified effect value.
     *
     * @param effectValue The amount by which the health of the hero is improved when using the potion.
     */

    public HealthPotion(int effectValue) {
        super(effectValue);
    }

        /**
     * Applies the health-improving effect of the potion to a hero.
     *
     * @param p_hero The hero to whom the health potion's effect is applied.
     */
    
    @Override
    public void applyEffect(Hero p_hero) {
        p_hero.improveHealth(m_iEffectValue);
    }

    /**
     * Gets the effect value of the health potion, which represents the amount of health improvement it provides.
     *
     * @return The effect value of the health potion.
     */
    
    public int getEffectValue() {
        return m_iEffectValue;
    }
}
