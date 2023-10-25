public class Monster {
    public String m_sEffectiveWeaponType;
    public static  int s_iNbZombieInstances = 1;
    public  static int s_iNbThiefInstances = 1;
    public  static int s_iNbSorcerInstances =1;
    public static int s_iNbBarbarianInstances =1;
    public  static int s_iNbTrollInstances =1;
    private boolean m_bSearchDone;
    public String label;

    /***
     * Constructeur sans variable
     */
    public Monster(){}

    /***
     * Constructeur qui prend le numero de la chambre en paramètre
     * @param nbRoom
     *
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

    /***
     * Fonction qui vérifier si le nombre en paramètre est premier
     * @param nombre entier
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

    /***
     * getter pour récuperer la valeur de m_sEffectiveWeaponType
     */

    public String getEffectiveWeaponType(){
        return m_sEffectiveWeaponType;
    }


    public void attack(Character p_TargetCharacter){

    }

    //public boolean isWeaponEfficient(Weapon p_Weapon){
      //  return false;
    //}
}
