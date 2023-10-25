public class Room {

    private static int numRoom = 0;
    private Monster monster ;

    public Room() {
     System.out.format("++++++++++++++++++++++++++++ Vous êtes dans la Pièce N° : %d +++++++++++++++++++++++++++++++++%n",numRoom);
     monster = new Monster(numRoom);
        numRoom++;
    }

    public Monster getMonster() {
        return monster;
    }

    //public void enterRoom(Hero p_Hero){

    //}
}
