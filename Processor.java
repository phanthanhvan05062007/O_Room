
package Room;
import java.util.Scanner;
public class Processor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();
        int choice;

        do {
            System.out.println("1. Add Meeting Room");
            System.out.println("2. Add Bed Room");
            System.out.println("3. Update Room by ID");
            System.out.println("4. Delete Room by ID");
            System.out.println("5. Find Room by ID");
            System.out.println("6. Display All Rooms");
            System.out.println("7. Count Rooms");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    MeetingRoom mr = new MeetingRoom();
                    mr.addRoom();
                    list.addRoom(mr);
                    break;

                case 2:
                    BedRoom br = new BedRoom();
                    br.addRoom();
                    list.addRoom(br);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String idUpdate = sc.nextLine();
                    if (!list.updateRoomById(idUpdate)) {
                        System.out.println("Room not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String idDelete = sc.nextLine();
                    if (!list.deleteRoomById(idDelete)) {
                        System.out.println("Room not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to find: ");
                    String idFind = sc.nextLine();
                    Room r = list.findRoomById(idFind);
                    if (r != null) {
                        r.displayDetails();
                    } else {
                        System.out.println("Room not found!");
                    }
                    break;

                case 6:
                    list.displayAllRooms();
                    break;

                case 7:
                    list.countRooms();
                    break;
            }

        } while (choice != 0);
    }
}

