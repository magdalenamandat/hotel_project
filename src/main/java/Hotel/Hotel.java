package Hotel;

import Hotel.Room.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(){
        this.rooms = new ArrayList<>();
    }

    public int countBedrooms() {
       return this.rooms.size();
    }
}
