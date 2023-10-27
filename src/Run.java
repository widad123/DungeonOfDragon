import java.util.Scanner;

/**
 * The Run class contains the main method to run the game.
 */

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      /**
         * Read the number of rooms from the user input.
        */
        int nbRoom = scan.nextInt();
        int i =0;
        do{
      /**
        *Create a new dungeon with 6 rooms.
       */
            
            Dungeon d1 = new Dungeon(6);
            i++;
        }while( nbRoom >= i);

    }
}

