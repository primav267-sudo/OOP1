/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */
public class HotelBookingSystemTest {
    public static void main(String[] args) {
        
        HotelBookingSystem.Room[] rooms = {
            new HotelBookingSystem.StandardRoom(101, "Pedro Cruz", 3),
            new HotelBookingSystem.DeluxeRoom(202, "Ana Reyes", 2),
            new HotelBookingSystem.SuiteRoom(301, "Carlo Santos", 2)
        };

        for (HotelBookingSystem.Room room : rooms) {
            room.displayBooking();
        }
    }
}
