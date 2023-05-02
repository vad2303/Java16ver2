import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlistInt = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            System.out.println("Nhap phan tu cua ArrayList:");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu" + i + ":");
                number = sc.nextInt();
                arrlistInt.add(number);
            }
        }
        int max = arrlistInt.get(0);
        for (int i = 1; i < arrlistInt.size(); i++) {
            if (arrlistInt.get(i).compareTo(max) > 0) {
                max = arrlistInt.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong ArrayList :" + max);
    }
}