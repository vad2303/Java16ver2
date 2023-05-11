package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import models.Student;

public class LinkedListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Student> studentList = new LinkedList<Student>();
        int n = 0;
        boolean flag = true;

        while (flag) {
            System.out.print("Enter number of students: ");
            n = sc.nextInt();
            if (n > 0) {
                flag = false;
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("\nStudent " + (i + 1) + ":");
            student.inputInfo();
            studentList.add(student);
        }

        System.out.println("\nList of students:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            studentList.get(i).showInfo();
        }

        boolean loop = true;
        while (loop) {
            System.out.println("\nChoose an action to perform:");
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Delete student");
            System.out.println("4. Display list of students");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Student newStudent = new Student();
                    newStudent.inputInfo();
                    studentList.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index of student to update: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < studentList.size()) {
                        System.out.println("\nStudent " + (index + 1) + ":");
                        studentList.get(index).showInfo();
                        Student updatedStudent = new Student();
                        updatedStudent.inputInfo();
                        studentList.set(index, updatedStudent);
                        System.out.println("Student updated successfully!");
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter index of student to delete: ");
                    int deleteIndex = sc.nextInt();
                    if (deleteIndex >= 0 && deleteIndex < studentList.size()) {
                        studentList.remove(deleteIndex);
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Invalid index. Please try again.");
                    }
                    break;
                case 4:
                    System.out.println("\nList of students:");
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println("\nStudent " + (i + 1) + ":");
                        studentList.get(i).showInfo();
                    }
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close();
    }

}