/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog6112a1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author modis
 */
public class StudentManagerTest {
    
    public StudentManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = new Student("10111", "B.Modise", 19, "bakangmodise@gmail.com", "disd");
        instance.addStudent(student);
        
        // Verify that the student was added
        Student result = instance.findStudent("10111");
        assertNotNull(result, "Student should be added successfully");
        assertEquals("B.Modise", result.getName(), "Student name should match");
    }

    @Test
    public void testFindStudent() {
        System.out.println("findStudent");
        Student student = new Student("10111", "B.Modise", 19, "bakang", "disd");
        instance.addStudent(student);
        
        Student result = instance.findStudent("10111");
        assertNotNull(result, "Student should be found");
        assertEquals("10111", result.getId(), "Student ID should match");
        assertEquals("B.Modise", result.getName(), "Student name should match");
    }

    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Student student = new Student("10111", "B.Modise", 19, "bakangmodise@gmail.com", "disd");
        instance.addStudent(student);
        
        boolean result = instance.deleteStudent("10111");
        assertTrue(result, "Student should be deleted successfully");
        
        // Verify that the student is no longer in the system
        Student deletedStudent = instance.findStudent("10111");
        assertNull(deletedStudent, "Student should not be found after deletion");
    }

    @Test
    public void testDisplayAllStudents() {
        System.out.println("displayAllStudents");
        instance.addStudent(new Student("10111", "B.Modise", 19, "bakangmodise@gmail.com", "disd"));
        instance.addStudent(new Student("10112", "B.Modise", 21, "bakangmodise@gmail.com", "disd"));
        
        instance.displayAllStudents();
        
    }

    public static class instance {

        public static void addStudent(Student student) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public static void displayAllStudents() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public static boolean deleteStudent(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public static Student findStudent(String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public instance() {
        }
    }
    
}
