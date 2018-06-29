package RoomTest;

import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.BedroomTypes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(2, 10, BedroomTypes.DOUBLE);
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

    @Test
    public void canGetType(){
        assertEquals((BedroomTypes.DOUBLE), bedroom.getType());
    }

    @Test
    public void canGetPrice(){
        assertEquals(60, bedroom.getPrice(), 1);
    }

}
