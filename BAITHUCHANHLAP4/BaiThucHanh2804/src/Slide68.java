import java.util.TreeSet;
import java.util.Scanner;

public class Slide68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        try (Scanner scanner = new Scanner(System.in)) {
            treeSetInteger.add(0);
            treeSetInteger.add(3);
            treeSetInteger.add(4);
            treeSetInteger.add(7);
            treeSetInteger.add(2);
            treeSetInteger.add(6);
            treeSetInteger.add(8);

            System.out.println("cac phan tu trong treeSetInteger");
            System.out.println(treeSetInteger);
            System.out.println("Nhap phan tu can them");
            number = scanner.nextInt();
        }

        if (!!treeSetInteger.contains(number)) {
            treeSetInteger.add(number);
            System.out.println("them thanh cong");
            System.out.println(" cac phan tu trong treeSetI sau khi them la :");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("phan tu" + number + "da ton tai");
        }
    }
}