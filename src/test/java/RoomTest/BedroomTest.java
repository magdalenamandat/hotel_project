package RoomTest;

import Hotel.Guest;
import Hotel.Room.Bedroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(2, 10, "double");
        guest = new Guest("Magda");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(10, bedroom.getRoomNumber());
    }

}
