/**
 * The Zombie class represents a type of monster known as a "Zombie" in the game.
 */
public class Zombie extends Monster {

        /**
     * Constructs a Zombie monster.
     */
    
    public Zombie() {
        super();
        s_iNbZombieInstances++;
        this.label = "Zombie";
        m_sEffectiveWeaponType = "Sword";
        System.out.format("Le type de monstre est %s le nombre de %s est : %d l'arme qui lui fait des dégats à ce monstre est %s %n",this.label,this.label,s_iNbTrollInstances, m_sEffectiveWeaponType);


    }
}
