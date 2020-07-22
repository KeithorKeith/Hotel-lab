import org.junit.Before;
import org.junit.Test;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new conferenceRoom(10, "Dragon's Dungeon");
    }


    @Test
    public void hasCapacity() {
        assertEquals(10, conferenceRoom.getCapacity());
    }
}
