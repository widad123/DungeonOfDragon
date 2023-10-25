public class Weapon {

        private int m_AttackPoints;

        public Weapon(int m_AttackPoints) {
            this.m_AttackPoints = m_AttackPoints;
        }

        public int getM_AttackPoints() {
            return m_AttackPoints;
        }

        public void setM_AttackPoints(int m_AttackPoints) {
            this.m_AttackPoints = m_AttackPoints;
        }
        public void inflictDamage(Character p_TargetCharacter){
            if(p_TargetCharacter!=null){
                p_TargetCharacter.receiveDamages(m_AttackPoints);
            }
        }
    }


