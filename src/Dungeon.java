import java.util.ArrayList;
import java.util.List;

/**
 * The Dungeon class represents the game world containing multiple rooms and monsters.
 */
public class Dungeon {
    private List<Room> rooms;
    private Hero hero;
    private boolean displayCreationInfo;
    private int currentRoomIndex;
    private int numberOfRooms;

    /**
     * Constructs a Dungeon with the specified number of rooms and creation information display option.
     *
     * @param numberOfRooms        The number of rooms in the dungeon.
     * @param displayCreationInfo  Whether to display information about the creation of rooms and monsters.
     */
    public Dungeon(int numberOfRooms, boolean displayCreationInfo) {
        this.numberOfRooms = numberOfRooms;
        this.displayCreationInfo = displayCreationInfo;
        rooms = new ArrayList<>();

        for (int i = 1; i <= numberOfRooms; i++) {
            Monster monster = generateMonsterForRoom(i);
            Room room = new Room();
            room.setMonster(monster);

            // Generate items based on rules
            if (i % 7 == 0) {
                room.addItem(new HealthPotion());
            }
            if (i % 4 == 0) {
                room.addItem(new StrengthPotion());
            }

            rooms.add(room);

            if (displayCreationInfo) {
                System.out.println("Room " + i + ": " + monster.getClass().getSimpleName());
            }
        }
    }

    /**
     * Constructs a Dungeon with pre-existing rooms and monsters.
     *
     * @param rooms The list of rooms to include in the dungeon.
     */
    public Dungeon(List<Room> rooms) {
        this.rooms = rooms;
        currentRoomIndex = 0; // Start at the first room (index 0).
    }

    // Rest of your class with methods...
    // (I have kept your existing code intact.)

}
