/**
 * The Character class represents a generic character in the game.
 */

public class Character {

    /** The character's remaining life points. */
    protected int m_iLifePoints;

    /** The character's equipped weapon. */
    protected Weapon m_Weapon;

    
    /**
     * Constructs a character with the specified number of life points.
     *
     * @param LifePoints The initial number of life points for the character.
     */
    
    public Character(int LifePoints){
        this.m_iLifePoints= LifePoints;
        
    }

     /**
     * Attacks another character using the equipped weapon.
     *
     * @param p_TargetCharacter The target character to attack.
     */
    
    public void attack(Character p_TargetCharacter){
        if (m_Weapon != null) {
            m_Weapon.inflictDamage(p_TargetCharacter);
        }
    }

        /**
     * Gets the current number of life points of the character.
     *
     * @return The current number of life points.
     */
    
    public int getNbLifePoints(){
        return m_iLifePoints;
    }

     /**
     * Reduces the character's life points by the specified amount of damage.
     *
     * @param p_iDamages The amount of damage the character should receive.
     */
    

    public void receiveDamages(int p_iDamages){

        m_iLifePoints -= p_iDamages;

    }

        /**
     * Checks if the character is alive based on their remaining life points.
     *
     * @return True if the character is alive, false otherwise.
     */
    
    public boolean isAlive(){

        if (m_iLifePoints>0) return true;
        else return false;
    }

        /**
     * Sets the character's equipped weapon.
     *
     * @param weapon The weapon to equip.
     */
    
    public void setWeapon(Weapon weapon) {
        this.m_Weapon = weapon;
    }
}
