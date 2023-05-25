import java.util.LinkedList;
import java.util.Scanner;

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            // Them sinh vien vao danh sach
            System.out.println("Nhap thong tin sinh vien");
            while (true) {
                System.out.println("Nhap ten sinh vien(rong de dung): ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                System.out.println("Nhap diem sinh vien: ");
                double score = scanner.nextDouble();
                scanner.nextLine();

                Student student = new Student(name, score);
                studentList.add(student);
            }

            // Dem so sinh vien phai thi lai va hien thi thong tin
            int countRetake = 0;
            System.out.println("Danh sach sinh vien phai thi lai");
            for (Student student : studentList) {
                if (student.getScore() <= 5) {
                    countRetake++;
                    System.out.println("Ten:" + student.getName() + ",Diem " + student.getScore());
                }
            }
            System.out.println("Tong so sinh vien phai thi lai" + countRetake);

            // Hien thi sinh vien co diem cao nhat
            double maxScore = Double.MIN_VALUE;
            for (Student student : studentList) {
                if (student.getScore() > maxScore) {
                    maxScore = student.getScore();
                }
            }
            for (Student student : studentList) {
                if (student.getScore() == maxScore) {
                    System.out.println("Ten : " + student.getName() + ", Diem " + student.getScore());
                }
            }

            // Tim kiem sinh vien theo ten
            System.out.println("Nhap ten sinh vien de tim kiem : ");
            String searchName = scanner.nextLine();
            boolean found = false;
            System.out.println("Thong tin sinh vien dc tim thay:");
            for (Student student : studentList) {
                if (student.getName().equalsIgnoreCase(searchName)) {
                    System.out.println("Ten: " + student.getName() + ", diem :" + student.getScore());
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Khong tim thay sinh vien co ten : " + searchName);
            }
        }
    }
}