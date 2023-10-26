/**
 * The `HeroWeapon` class represents a type of weapon used by heroes.
 * This class extends the `Weapon` class and adds attack bonus capabilities.
 */

public class HeroWeapon extends Weapon{
    protected int m_iAttaqueBonus;

    protected int p_iBonus;

    /**
     * Constructs a new `HeroWeapon` with the specified attack points and attack bonus.
     *
     * @param m_AttackPoints The base attack points of the weapon.
     * @param m_AttackBonus The bonus attack points provided by the weapon.
     */

    public HeroWeapon(int m_AttackPoints,int m_AttackBonus) {
        super(m_AttackPoints);
        this.m_iAttaqueBonus= m_iAttaqueBonus;
    }

    /**
     * Get the attack bonus value provided by the weapon.
     *
     * @return The attack bonus value.
     */


    public int getM_iAttaqueBonus() {
        return m_iAttaqueBonus;
    }

    /**
     * Set the attack bonus value provided by the weapon.
     *
     * @param m_AttackBonus  The new attack bonus value to set.
     */

    public void setAttackBonus(int m_AttackBonus ) {
        this.p_iBonus = m_AttackBonus ;
    }



}
