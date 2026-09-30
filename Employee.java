/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */
public class Employee {
    // Private properties (Encapsulation)
    private String employeeId;
    private String name;
    private String department;
    private int daysWorked;
    private double dailyRate;

    public Employee(String employeeId, String name, String department, int daysWorked, double dailyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    public double calculateRegularPay() {
        int regularDays = Math.min(daysWorked, 22);
        return regularDays * dailyRate;
    }

    public double calculateOvertimePay() {
        int overtimeDays = Math.max(daysWorked - 22, 0);
        double overtimeRate = dailyRate * 1.25;
        return overtimeDays * overtimeRate;
    }

    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }

    public double calculateDeduction() {
        double grossPay = calculateGrossPay();
        if (grossPay <= 15000) {
            return grossPay * 0.05;
        } else {
            return grossPay * 0.08;
        }
    }

    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeduction();
    }

    public String getAttendanceClassification() {
        if (daysWorked > 22) {
            return "Overtime Worker";
        } else if (daysWorked == 22) {
            return "Regular Worker";
        } else {
            return "Underworked Employee";
        }
    }

    public void displayPayroll() {
        System.out.println("===== EMPLOYEE PAYROLL =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Daily Rate: ₱" + dailyRate);
        System.out.println();
        System.out.println("Regular Pay: ₱" + calculateRegularPay());
        System.out.println("Overtime Pay: ₱" + calculateOvertimePay());
        System.out.println("Gross Pay: ₱" + calculateGrossPay());
        System.out.println("Deduction: ₱" + calculateDeduction());
        System.out.println("Net Pay: ₱" + calculateNetPay());
        System.out.println("Classification: " + getAttendanceClassification());
        System.out.println();
    }
}

