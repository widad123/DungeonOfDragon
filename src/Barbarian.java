public class Barbarian extends Monster {

    public Barbarian() {
        super();
        s_iNbBarbarianInstances++;
        this.label = "Barbarian";
        m_sEffectiveWeaponType = "FireArrow";
        System.out.format("Le type de monstre est %s le nombre de %s est : %d l'arme qui lui fait des dégats à ce monstre est %s %n",this.label,this.label,s_iNbTrollInstances, m_sEffectiveWeaponType);
    }
}

