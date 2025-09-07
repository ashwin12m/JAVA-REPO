import java.util.TreeSet;

public class Task103 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Cherry");

        TreeSet<String> treeSet2 = new TreeSet<>();

        treeSet2.addAll(treeSet1);
        treeSet1.clear();

        System.out.println("TreeSet after transfer:");
        treeSet2.forEach(System.out::println);
    }
}