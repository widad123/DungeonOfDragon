import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nbRoom = scan.nextInt();
        int i =0;
        do{
            Dungeon d1 = new Dungeon(6);
            i++;
        }while( nbRoom >= i);

    }
}

