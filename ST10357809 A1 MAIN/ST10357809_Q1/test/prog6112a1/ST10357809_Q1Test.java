/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog6112a1;

import java.util.Scanner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ST10357809_Q1Test {
    
    private StudentManager studentManager;
    private Scanner scanner;

    @BeforeEach
    public void setUp() {
        studentManager = new StudentManager();
        // Normally, you would mock the scanner or provide input in another way
        scanner = new Scanner(System.in); 
    }

    @AfterEach
    public void tearDown() {
        studentManager = null;
        scanner.close();
    }

    /**
     * Test of captureStudent method, of class ST10357809_Q1.
     */
    @Test
    public void testCaptureStudent() {
        System.out.println("captureStudent");
        
        // Mocking scanner input would be ideal here
        // You'd set up inputs like the student ID, name, age, etc.
        // For demonstration purposes, I'll outline how you might proceed
        
        // Example: Uncomment below if using a different Scanner input method
       
        
        // Use the scanner to input data
        ST10357809_Q1.captureStudent(scanner, studentManager);
        
        // Assert the student was added correctly
        Student student = studentManager.findStudent("10111");
        assertNotNull(student, "Student should be added successfully");
        assertEquals("Bakang Modise", student.getName(), "Student name should match");
    }

    /**
     * Test of searchStudent method, of class ST10357809_Q1.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        
        // Add a student first
        studentManager.addStudent(new Student("10111", "Bakang Modise", 19, "bakangmodise@gmail.com", "CS"));
        
        // Mock the scanner to search for the student
        // scanner = new Scanner("10111");
        ST10357809_Q1.searchStudent(scanner, studentManager);
        
        // Capture the student
        Student student = studentManager.findStudent("10111");
        assertNotNull(student, "Student should be found successfully");
    }

    /**
     * Test of updateStudent method, of class ST10357809_Q1.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        
        // Add a student first
        studentManager.addStudent(new Student("10111", "Bakang Modise", 19, "bakangmodise@gmail.com", "CS"));
        
        // Mock the scanner to update the student
        // scanner = new Scanner("10111\nJane Doe\n21\njane.doe@example.com\nIT\n");
        ST10357809_Q1.updateStudent(scanner, studentManager);
        
        // Capture the updated student
        Student student = studentManager.findStudent("10111");
        assertNotNull(student, "Student should be found after update");
        assertEquals("Jane Doe", student.getName(), "Student name should be updated");
    }

    /**
     * Test of deleteStudent method, of class ST10357809_Q1.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        
        // Add a student first
        studentManager.addStudent(new Student("10111", "Bakang Modise", 19, "bakangmodise@gmail.com", "CS"));
        
        // Mock the scanner to delete the student
        // scanner = new Scanner("10111");
        ST10357809_Q1.deleteStudent(scanner, studentManager);
        
        // Verify the student is deleted
        Student student = studentManager.findStudent("10111");
        assertNull(student, "Student should be deleted");
    }
}
