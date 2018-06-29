package RoomTest;

import Hotel.Guest;
import Hotel.Room.Bedroom;
import org.junit.Before;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;


    @Before
    public void before(){
        bedroom = new Bedroom(2, 10, "double");
        guest = new Guest("Magda");
    }


}
