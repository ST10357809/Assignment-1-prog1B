/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog6112a1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    
    private Student student;

    @BeforeEach
    public void setUp() {
        // Initialize a Student object before each test
        student = new Student("10111", "John Doe", 19, "john.doe@example.com", "CS");
    }

    @AfterEach
    public void tearDown() {
        // Clean up after each test
        student = null;
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "10111";
        String result = student.getId();
        assertEquals(expResult, result, "The ID should match the expected value.");
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "20222";
        student.setId(id);
        assertEquals(id, student.getId(), "The ID should be updated correctly.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "John Doe";
        String result = student.getName();
        assertEquals(expResult, result, "The name should match the expected value.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Jane Doe";
        student.setName(name);
        assertEquals(name, student.getName(), "The name should be updated correctly.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 19;
        int result = student.getAge();
        assertEquals(expResult, result, "The age should match the expected value.");
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 21;
        student.setAge(age);
        assertEquals(age, student.getAge(), "The age should be updated correctly.");
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "john.doe@example.com";
        String result = student.getEmail();
        assertEquals(expResult, result, "The email should match the expected value.");
    }

    /**
     * Test of setEmail method, of class Student.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "jane.doe@example.com";
        student.setEmail(email);
        assertEquals(email, student.getEmail(), "The email should be updated correctly.");
    }

    /**
     * Test of getCourse method, of class Student.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        String expResult = "CS";
        String result = student.getCourse();
        assertEquals(expResult, result, "The course should match the expected value.");
    }

    /**
     * Test of setCourse method, of class Student.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        String course = "IT";
        student.setCourse(course);
        assertEquals(course, student.getCourse(), "The course should be updated correctly.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Student{id=10111, name=John Doe, age=19, email=john.doe@example.com, course=CS}";
        String result = student.toString();
        assertEquals(expResult, result, "The toString method should return the correct format.");
    }
}
