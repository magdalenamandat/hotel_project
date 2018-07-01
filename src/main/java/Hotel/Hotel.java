package Hotel;

import Hotel.Room.Bedroom;
import Hotel.Room.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;

    public Hotel(){
        this.rooms = new ArrayList<>();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
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
        room.removeAllGuests();
    }

    public ArrayList<Room> listOfEmptyRooms() {
        ArrayList<Room> emptyRooms = new ArrayList<>();

        for (int i = 0; i < getRooms().size(); i++){
            if (getRooms().get(i).countGuests() == 0){
                emptyRooms.add(getRooms().get(i));
            }
        }

//        for (Room room : getRooms()) {
////            if (room.countGuests() == 0) {
////                emptyRooms.add(room);
////            }
////        }
           return emptyRooms;
    }

}
