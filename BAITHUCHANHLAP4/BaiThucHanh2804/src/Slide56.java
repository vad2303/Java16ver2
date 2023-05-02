import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hSet = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            hSet.add("Wilson");
            hSet.add("Nike");
            hSet.add("Volvo");
            hSet.add("Kia");
            hSet.add("Lenovo");
            hSet.add("Lenovo");

            System.out.println("Cac phan tu trong HashSetString:");
            System.out.println(hSet);
            System.out.println("Nhap phan tu can xoa:");
            name = sc.nextLine();
        }

        if (hSet.contains(name)) {
            hSet.remove(name);
            System.out.println("Xoa thanh cong:");
            System.out.println("Cac phan tu con lai trong HashSetString:");
            System.out.println(hSet);

        } else {
            System.out.println("Xoa khong thanh cong");
        }
    }

}
