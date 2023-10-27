/**
 * The Item class represents an abstract item in the game.
 */

public abstract class Item {

    /** The effect value of the item. */
    protected int m_iEffectValue;

    /**
     * Applies the effect of the item to a hero.
     *
     * @param p_Hero The hero to whom the item's effect is applied.
     */

    public Item(int effectValue) {
        this.m_iEffectValue = effectValue;
    }

    /**
     * Applies the effect of the item to a hero.
     *
     * @param p_Hero The hero to whom the item's effect is applied.
     */
    
    public abstract void applyEffect(Hero p_Hero);

    /**
     * Sets the effect value of the item to a new value.
     *
     * @param p_iValue The new effect value for the item.
     */

    public void setValue(int p_iValue) {
        this.m_iEffectValue = p_iValue;
    }


}
