public class Character {

    //la force de l'arme
    protected int m_iLifePoints;
    protected Weapon m_Weapon;

    public Character(int LifePoints){
        this.m_iLifePoints= LifePoints;
    }

    public void attack(Character p_TargetCharacter){
        if (m_Weapon != null) {
            m_Weapon.inflictDamage(p_TargetCharacter);
        }
    }

    public int getNbLifePoints(){
        return m_iLifePoints;
    }

    //p_iDamages c'est le montant de dégâts que le personnage doit subir.
    public void receiveDamages(int p_iDamages){

        m_iLifePoints -= p_iDamages;

    }

    public boolean isAlive(){

        if (m_iLifePoints>0) return true;
        else return false;
    }

    public void setWeapon(Weapon weapon) {
        this.m_Weapon = weapon;
    }
}
