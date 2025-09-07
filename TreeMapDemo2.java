import java.util.Comparator;
import java.util.TreeMap;

class Comparator3 implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // Descending order
    }
}

public class TreeMapDemo2
{
    public static void main(String[] args) {
        TreeMap<String, Integer> t = new TreeMap<>(new Comparator3());
        t.put("Akash", 104);
        t.put("Rahul", 101);
        t.put("Ravi", 103);
        t.put("Rohan", 102);
        t.put("Rahul", 105);

        System.out.println(t);
    }
}