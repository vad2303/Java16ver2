package Sets;

import java.util.HashSet;
import java.util.Scanner;
import models.Student;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("Select option:");
                System.out.println("1. Add a student");
                System.out.println("2. Update a student");
                System.out.println("3. Delete a student");
                System.out.println("4. Display all students");
                System.out.println("0. Exit");

                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter student information:");
                        Student newStudent = new Student();
                        newStudent.inputInfo();
                        studentSet.add(newStudent);
                        break;
                    case 2:
                        System.out.println("Enter the full name of the student to update:");
                        String fullName = scanner.nextLine();
                        boolean isFound = false;
                        for (Student student : studentSet) {
                            if (student.getFullName().equals(fullName)) {
                                System.out.println("Enter updated information:");
                                student.inputInfo();
                                isFound = true;
                                break;
                            }
                        }
                        if (!isFound) {
                            System.out.println("Student not found");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the full name of the student to delete:");
                        fullName = scanner.nextLine();
                        isFound = false;
                        for (Student student : studentSet) {
                            if (student.getFullName().equals(fullName)) {
                                studentSet.remove(student);
                                System.out.println("Student deleted");
                                isFound = true;
                                break;
                            }
                        }
                        if (!isFound) {
                            System.out.println("Student not found");
                        }
                        break;
                    case 4:
                        System.out.println("List of students:");
                        for (Student student : studentSet) {
                            student.showInfo();
                        }
                        break;
                    case 0:
                        System.out.println("Exiting program");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } while (choice != 0);
        }
    }
}