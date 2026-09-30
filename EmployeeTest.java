/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("EMP-001", "Marla Cruz", "IT", 25, 700);
        Employee emp2 = new Employee("EMP-002", "John Dela Rosa", "Finance", 22, 650);
        Employee emp3 = new Employee("EMP-003", "Ella Santos", "HR", 18, 600);

        emp1.displayPayroll();
        emp2.displayPayroll();
        emp3.displayPayroll();
    }
}
