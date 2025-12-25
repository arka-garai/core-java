package com.arka._00dAbstractClassAndInterface;

class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms) {

        // Local Inner Class
        class ReservationValidator {
            //validation logic is encapsulated
            boolean validate() {

                if (guestName == null || guestName.isBlank()) {
                    System.out.println("Guest name cannot be empty!");
                    return false;
                }

                if (numOfRooms <= 0) {
                    System.out.println("Number of rooms should be positive!");
                    return false;
                }

                if (reservedRooms + numOfRooms > totalRooms) {
                    System.out.println("Not enough rooms available!");
                    return false;
                }

                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();

        if (validator.validate()) {
            reservedRooms += numOfRooms;
            System.out.println(
                    "Reservation confirmed for " + guestName +
                            " for " + numOfRooms + " room(s)."
            );
        } else {
            System.out.println("Reservation failed.");
        }
    }
}

    public class _06LocalInnerClass {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Sunshine Hotel", 10, 5);

        hotel.reserveRoom("Akshit", 5);   // ✅ success
        hotel.reserveRoom("Shubham", -1); // ❌ invalid rooms
        hotel.reserveRoom("", 1);         // ❌ empty name
    }
}
