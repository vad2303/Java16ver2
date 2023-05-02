import java.util.TreeMap;

public class Slide107 {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<>();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        System.out.println("TreeMap ban đầu:");
        for(String key : myMap.keySet()) {
            System.out.println(key + " => " + myMap.get(key));
        }

        myMap.put("B", 4);

        System.out.println("\nTreeMap sau khi thay đổi:");
        for(String key : myMap.keySet()) {
            System.out.println(key + " => " + myMap.get(key));
        }
    }
}