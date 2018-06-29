package RoomTest;

import Hotel.Room.DinningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class DinningRoomTest {

    private DinningRoom dinningRoom;

    @Before
    public void before(){
       dinningRoom = new DinningRoom(20, "Breakfast");
    }

    @Test
    public void canGetname(){
        assertEquals(20, "Breakfast");
    }

}
