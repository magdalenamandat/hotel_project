package RoomTest;

import Hotel.Guest;
import Hotel.Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConerenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;


    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(30, "North", 100);
        guest = new Guest("Stanley");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(30, conferenceRoom.getCapacity(), 1 );
    }

    @Test
    public void canGetName(){
        assertEquals("North", conferenceRoom.getName());
    }
}
