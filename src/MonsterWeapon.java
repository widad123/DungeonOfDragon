/**
 * The `MonsterWeapon` class represents a type of weapon used by monsters.
 * This class extends the `Weapon` class and adds the ability to have critical damage.
 */
public class MonsterWeapon extends Weapon{
    private int m_CriticalCountDown;
    private int s_iMaxRoundBeforeCritical;

    /**
     * Constructs a new `MonsterWeapon` with the specified attack points, critical countdown, and maximum rounds before critical.
     *
     * @param m_AttackPoints The base attack points of the weapon.
     * @param m_CriticalCountDown The countdown until the weapon can deal critical damage.
     * @param s_iMaxRoundBeforeCritical The maximum rounds before the weapon can deal critical damage.
     */
    public MonsterWeapon(int m_AttackPoints, int m_CriticalCountDown, int s_iMaxRoundBeforeCritical) {
        super(m_AttackPoints);
        this.m_CriticalCountDown = m_CriticalCountDown;
        this.s_iMaxRoundBeforeCritical = s_iMaxRoundBeforeCritical;
    }

    /**
     * Get the current critical countdown value.
     *
     * @return The critical countdown value.
     */

    public int getM_CriticalCountDown() {
        return m_CriticalCountDown;
    }

    /**
     * Set the critical countdown value.
     *
     * @param m_CriticalCountDown The new critical countdown value to set.
     */


    public void setM_CriticalCountDown(int m_CriticalCountDown) {
        this.m_CriticalCountDown = m_CriticalCountDown;
    }

    /**
     * Get the maximum rounds before the weapon can deal critical damage.
     *
     * @return The maximum rounds before critical.
     */

    public int getS_iMaxRoundBeforeCritical() {
        return s_iMaxRoundBeforeCritical;
    }

    /**
     * Set the maximum rounds before the weapon can deal critical damage.
     *
     * @param s_iMaxRoundBeforeCritical The new maximum rounds value to set.
     */


    public void setS_iMaxRoundBeforeCritical(int s_iMaxRoundBeforeCritical) {
        this.s_iMaxRoundBeforeCritical = s_iMaxRoundBeforeCritical;
    }

    /**
     * Inflict damage on a character using the weapon.
     * If the critical countdown is zero, it inflicts regular damage; otherwise, it deals critical damage.
     *
     * @param character The character to inflict damage upon.
     */

    public void inflictDamage(Character character) {
        if (m_CriticalCountDown <= 0) {
            // Regular damage when not in a critical state
            int damage = getM_AttackPoints();
            character.receiveDamages(damage);
        } else {
            // Critical damage when in a critical state
            int criticalDamage = getM_AttackPoints() * 2; // Example: Double damage during critical state
            character.receiveDamages(criticalDamage);
            m_CriticalCountDown--;
        }
    }
}
