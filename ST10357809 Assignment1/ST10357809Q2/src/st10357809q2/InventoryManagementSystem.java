/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10357809q2;


// Student class representing Samsungs
class Product {
    public String nme;
    public double prce;
    public int quan;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.nme = name;
        this.prce = price;
        this.quan = quantity;
    }

    // Getter methods
    public String getName() {
        return nme;
    }

    public double getPrice() {
        return prce;
    }

    public int getQuantity() {
        return quan;
    }

   /*Code attribution
This code was adapted from stackoverflow
https://stackoverflow.com/questions/2390063/what-does-public-static-void-mean-in-java
By Bill the Lizard 17 September 2017*/
    public void updateQuantity(int quantity) {
        this.quan += quantity;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Name: " + nme + ", Price: $" + prce + ", Quantity: " + quan);
    }
}

// Student class representing an Inventory
class Inventory {
    private Product[] products;
    private int count;

    // Constructor
    public Inventory(int size) {
        products = new Product[size];
        count = 0;
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        if (count < products.length) {
            products[count] = product;
            count++;
        } else {
            System.out.println("Inventory is full!");
        }
    }

    // Method to update the quantity of an existing product
    public void updateProduct(String name, int quantity) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                products[i].updateQuantity(quantity);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // Method to remove a product from the inventory
    public void removeProduct(String name) {
        for (int i = 0; i < count; i++) {
            if (products[i].getName().equalsIgnoreCase(name)) {
                products[i] = products[count - 1];
                count--;
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // Solution to show the inventory for report
    public void displayInventory() {
        System.out.println("Inventory Report:");
        for (int i = 0; i < count; i++) {
            products[i].displayProduct();
        }
    }
}

// Main class to run the application
public class InventoryManagementSystem {
    public static void main(String[] args) {
        // Create an inventory
        Inventory inventory = new Inventory(10);

        // Add products
        inventory.addProduct(new Product("Samsung", 0.99, 50));
        inventory.addProduct(new Product("Iphone", 999.99, 10));

        // Display inventory
        inventory.displayInventory();

        // Update product quantity
        inventory.updateProduct("Samsung", 25);

        // Remove a product
        inventory.removeProduct("Iphone");

        // Display inventory after updates
        inventory.displayInventory();
    }
}
