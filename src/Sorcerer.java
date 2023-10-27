/**
 * The Sorcerer class represents a type of monster known as a "Sorcerer" in the game.
 */
public class Sorcerer extends Monster {

        /**
     * Constructs a Sorcerer monster.
     */
    
    public Sorcerer() {
        super();
        s_iNbSorcerInstances++;
        this.label = "Sorcerer";
        m_sEffectiveWeaponType = "WaterFlask";
        System.out.format("Le type de monstre est %s le nombre de %s est : %d l'arme qui lui fait des dégats à ce monstre est %s %n",this.label,this.label,s_iNbTrollInstances, m_sEffectiveWeaponType);


    }
}
