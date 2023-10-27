/**
 * The Barbarian class represents a specific type of monster, Barbarian, which inherits from the Monster class.
 */

public class Barbarian extends Monster {
 /**
     * Default constructor for the Barbarian class. It initializes the properties of the Barbarian.
     */
    
    public Barbarian() {

        /**
        *Calls the constructor of the parent class Monster.
        */
        
        super();
        
    /**
         *   Increments the instance count of Barbarians.
         */
        
        s_iNbBarbarianInstances++;

     /**
         *   Sets the label for the Barbarian..
         */
        
        this.label = "Barbarian";
    /**
         *   Sets the type of weapon effective against this monster.
         */
        
        m_sEffectiveWeaponType = "FireArrow";
            /**
         *   Displays information about the Barbarian monster.
         */
         
        System.out.format("Le type de monstre est %s le nombre de %s est : %d l'arme qui lui fait des dégats à ce monstre est %s %n",this.label,this.label,s_iNbTrollInstances, m_sEffectiveWeaponType);
    }
}

