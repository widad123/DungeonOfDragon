/**
 * The Room class represents a room in the game where a monster may be encountered.
 */
public class Room {
    
    /** The number of the room. */
    private static int numRoom = 0;

    /** The monster that may be present in the room. */
    private Monster monster ;
    
    /**
     * Constructs a room and initializes it with a room number and a potentially encountered monster.
     */
    
    public Room() {
     System.out.format("++++++++++++++++++++++++++++ Vous êtes dans la Pièce N° : %d +++++++++++++++++++++++++++++++++%n",numRoom);
     monster = new Monster(numRoom);
        numRoom++;
    }

        /**
     * Retrieves the monster that may be present in the room.
     *
     * @return The monster in the room, which may be null if no monster is present.
     */
    
    public Monster getMonster() {
        return monster;
    }

}
