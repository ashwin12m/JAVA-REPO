import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;



public class MapDemo2 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(101, "John");
        h.put(102, "Jane");
        h.put(103, "Jack");
        h.put(104, "Jill");
        h.put(105, "Joe");

        System.out.println(h);

        Set s = h.entrySet();
        System.out.println(s);

        Iterator i = s.iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry) i.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
