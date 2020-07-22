import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private Guest guest1;
    private Guest guest2;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;

    @Before
    public void before() {
        bedroom1 = new Bedroom(101, 2, "Double");
        bedroom2 = new Bedroom(202, 1, "Single");
        bedroom3 = new Bedroom(303, 2, "Double");

        conferenceRoom1 = new ConferenceRoom("Dragon's Dungeon", 10);
        conferenceRoom2 = new ConferenceRoom("Goblin's Cove", 20);

        guest1 = new Guest("Steve");
        guest2 = new Guest("Alex");

        hotel = new Hotel();
    }

    @Test
    public void canAddRoomsToHotel(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        assertEquals(5, hotel.roomCount());
    }

    @Test
    public void canAddGuestsToRoom() {
        hotel.checkIn(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckGuestsOut() {
        hotel.checkIn(guest1, bedroom1);
        hotel.checkOut(guest1, bedroom1);
        assertEquals(0, bedroom1.guestCount());
    }
}
