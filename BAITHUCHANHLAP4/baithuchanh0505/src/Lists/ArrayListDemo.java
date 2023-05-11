package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import models.Student;

public class ArrayListDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Student> students = new ArrayList<>();

            System.out.println("Nhap so luong sinh vien:");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
                Student student = new Student();
                student.inputInfo();
                students.add(student);
            }

            System.out.println("\nDanh sach sinh vien:");
            for (Student student : students) {
                student.showInfo();
            }

            System.out.println("\nChon mot trong cac chuc nang sau:");
            System.out.println("1. Them moi thong tin sinh vien");
            System.out.println("2. Sua thong tin sinh vien");
            System.out.println("3. Xoa thong tin sinh vien");
            System.out.println("4. Thoat");
            int choice = sc.nextInt();

            while (choice != 4) {
                switch (choice) {
                    case 1:
                        System.out.println("Nhap thong tin sinh vien can them:");
                        Student newStudent = new Student();
                        newStudent.inputInfo();
                        students.add(newStudent);
                        break;
                    case 2:
                        System.out.println("Nhap ten sinh vien can sua thong tin:");
                        String nameToEdit = sc.next();
                        boolean edited = false;
                        for (int i = 0; i < students.size(); i++) {
                            Student s = students.get(i);
                            if (s.getFullName().equalsIgnoreCase(nameToEdit)) {
                                System.out.println("Nhap tuoi moi cho sinh vien " + nameToEdit + ":");
                                int newAge = sc.nextInt();
                                sc.nextLine();
                                s.setAge(newAge);
                                edited = true;
                                break;
                            }
                        }
                        if (edited) {
                            System.out.println("Sua thong tin sinh vien " + nameToEdit + " thanh cong");
                        } else {
                            System.out.println("Khong tim thay sinh vien co ten la " + nameToEdit);
                        }
                        break;
                    case 3:
                        System.out.println("Nhap ten sinh vien can xoa:");
                        String nameToDelete = sc.next();
                        boolean deleted = false;
                        for (int i = 0; i < students.size(); i++) {
                            Student s = students.get(i);
                            if (s.getFullName().equalsIgnoreCase(nameToDelete)) {
                                students.remove(i);
                                deleted = true;
                                break;
                            }
                        }
                        if (deleted) {
                            System.out.println("Xoa sinh vien " + nameToDelete + " thanh cong");
                        } else {
                            System.out.println("Khong tim thay sinh vien co ten la " + nameToDelete);
                        }
                        break;
                    default:
                        System.out.println("Chuc nang khong ton tai");
                        break;
                }

                System.out.println("\nDanh sach sinh vien:");
                for (Student student : students) {
                    student.showInfo();
                }

                System.out.println("\nChon mot trong cac chuc nang sau:");
                System.out.println("1. Them moi thong tin sinh vien");
                System.out.println("2. Sua thong tin sinh vien");
                System.out.println("3. Xoa thong tin sinh vien");
                System.out.println("4. Thoat");
                choice = sc.nextInt();
            }
        }
        System.out.println("Ket thuc chuong trinh");
    }
}
