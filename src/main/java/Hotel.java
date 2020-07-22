import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public int roomCount(){
        return (this.bedrooms.size() + this.conferenceRooms.size());
    }

    public void checkIn(Guest guest, Bedroom bedroom){
        bedroom.addGuest(guest);
    }

    public void checkOut(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest();
    }

//    public Booking bookRoom(int, bedroom) {
//        return Booking();
//    }

}
