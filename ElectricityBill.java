/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */
public class ElectricityBill {
    
    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    public ElectricityBill(String accountNumber, String customerName, String customerType,
                           double previousReading, double currentReading) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    public double getRate() {
        double consumption = calculateConsumption();
        double rate = 0;

        if (customerType.equalsIgnoreCase("Residential")) {
            if (consumption <= 100) {
                rate = 10;
            } else if (consumption <= 200) {
                rate = 12;
            } else {
                rate = 15;
            }
        } else if (customerType.equalsIgnoreCase("Commercial")) {
            if (consumption <= 100) {
                rate = 15;
            } else if (consumption <= 200) {
                rate = 18;
            } else {
                rate = 22;
            }
        }

        return rate;
    }

    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    public String getClassification() {
        double consumption = calculateConsumption();
        if (consumption < 100) {
            return "Low Consumption";
        } else if (consumption <= 200) {
            return "Moderate Consumption";
        } else {
            return "High Consumption";
        }
    }

    public void displayBill() {
        double consumption = calculateConsumption();
        double rate = getRate();
        double totalBill = calculateBill();

        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Consumption: " + consumption + " kWh");
        System.out.println("Rate: ₱" + rate);
        System.out.println("Total Bill: ₱" + totalBill);
        System.out.println("Classification: " + getClassification());

        if (consumption > 300) {
            System.out.println("WARNING: VERY HIGH ELECTRICITY CONSUMPTION");
        }

        System.out.println();
    }
}

