package university.app; // Ensure this is at the top

import university.models.Student;
import university.services.StudentManager;
import java.util.Scanner; // Fix: Capital 'S' in Scanner

public class Main {
    public static void main(String[] args) {
        // Fix: Capital 'S' in StudentManager
        StudentManager manager = new StudentManager();
        // Fix: Consistent naming (changed 'inout' to 'input')
        Scanner input = new Scanner(System.in);

        System.out.println("=== University Management System ===");
        
        while (true) {
            System.out.println("\n1. Add Student | 2. View All | 3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            input.nextLine(); // Consumes the leftover newline

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = input.nextLine();
                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();

                manager.addStudent(new Student(name, gpa));
                System.out.println("Success: Student added to the system.");

            } else if (choice == 2) {
                System.out.println("\n--- Registered Students ---");
                // Fix: Closing the print statement correctly
                for (Student s : manager.getAllStudents()) {
                    System.out.println("Name: " + s.getName() + " | GPA: " + s.getGpa());
                }
            } else {
                System.out.println("Exiting System...");
                break;
            }
        }
        input.close();
    }
}
