import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> h = new LinkedHashMap<>();
        h.put(101, "John");
        h.put(102, "Jane");
        h.put(103, "Jack");
        h.put(104, "Jill");
        h.put(105, "Joe");

        System.out.println(h);

    }
}
