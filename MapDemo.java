import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("Nine", 9);
        map.put("Ten", 10);
        System.out.println(map);
        System.out.println(map.put("One", 11));
        map.remove("One");
        System.out.println(map);
        System.out.println(map.get("Two"));
        System.out.println(map.containsValue(5));
        System.out.println(map.containsKey("Five"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        


    }
}