import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("Dragon's Dungeon", 10);
    }


    @Test
    public void hasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName() {
        assertEquals("Dragon's Dungeon", conferenceRoom.getName());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }
}
