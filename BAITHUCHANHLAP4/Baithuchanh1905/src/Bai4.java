import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();

        // Thêm tên các loại trái cây vào HashSet từ bàn phím
        Scanner scanner = new Scanner(System.in);
        String fruit;
        do {
            System.out.print("Nhap ten loai trai cay (nhap rogn de dung)): ");
            fruit = scanner.nextLine();
            if (!fruit.isEmpty()) {
                fruitSet.add(fruit);
            }
        } while (!fruit.isEmpty());

        // Hiển thị số phần tử trong HashSet
        System.out.println("So phan tu co trong Hashset: " + fruitSet.size());

        // Kiểm tra loại trái cây có tồn tại trong HashSet hay không
        System.out.print("Nhap ten loai trai cay de kiem tra: ");
        String searchFruit = scanner.nextLine();
        if (fruitSet.contains(searchFruit)) {
            System.out.println("Da tim thay loai trai cay nay trong HashSet!");
        } else {
            System.out.println("Khong tim thay loai trai cay nay trong HashSet!");
        }

        // Xóa một loại trái cây bất kỳ trong HashSet
        System.out.print("Nhap ten loai trai cay de xoa ");
        String removeFruit = scanner.nextLine();
        fruitSet.remove(removeFruit);

        // Hiển thị các phần tử còn lại trong HashSet
        System.out.println("Cac phan tu con lai trong HashSet");
        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Tạo một List mới và thêm các phần tử vào HashSet ban đầu
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Cam");
        fruitList.add("Xoai");
        fruitList.add("Dua");
        fruitList.add("Chuoi");

        fruitSet.addAll(fruitList);

        // Hiển thị lại HashSet sử dụng Iterator
        System.out.println("HashSet sau khi thay the phan tu tu List:");
        iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Xóa các phần tử của List có trong HashSet
        fruitSet.removeAll(fruitList);

        // Hiển thị lại HashSet
        System.out.println("HashSet sau khi xoa cac phan tu cua List:");
        iterator = fruitSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}