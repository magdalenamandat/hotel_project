package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity){
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuest() {
        return this.guest;
    }

    public void addGuest(Guest guest){
        this.guest.add(guest);
    }

    public void removeAllGuests(){
        this.guest.clear();
    }

    public int countGuests() {
      return this.guest.size();
    }
}
