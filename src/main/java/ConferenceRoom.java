import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> collection;

    public ConferenceRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.name;
    }

    public int guestCount() {
        return this.collection.size();
    }

}
