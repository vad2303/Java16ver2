import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhập vào số lượng phần tử trong danh sách
            System.out.print("Nhap vao so luong phan tu trong danh sach: ");
            int n = scanner.nextInt();

            // Nhap vao cac so nguyen duong trong danh sach
            System.out.println("Nhap vao cac so nguyen duong:");
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (num > 0) {
                    numbers.add(num);
                } else {
                    System.out.println("so khong hop le vui long nhap so nguyen");
                    i--;
                }
            }
        }

        // Tinh trung binh cong cua cac so chan
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        // Hien thi ket qua trung binh cong
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung binh cong cua cac so chan:" + average);
        } else {
            System.out.println("Khong co so chan trong danh sach");
        }
    }
}