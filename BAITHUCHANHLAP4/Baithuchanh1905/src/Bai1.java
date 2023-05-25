import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            // Nhap day so
            System.out.println("Nhap vao so cac phan tu cua day:");
            int n = scanner.nextInt();
            System.out.println("Nhap vao cac phan tu cua day:");
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                numbers.add(num);
            }

            // Tim so nguyen lon nhat
            int max = Collections.max(numbers);
            System.out.println("So nguyen lon nhat trong day:" + max);

            // Nhập vào số nguyên để xoá
            System.out.print("Nhap vao so nguyen de xoa khoi day: ");
            int deleteNum = scanner.nextInt();

            // Xoá các phần tử có giá trị bằng số nguyên đã nhập
            numbers.removeIf(num -> num == deleteNum);
        }

        // Sap xep va in day so
        Collections.sort(numbers);
        System.out.println("Say so sau khi sap xep:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
