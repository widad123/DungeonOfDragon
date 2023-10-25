public class MonsterWeapon extends Weapon{
    private int m_CriticalCountDown;
    private int s_iMaxRoundBeforeCritical;

    public MonsterWeapon(int m_AttackPoints, int m_CriticalCountDown, int s_iMaxRoundBeforeCritical) {
        super(m_AttackPoints);
        this.m_CriticalCountDown = m_CriticalCountDown;
        this.s_iMaxRoundBeforeCritical = s_iMaxRoundBeforeCritical;
    }

    public int getM_CriticalCountDown() {
        return m_CriticalCountDown;
    }

    public void setM_CriticalCountDown(int m_CriticalCountDown) {
        this.m_CriticalCountDown = m_CriticalCountDown;
    }

    public int getS_iMaxRoundBeforeCritical() {
        return s_iMaxRoundBeforeCritical;
    }

    public void setS_iMaxRoundBeforeCritical(int s_iMaxRoundBeforeCritical) {
        this.s_iMaxRoundBeforeCritical = s_iMaxRoundBeforeCritical;
    }

    public void inflictDamage(Character character) {

    }
}
