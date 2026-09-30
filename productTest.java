/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

/**
 *
 * @author User
 */

public class productTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product product1 = new Product("P-1001", "Wireless Mouse", "Computer Accessories", 599.99, 25);
        Product product2 = new Product("P-1002", "Gaming Keyboard", "Computer Accessories", 850.00, 25);
        Product product3 = new Product("P-1003", "USB Flash Drive", "Storage Devices", 350.00, 5);
        Product product4 = new Product("P-1004", "Laptop Stand", "Office Accessories", 1200.00, 0);

        manager.addProduct(product1);
        manager.addProduct(product2);
        manager.addProduct(product3);
        manager.addProduct(product4);

        manager.displayAllProducts();
    }
}
