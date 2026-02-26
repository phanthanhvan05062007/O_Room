
package Room;
import java.util.Scanner;
public class MeetingRoom extends Room {
    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void addRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter Name: ");
        setName(sc.nextLine());
        System.out.print("Enter Base Cost: ");
        setBaseCost(sc.nextDouble());
        System.out.print("Enter Capacity: ");
        capacity = sc.nextInt();
    }

    @Override
    public void updateRoom() {
        addRoom();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}

