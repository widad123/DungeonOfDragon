import java.util.Scanner;
public class Hero extends character {

    private int m_iStrength;
    private int lifePoints;
    private int strengthPoints;
    private boolean[] searchedRooms;
    private boolean[] searchedMonsters;

    public Hero(int m_iStrength, int lifePoints, int strengthPoints,int numRooms,int numMonsters) {
        this.m_iStrength = m_iStrength;
        this.lifePoints = lifePoints;
        this.strengthPoints = strengthPoints;
        this.searchedRooms = new boolean[numRooms + 1];
        this.searchedMonsters = new boolean[numMonsters + 1];
    }

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

    public void setStrength(int p_iStrength) {
        this.m_iStrength = p_iStrength;
    }

    public void improveHealth(int p_iValue) {
        this.lifePoints += p_iValue;
    }

    public void improveStrength(int p_iValue) {
        this.strengthPoints += p_iValue;
    }

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



