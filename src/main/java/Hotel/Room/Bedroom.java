package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;

    public Bedroom(int capacity, ArrayList<Guest> guest, int roomNumber) {
        super(capacity, guest);
        this.roomNumber = roomNumber;
    }
}
