public class Thief extends Monster {

    public Thief() {
        super();
        s_iNbThiefInstances++;
        this.label = "Thief";
        m_sEffectiveWeaponType = "Arrow";
        System.out.format("Le type de monstre est %s le nombre de %s est : %d l'arme qui lui fait des dégats à ce monstre est %s %n",this.label,this.label,s_iNbTrollInstances, m_sEffectiveWeaponType);

    }
}
