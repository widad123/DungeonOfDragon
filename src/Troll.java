/**
 * The Troll class represents a type of monster known as a "Troll" in the game.
 */
public class Troll extends Monster {

        /**
     * Constructs a Troll monster.
     */
    
    public Troll() {
        super();
        s_iNbTrollInstances++;
        this.label = "Troll";
        m_sEffectiveWeaponType = "Spear";
        System.out.format("Le type de monstre est %s le nombre de %s est : %d l'arme qui lui fait des dégats à ce monstre est %s %n",this.label,this.label,s_iNbTrollInstances, m_sEffectiveWeaponType);
    }


}
