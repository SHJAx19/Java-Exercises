public class RoomsInHotel {

    public static void main(String[] args) {

        boolean[] Hotel = new boolean[12];
        OccupiedRooms(Hotel);
        print(Hotel);
    }

    public static void OccupiedRooms(boolean[] Hotel) {
        for (int i = 0; i < Hotel.length; i++) {
            if (i % 2 == 0) {
                Hotel[i] = true;
            }
        }

    }

    public static void print(boolean[] Hotel) {
        for (int i = 0; i < Hotel.length; i++) {
            System.out.println("Room [" + i + "] : " + Hotel[i]);
        }
    }
}
