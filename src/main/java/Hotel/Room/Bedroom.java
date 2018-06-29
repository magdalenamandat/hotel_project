package Hotel.Room;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private BedroomTypes type;

    public Bedroom(int capacity, int roomNumber, BedroomTypes type) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.type = type;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public BedroomTypes getType() {
        return type;
    }

    public int getPrice() {
        return this.type.getValue();
    }


}
