import java.util.Random;
import java.util.Scanner;

public class BookingHotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many floor does hotel have?");
        int floorSize = sc.nextInt();
        System.out.println("How Many rooms per floor does hotel have?");
        int roomSize = sc.nextInt();

        int[][] hotel = new int[floorSize][roomSize];

        fullOrFree(hotel);

        System.out.println("\nEnter the a floor number (1-" + hotel.length +
                ") to see its rooms's condition:");
        int floorNo = sc.nextInt() - 1;

        System.out.println("Rooms on floor [" + (floorNo + 1) + "] :");

        for (int i = 0; i < hotel[floorNo].length; i++) {
            if (hotel[floorNo][i] == 0) {
                System.out.println("Room  [" + (i + 1) + "]  is Free");
            } else {
                System.out.println("Room  [" + (i + 1) + "]  is Full");
            }
        }
        System.out.print("\nEnter a room number to book (1-" + hotel[floorNo].length + "): ");
        int roomNumber = sc.nextInt() - 1;
        bookAroom(hotel, floorNo, roomNumber);

    }

    public static void fullOrFree(int[][] floorPlan) {

        Random r = new Random();
        System.out.println("-------------------------------------------");
        System.out.println("**Reminder: \nX stands for Occupied room ");
        System.out.println("O stands for free room");
        System.out.println("-------------------------------------------");
        System.out.println("Hotel's Current Floor Plan :\n");

        for (int i = 0; i < floorPlan.length; i++) {
            System.out.print("\nFloor " + (i + 1) + " :");
            for (int j = 0; j < floorPlan[i].length; j++) {

                floorPlan[i][j] = r.nextInt(1 + 1);
                if (floorPlan[i][j] == 0) {
                    System.out.print("[O]  ");
                } else {
                    System.out.print("[X]  ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void bookAroom(int[][] hotel, int floorNumber, int roomNo) {
        Scanner sc = new Scanner(System.in);
        if (hotel[floorNumber][roomNo] == 0) {
            hotel[floorNumber][roomNo] = 1;
            System.out.println("The room [" + (roomNo + 1) +
                    "]  on floor  [" + (floorNumber + 1) + "]  has been booked.");
            printAfterBooking(hotel);
        } else {
            System.out.println("This room is already occupied.");
        }

    }

    public static void printAfterBooking(int[][] afterBooking) {
        System.out.println("Hotel's Floor Plan now after booking :");
        for (int i = 0; i < afterBooking.length; i++) {
            System.out.print("\nFloor " + (i + 1) + " :");
            for (int j = 0; j < afterBooking[i].length; j++) {
                if (afterBooking[i][j] == 0) {
                    System.out.print("[O]  ");
                } else {
                    System.out.print("[X]  ");
                }
            }
            System.out.println();

        }

    }

}