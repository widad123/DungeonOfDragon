/**
 * The `Weapon` class represents a generic weapon that can inflict damage.
 */
public class Weapon {

        private int m_AttackPoints;

    /**
     * Constructs a new `Weapon` with the specified attack points.
     *
     * @param m_AttackPoints The attack points of the weapon.
     */

        public Weapon(int m_AttackPoints) {
            this.m_AttackPoints = m_AttackPoints;
        }

    /**
     * Get the attack points of the weapon.
     *
     * @return The attack points of the weapon.
     */

        public int getM_AttackPoints() {
            return m_AttackPoints;
        }

    /**
     * Set the attack points of the weapon.
     *
     * @param m_AttackPoints The new attack points to set.
     */

        public void setM_AttackPoints(int m_AttackPoints) {
            this.m_AttackPoints = m_AttackPoints;
        }

    /**
     * Inflict damage on a target character using the weapon.
     *
     * @param p_TargetCharacter The character to inflict damage upon.
     */

        public void inflictDamage(Character p_TargetCharacter){
            if(p_TargetCharacter!=null){
                p_TargetCharacter.receiveDamages(m_AttackPoints);
            }
        }
    }


