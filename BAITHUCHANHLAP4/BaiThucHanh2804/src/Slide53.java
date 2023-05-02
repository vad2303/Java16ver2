import java.util.HashSet;
import java.util.Scanner;

public class Slide53 {
    public static void main(String[] args) {
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            hashSetInteger.add(0);
            hashSetInteger.add(3);
            hashSetInteger.add(1);
            hashSetInteger.add(4);
            hashSetInteger.add(2);
            hashSetInteger.add(8);

            System.out.println("cac phan tu trong hashSetI la");
            System.out.println(hashSetInteger);
            System.out.println("Nhap phan tu can them: ");
            number = scanner.nextInt();
        }
        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu sau khi them");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("Phan tu" + number + "da ton tai");
        }
    }
}