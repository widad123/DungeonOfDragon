public class Dungeon {

    private Room [] roomArray;

    public Dungeon(int nbRoom) {
        this.roomArray = new Room[nbRoom];
        for (int i = 1; i < roomArray.length; i++){
            roomArray[i] = new Room();
            break;
        }
    }

    public Room getRoom(int p_iRoomIndex){
        return this.roomArray[p_iRoomIndex];
    }

    //public void greetHeros(Hero p_Hero){

    //}


}
