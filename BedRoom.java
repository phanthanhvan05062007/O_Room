
package Room;
import java.util.Scanner;
public class BedRoom extends Room {
   
    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(String id, String name, double baseCost, int numberOfBeds) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
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
        System.out.print("Enter Number of Beds: ");
        numberOfBeds = sc.nextInt();
    }

    @Override
    public void updateRoom() {
        addRoom();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number Of Beds: " + numberOfBeds);
    }
}

