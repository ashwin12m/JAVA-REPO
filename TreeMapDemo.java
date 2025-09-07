import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap t = new TreeMap<>();
        t.put(104, "Akash");
        t.put(101, "Rahul");
        t.put(103, "Ravi");
        t.put(102, "Rohan");
        t.put(105, "Rahul");

        System.out.println(t);
        // t.put(null, "Ravi"); // NullPointerException
        // t.put("A" , "Ravi"); // ClassCastException)

        System.out.println(t.firstKey()); // 101
        System.out.println(t.lastKey()); // 105
        System.out.println(t.headMap(103)); // {101=Rahul, 102=Rohan}
        System.out.println(t.tailMap(103)); // {103=Ravi, 104=Akash, 105=Rahul}
        System.out.println(t.subMap(102, 104)); // {102=Rohan, 103=Ravi}
        System.out.println(t.ceilingKey(103)); // 103
        System.out.println(t.floorKey(103)); // 103
        System.out.println(t.higherKey(103)); // 104
        System.out.println(t.lowerKey(103)); // 102
        System.out.println(t.pollFirstEntry()); // 101=Rahul
        System.out.println(t.pollLastEntry()); // 105=Rahul
        
    }
}
