package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guest;

    public Room(int capacity, ArrayList<Guest> guest){
        this.capacity = capacity;
        this.guest = new ArrayList<>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public ArrayList<Guest> getGuest() {
        return this.guest;
    }
}
