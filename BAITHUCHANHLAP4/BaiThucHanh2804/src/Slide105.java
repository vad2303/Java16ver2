import java.util.Map;
import java.util.TreeMap;

public class Slide105 {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<>();
        myMap.put("A", 1);
        myMap.put("B", 2);
        myMap.put("C", 3);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
