import java.util.Scanner;

    /**
 * The Hero class represents a character in the game, the main protagonist.
 */

public class Hero  {
    
    /** The strength attribute of the hero. */
    private int m_iStrength;

    /** The current life points of the hero. */
    private int lifePoints;

    /** The strength points of the hero. */
    private int strengthPoints;

     /** An array to keep track of discovered rooms. */
    private boolean[] searchedRooms;

     /** An array to keep track of discovered rooms. */
    private boolean[] searchedMonsters;
    
        /**
     * Constructs a hero with the specified attributes.
     *
     * @param m_iStrength The strength attribute of the hero.
     * @param lifePoints The initial life points of the hero.
     * @param strengthPoints The initial strength points of the hero.
     * @param numRooms The number of rooms in the game.
     * @param numMonsters The number of different types of monsters in the game.
     */
    
    public Hero(int m_iStrength, int lifePoints, int strengthPoints,int numRooms,int numMonsters) {
        this.m_iStrength = m_iStrength;
        this.lifePoints = lifePoints;
        this.strengthPoints = strengthPoints;
        this.searchedRooms = new boolean[numRooms + 1];
        this.searchedMonsters = new boolean[numMonsters + 1];
    }

        /**
     * Allows the hero to select a weapon from a predefined list.
     *
     * @param p_sWeaponClassName The name of the weapon to be selected.
     */
    
    public void selectWeaponFromArslan(String p_sWeaponClassName) {
        String[] Arslan = {"Arrow", "WaterFlask", "Sword", "Spear", "FireArrow"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tapez le nom de l'arme : ");
        String userInput = scanner.nextLine();

        boolean weaponFound = false;

        for (String weapon : Arslan) {
            if (weapon.equalsIgnoreCase(userInput)) {
                weaponFound = true;
                break;
            }
        }

        if (weaponFound) {
            System.out.println("Vous avez trouvé l'arme " + userInput + "!");
        } else {
            System.out.println("L'arme " + userInput + " n'a pas été trouvée dans le tableau Arslan.");
        }
    }

    /**
     * Simulates discovering and encountering different types of monsters in rooms.
     *
     * @param p_Monster The monster to be encountered.
     */
    
    public void discoverEnemy(Monster p_Monster) {
        String[] monsterNames = {"Troll", "Thief","Sorcerer","Zombie","Barbarian"};

        for (int i = 0; i < monsterNames.length; i++) {
            System.out.println("room" + i + ": " + monsterNames[i]);
        }

        for (int currentRoom = 0; currentRoom < monsterNames.length; currentRoom++) {
            System.out.println("You will find a " + monsterNames[currentRoom]);
            p_Monster.setType(monsterNames[currentRoom]);

            // Simulation d'une attaque entre le héros et le monstre
            attack(p_Monster);
        }
    }

            /**
     * Sets the strength attribute of the hero.
     *
     * @param p_iStrength The new strength value for the hero.
     */

    
    public void setStrength(int p_iStrength) {
        this.m_iStrength = p_iStrength;
    }
    
        /**
     * Sets the strength attribute of the hero.
     *
     * @param p_iStrength The new strength value for the hero.
     */
    
    public void improveHealth(int p_iValue) {
        this.lifePoints += p_iValue;
    }

   /**
     * Improves the strength attribute of the hero by a specified value.
     *
     * @param p_iValue The amount by which the strength attribute is improved.
     */
    
    public void improveStrength(int p_iValue) {
        this.strengthPoints = p_iValue;
    }

        /**
     * Searches for potions in a room and on a defeated monster, and improves the hero's attributes accordingly.
     *
     * @param roomNumber The room number in which the hero is searching for potions.
     * @param monsterNumber The number of the defeated monster on which the hero is searching for potions.
     */
    
    public void searchForPotion(int roomNumber, int monsterNumber) {
        if (searchedRooms[roomNumber]) {
            System.out.println("Sorry, you have already found everything in this room");
            return;
        }

        searchedRooms[roomNumber] = true;

        if (roomNumber % 7 == 0 && roomNumber % 4 == 0) {
            System.out.println("Congrats, you found a HealthPotion");
            improveHealth(10);
            System.out.println("Congrats, you found a StrengthPotion");
            improveStrength(20);
        } else if (roomNumber % 7 == 0) {
            System.out.println("Congrats, you found a HealthPotion");
            improveHealth(10);
        } else if (roomNumber % 4 == 0) {
            System.out.println("Congrats, you found a StrengthPotion");
            improveStrength(20);
        }

        if (searchedMonsters[monsterNumber]) {
            System.out.println("Sorry, you have already found everything on this corpse");
            return;
        }

        searchedMonsters[monsterNumber] = true;

        if (monsterNumber % 2 == 0) {
            System.out.println("Barbarian has a HealthPotion");
            improveHealth(10);
        } else if (monsterNumber % 3 == 0) {
            System.out.println("Sorcerer has a HealthPotion");
            improveHealth(10);
        } else if (monsterNumber % 5 == 1) {
            System.out.println("Zombie has a StrengthPotion");
            improveStrength(20);
        } else if (monsterNumber % 4 == 3) {
            System.out.println("Troll has a StrengthPotion");
            improveStrength(20);
        } else if (monsterNumber % 6 == 1) {
            System.out.println("Thief has a HealthPotion");
            improveHealth(10);
        } else {
            System.out.println("Sorry, no potion found on the monster");
        }
    }
}



