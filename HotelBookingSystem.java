/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */

public class HotelBookingSystem {

    static class Room {
        private int roomNumber;
        private String roomType;
        private String guestName;
        private int numberOfNights;

        public Room(int roomNumber, String roomType, String guestName, int numberOfNights) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.guestName = guestName;
            this.numberOfNights = numberOfNights;
        }

        public int getRoomNumber() { return roomNumber; }
        public String getRoomType() { return roomType; }
        public String getGuestName() { return guestName; }
        public int getNumberOfNights() { return numberOfNights; }

        public double calculateBookingCost() {
            return 0; // Default, overridden by subclasses
        }

        public void displayBooking() {
            System.out.println("===== HOTEL BOOKING =====");
            System.out.println("Room Type: " + roomType);
            System.out.println("Room Number: " + roomNumber);
            System.out.println("Guest: " + guestName);
            System.out.println("Nights: " + numberOfNights);
            System.out.println("Booking Cost: ₱" + calculateBookingCost());
            System.out.println();
        }
    }

    static class StandardRoom extends Room {
        public StandardRoom(int roomNumber, String guestName, int numberOfNights) {
            super(roomNumber, "Standard", guestName, numberOfNights);
        }

        @Override
        public double calculateBookingCost() {
            return getNumberOfNights() * 1500;
        }
    }

    static class DeluxeRoom extends Room {
        public DeluxeRoom(int roomNumber, String guestName, int numberOfNights) {
            super(roomNumber, "Deluxe", guestName, numberOfNights);
        }

        @Override
        public double calculateBookingCost() {
            return (getNumberOfNights() * 2500) + (getNumberOfNights() * 300); // with breakfast fee
        }
    }

    static class SuiteRoom extends Room {
        public SuiteRoom(int roomNumber, String guestName, int numberOfNights) {
            super(roomNumber, "Suite", guestName, numberOfNights);
        }

        @Override
        public double calculateBookingCost() {
            return (getNumberOfNights() * 4000) + 1000; // with service fee
        }
    }
}
