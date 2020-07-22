import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
    bedroom = new Bedroom(101, 1, "Single");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(101, bedroom.getNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }
    @Test
    public void hasType(){
        assertEquals("Single", bedroom.getType());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, bedroom.guestCount());
    }

}