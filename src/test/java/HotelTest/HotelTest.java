package HotelTest;

import Hotel.Guest;
import Hotel.Room.Bedroom;
import Hotel.Room.BedroomTypes;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.DinningRoom;
import org.junit.Before;

public class HotelTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;

    DinningRoom dinningRoom1;
    DinningRoom dinningRoom2;
    DinningRoom dinningRoom3;


    @Before
    public void before() {

        guest1 = new Guest("Magda");
        guest2 = new Guest("Jesus");
        guest3 = new Guest("Helen");
        guest4 = new Guest("Julia");

        bedroom1 = new Bedroom(2, 12, BedroomTypes.DOUBLE);
        bedroom2 = new Bedroom(1, 13, BedroomTypes.SINGLE);
        bedroom3 = new Bedroom(3, 14, BedroomTypes.TRIPLE);
        bedroom4 = new Bedroom(2, 15, BedroomTypes.DOUBLE);

        conferenceRoom1 = new ConferenceRoom(10, "South", 150);
        conferenceRoom2 = new ConferenceRoom(20, "West", 250);
        conferenceRoom3 = new ConferenceRoom(30, "East", 350);

        dinningRoom1 = new Dinning
    }
}
