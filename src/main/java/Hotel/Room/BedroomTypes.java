package Hotel.Room;

public enum BedroomTypes {
        SINGLE(45),
        DOUBLE(60),
        TRIPLE(80);

        private final int value;

        BedroomTypes(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

