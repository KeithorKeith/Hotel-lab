import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
    }

    public int getNumber(){
        return roomNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getType(){
        return type;
    }

    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public Guest removeGuest() {
        return this.guests.remove(0);
    }

}
