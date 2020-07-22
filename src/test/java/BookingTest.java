import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;
    private Hotel hotel;

    @Before
    public void before() {
        booking = new Booking(4, bedroom);
        hotel = new Hotel();
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void hasNumberOfNightsBooked(){
        assertEquals(4, booking.getNightsBooked());
    }

    @Test
    public void canBookRoom() {
        assertEquals(booking, hotel.bookRoom(2, bedroom));
    }


}
