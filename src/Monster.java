/**
 * The Monster class represents a generic monster in the game.
 */
public class Monster {
    
    /** The effective weapon type of the monster. */
    public String m_sEffectiveWeaponType;
    
    /** The number of instances of Zombie monsters. */
    public static  int s_iNbZombieInstances = 1;
    
    /** The number of instances of Thief monsters. */
    public  static int s_iNbThiefInstances = 1;
    
    /** The number of instances of Sorcerer monsters. */
    public  static int s_iNbSorcerInstances =1;
    
    /** The number of instances of Barbarian monsters. */
    public static int s_iNbBarbarianInstances =1;
    
     /** The number of instances of Troll monsters. */
    public  static int s_iNbTrollInstances =1;
    
    /** A flag to track whether the monster search has been done. */
    private boolean m_bSearchDone;
    
    /** The label or name of the monster. */
    public String label;

    /** Default constructor for the Monster class. */
    public Monster(){}

    /**
     * Constructor that takes the room number as a parameter to determine the monster type.
     *
     * @param nbRoom The room number used to determine the monster type.
     */

    public Monster(int nbRoom) {
       if (nbRoom % 4 == 0){
            Thief voleur = new Thief();
       }else if (nbRoom % 3 == 0){
            Troll troll = new Troll();
        }else if (nbRoom > 3 && isPrime(nbRoom) ){
            Sorcerer sorcier = new Sorcerer();
        }else if (nbRoom % 4 == 0 && nbRoom % 3 == 0){
            Barbarian barbare = new Barbarian();
        }else{
            Zombie zombie = new Zombie();
        }
    }

    /**
     * Checks if a number is prime.
     *
     * @param number The integer to be checked for primality.
     * @return True if the number is prime; otherwise, false.
     */
    
    public boolean isPrime(int nombre){
            if (nombre <= 1) {
                return false; // Les nombres négatifs, 0 et 1 ne sont pas premiers.
            }

            for (int i = 2; i <= Math.sqrt(nombre); i++) {
                if (nombre % i == 0) {
                    return false; // Le nombre est divisible par i, donc il n'est pas premier.
                }
            }

            return true; // Si aucun diviseur n'a été trouvé, le nombre est premier
    }

    /**
     * Gets the effective weapon type of the monster.
     *
     * @return The effective weapon type of the monster.
     */
    
    public String getEffectiveWeaponType(){
        return m_sEffectiveWeaponType;
    }

    /**
     * Simulates an attack by the monster on a target character.
     *
     * @param p_TargetCharacter The character to be attacked by the monster.
     */
    public void attack(Character p_TargetCharacter){

    }

    //public boolean isWeaponEfficient(Weapon p_Weapon){
      //  return false;
    //}
}
