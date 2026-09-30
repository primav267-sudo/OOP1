/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Prefinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Product {

    private String productId;
    private String productName;
    private String category;
    private double price;
    private int quantity;

    // Constructor
    public Product(String productId, String productName, String category, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Method to calculate inventory value
    public double calculateInventoryValue() {
        return price * quantity;
    }

    // Method to get stock status
    public String getStockStatus() {
        if (quantity == 0) {
            return "Out of Stock";
        } else if (quantity >= 1 && quantity <= 10) {
            return "Low Stock";
        } else if (quantity >= 11 && quantity <= 50) {
            return "Normal Stock";
        } else {
            return "High Stock";
        }
    }

    // Method to display product info
    public void displayProductInfo() {
        System.out.println("===== PRODUCT INFORMATION =====");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: ₱" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Inventory Value: ₱" + calculateInventoryValue());
        System.out.println("Stock Status: " + getStockStatus());
        System.out.println();
    }
}

// Inventory Manager class
class InventoryManager {
    private List<Product> products;

    public InventoryManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayAllProducts() {
        for (Product product : products) {
            product.displayProductInfo();
        }
    }
}

