import java.util.Scanner;

public class Hero {

        private int m_iStrength;

    public Hero(int m_iStrength) {
        this.m_iStrength = m_iStrength;
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
        public void setStrength(int p_iStrength){
        this.m_iStrength= p_iStrength;
        }
    }



