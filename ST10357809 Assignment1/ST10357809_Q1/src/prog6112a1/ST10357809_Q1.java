
package prog6112a1;

import java.util.*;

public class ST10357809_Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        
        System.out.println("""
                           STUDENT MANAGEMENT APPLICATION
                           **********************************
                           Enter (1) to launch menu or any other key to exit
                           """);
        int launch = scanner.nextInt();
        scanner.nextLine(); // Provide Student Details 
        
        if (launch == 1) {
            do {
                System.out.println("""
                               Please select one of the following menu items:
                               (1) Capture a new student.
                               (2) Search for a student.
                               (3) Update a student.
                               (4) Delete a student.
                               (5) Print student report.
                               (6) Exit Application.
                               """);
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                /*Code attribution
This code was adapted from stackoverflow
https://stackoverflow.com/guestions/19731912/basic-java-menu-with-switch-case
By Andre Evt 1 November 2013, accessed 2 September 2024
*/
                switch (option) {
                    case 1:
                        captureStudent(scanner, studentManager);
                        break;
                    case 2:
                        searchStudent(scanner, studentManager);
                        break;
                    case 3:
                        updateStudent(scanner, studentManager);
                        break;
                    case 4:
                        deleteStudent(scanner, studentManager);
                        break;
                    case 5:
                        studentManager.displayAllStudents();
                        break;
                    case 6:
                        System.out.println("Program Terminated!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nInvalid input\n");
                        break;
                }
            } while (launch == 1);
        } else {
            System.out.println("Program Terminated!");
            System.exit(0);
        }
    }
/*Code attribution
This code was adapted from stackoverflow
https://stackoverflow.com/questions/2390063/what-does-public-static-void-mean-in-java
By Bill the Lizard 17 September 2017*/
    public static void captureStudent(Scanner scanner, StudentManager studentManager) {
        System.out.print("Enter the student id: ");
        String id = scanner.nextLine();
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter the student age: ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age >= 16) {
                    validAge = true;
                } else {
                    System.out.println("You have entered an incorrect student age!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age!!!");
            }
        }

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, age, email, course);
        studentManager.addStudent(student);
        System.out.println("Student details have been saved successfully!!!");
    }

    public static void searchStudent(Scanner scanner, StudentManager studentManager) {
        System.out.print("Enter the student id to search: ");
        String id = scanner.nextLine();

        Student student = studentManager.findStudent(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    public static void updateStudent(Scanner scanner, StudentManager studentManager) {
        System.out.print("Enter the student id to update: ");
        String id = scanner.nextLine();

        Student student = studentManager.findStudent(id);
        if (student != null) {
            System.out.print("Enter the new student name (leave blank to keep unchanged): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) student.setName(name);
            
            System.out.print("Enter the new student age (leave blank to keep unchanged): ");
            String ageInput = scanner.nextLine();
            if (!ageInput.isEmpty()) {
                try {
                    int age = Integer.parseInt(ageInput);
                    if (age >= 16) {
                        student.setAge(age);
                    } else {
                        System.out.println("Invalid age, keeping the current age.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, keeping the current age.");
                }
            }

            System.out.print("Enter the new student email (leave blank to keep unchanged): ");
            String email = scanner.nextLine();
            if (!email.isEmpty()) student.setEmail(email);
            
            System.out.print("Enter the new student course (leave blank to keep unchanged): ");
            String course = scanner.nextLine();
            if (!course.isEmpty()) student.setCourse(course);
            
            System.out.println("Student details updated successfully!");
        } else {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    public static void deleteStudent(Scanner scanner, StudentManager studentManager) {
        System.out.print("Enter the student id to delete: ");
        String id = scanner.nextLine();

        if (studentManager.deleteStudent(id)) {
            System.out.println("Student with Student Id: " + id + " was deleted!");
        } else {
            System.out.println("Student with Student Id: " + id + " was not found!");
        }
    }

    static int category(int flot, Scanner num) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class Student {
    public String Id;
    public String Name;
    public int Age;
    public String Email;
    public String Course;

    public Student(String id, String name, int age, String email, String course) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
        this.Email = email;
        this.Course = course;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        this.Course = course;
    }

    @Override
    public String toString() {
        return "STUDENT ID: " + Id + "\n" +
               "STUDENT NAME: " + Name + "\n" +
               "STUDENT AGE: " + Age + "\n" +
               "STUDENT EMAIL: " + Email + "\n" +
               "STUDENT COURSE: " + Course + "\n";
    }
}
//no issues found
class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
/*www.w3schools.com. (n.d.). Java ArrayList Reference. 
 [online] Available at: https://www.w3schools.com/java/java_ref_arraylist.asp.*/
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(String id) {
        Student student = findStudent(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
