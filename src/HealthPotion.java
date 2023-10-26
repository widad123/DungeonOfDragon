public class HealthPotion extends Item{

    public HealthPotion(int effectValue) {
        super(effectValue);
    }

    @Override
    public void applyEffect(Hero p_hero) {
        p_hero.improveHealth(m_iEffectValue);
    }

    public int getEffectValue() {
        return m_iEffectValue;
    }
}
