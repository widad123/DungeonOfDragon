public class HeroWeapon extends Weapon{
    private int m_iAttaqueBonus;
    private String p_TargetCharacter;

    private int p_iBonus;


    public HeroWeapon(int m_AttackPoints,int m_AttackBonus, int p_iBonus) {
        super(m_AttackPoints);
        this.m_iAttaqueBonus= m_iAttaqueBonus;
    }

    public int getM_iAttaqueBonus() {
        return m_iAttaqueBonus;
    }

    public String getP_TargetCharacter() {
        return p_TargetCharacter;
    }

    public int getP_iBonus() {
        return p_iBonus;
    }

    public void setAttackBonus(int p_iBonus) {
        this.p_iBonus = p_iBonus;
    }



}
