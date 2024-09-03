/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package st10357809q2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the Inventory class.
 */
public class InventoryTest {
    
    private Inventory inventory;

    @BeforeAll
    public static void setUpClass() {
        // Code that runs once before all tests
    }
    
    @AfterAll
    public static void tearDownClass() {
        // Code that runs once after all tests
    }
    
    @BeforeEach
    public void setUp() {
        // Initialize inventory before each test
        inventory = new Inventory(10);
    }
    
    @AfterEach
    public void tearDown() {
        // Clean up after each test
        inventory = null;
    }

    /**
     * Test of addProduct method, of class Inventory.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        Product product = new Product("Samsung", 0.99, 50);
        inventory.addProduct(product);

        // Validate that the product was added
        assertEquals("Samsung", inventory.getProducts()[0].getName());
        assertEquals(0.99, inventory.getProducts()[0].getPrice());
        assertEquals(50, inventory.getProducts()[0].getQuantity());
    }

    /**
     * Test of updateProduct method, of class Inventory.
     */
    @Test
    public void testUpdateProduct() {
        System.out.println("updateProduct");
        Product product = new Product("Samsung", 0.99, 50);
        inventory.addProduct(product);

        // Update product quantity
        inventory.updateProduct("Samsung", 25);

        // Validate the quantity update
        assertEquals(75, inventory.getProducts()[0].getQuantity());
    }

    /**
     * Test of removeProduct method, of class Inventory.
     */
    @Test
    public void testRemoveProduct() {
        System.out.println("removeProduct");
        Product samsung = new Product("Samsung", 0.99, 50);
        Product iphone = new Product("Iphone", 999.99, 10);
        inventory.addProduct(samsung);
        inventory.addProduct(iphone);

        // Remove a product
        inventory.removeProduct("Iphone");

        // Validate the product was removed
        assertEquals(1, inventory.getCount());
        assertEquals("Samsung", inventory.getProducts()[0].getName());
    }

    /**
     * Test of displayInventory method, of class Inventory.
     */
    @Test
    public void testDisplayInventory() {
        System.out.println("displayInventory");
        Product samsung = new Product("Samsung", 0.99, 50);
        inventory.addProduct(samsung);

        // Capture the output of displayInventory
        inventory.displayInventory();

        // Since displayInventory only prints out, it's challenging to test output directly
        // But we can ensure the method runs without exceptions
        // More rigorous testing would involve capturing the System.out output (advanced topic)
        assertDoesNotThrow(() -> inventory.displayInventory());
    }
}