import java.util.LinkedHashSet;

public class Slide59 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");

        System.out.println("Các phần tử ban đầu trong set: " + set);

        set.remove("Python");

        System.out.println("Các phần tử còn lại trong set sau khi xóa \"Python\": " + set);
    }
}