package Hotel;

import Hotel.Room.Bedroom;
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

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public void removeRoom(Room room) {
         this.rooms.remove(1);
    }

    public void checkInGuest(Guest guest, Room room){
      room.addGuest(guest);
    }

    public void checkOut(Room room) {
        room.removeAllGuest();
    }
}
