/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */
public class ElectricityBillTest {
    public static void main(String[] args) {
       
        ElectricityBill bill1 = new ElectricityBill("EL-1001", "Juan Santos", "Residential", 1250, 1475);
        ElectricityBill bill2 = new ElectricityBill("EL-1002", "Maria Lopez", "Commercial", 500, 750);
        ElectricityBill bill3 = new ElectricityBill("EL-1003", "Carlos Reyes", "Residential", 800, 1150);

        bill1.displayBill();
        bill2.displayBill();
        bill3.displayBill();
    }
}
