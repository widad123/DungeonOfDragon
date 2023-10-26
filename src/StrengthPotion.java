public class StrengthPotion extends Item {

    public StrengthPotion(int effectValue) {
        super(effectValue);
    }

    @Override
    public void applyEffect(Hero p_hero) {
        p_hero.improveStrength(m_iEffectValue);
    }

    public int getEffectValue() {
        return m_iEffectValue;
    }
}
