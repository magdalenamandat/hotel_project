package HotelTest;

import Hotel.Guest;
import Hotel.Hotel;
import Hotel.Room.Bedroom;
import Hotel.Room.BedroomTypes;
import Hotel.Room.ConferenceRoom;
import Hotel.Room.DinningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    Hotel hotel;


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

        dinningRoom1 = new DinningRoom(30, "Breakfast");
        dinningRoom2 = new DinningRoom(30, "Lunch");
        dinningRoom3 = new DinningRoom(30, "Dinner");

        hotel = new Hotel();
    }

    @Test
    public void CanCountBedrooms(){
    assertEquals(0, hotel.countBedrooms());
    }


    @Test
    public void CanAddRoomToHotel(){
    hotel.addRoom(bedroom1);
    assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void CanRemoveRoomFromHotel(){
       hotel.addRoom(bedroom2);
       hotel.addRoom(bedroom3);
       hotel.removeRoom(bedroom2);
       assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest1, bedroom2);
        assertEquals(1, bedroom2.countGuests());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkInGuest(guest1, bedroom2);
        hotel.checkOut(bedroom2);
        assertEquals(0, bedroom2.countGuests());
    }

    @Test
    public void canDisplayListOfEmptyRooms(){
    hotel.checkInGuest(guest1, bedroom2);
    hotel.checkInGuest(guest3, bedroom4);
    assertEquals();
    }
}
