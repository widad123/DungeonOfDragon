/**
 * The Dungeon class represents a dungeon in a game, consisting of multiple rooms.
 */

public class Dungeon {

        /** An array of rooms in the dungeon. */
    
    private Room [] roomArray;

        /**
     * Constructs a dungeon with the specified number of rooms.
     *
     * @param nbRoom The number of rooms in the dungeon.
     */
    
    public Dungeon(int nbRoom) {
        this.roomArray = new Room[nbRoom];
        for (int i = 1; i < roomArray.length; i++){
            roomArray[i] = new Room();
            break;
        }
    }

        /**
     * Retrieves a specific room within the dungeon based on its index.
     *
     * @param p_iRoomIndex The index of the room to retrieve.
     * @return The room at the specified index.
     */
    
    public Room getRoom(int p_iRoomIndex){
        return this.roomArray[p_iRoomIndex];
    }



}
