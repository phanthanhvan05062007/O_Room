
package Room;
import java.util.ArrayList;
public class RoomList {
    
    private ArrayList<Room> roomList;

    public RoomList() {
        roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public Room findRoomById(String id) {
        for (Room r : roomList) {
            if (r.getId().equalsIgnoreCase(id)) {
                return r;
            }
        }
        return null;
    }

    public boolean updateRoomById(String id) {
        Room r = findRoomById(id);
        if (r != null) {
            r.updateRoom();
            return true;
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        Room r = findRoomById(id);
        if (r != null) {
            roomList.remove(r);
            return true;
        }
        return false;
    }

    public void displayAllRooms() {
        for (Room r : roomList) {
            r.displayDetails();
            System.out.println("----------------");
        }
    }

    public void countRooms() {
        int meeting = 0;
        int bed = 0;

        for (Room r : roomList) {
            if (r instanceof MeetingRoom) {
                meeting++;
            } else if (r instanceof BedRoom) {
                bed++;
            }
        }

        System.out.println("Total Meeting Rooms: " + meeting);
        System.out.println("Total Bed Rooms: " + bed);
    }
}

