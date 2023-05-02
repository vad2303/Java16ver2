import java.util.LinkedHashMap;

public class Slide93 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap<>();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        System.out.println("Before removal: " + myMap);

        myMap.remove("B");

        System.out.println("After removal: " + myMap);
    }
}