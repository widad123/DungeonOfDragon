public abstract class Item {

    protected int m_iEffectValue;

    public Item(int effectValue) {
        this.m_iEffectValue = effectValue;
    }

    public abstract void applyEffect(Hero p_Hero);

    public void setValue(int p_iValue) {
        this.m_iEffectValue = p_iValue;
    }


}
