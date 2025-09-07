import java.util.Iterator;
import java.util.TreeSet;


public class Task102 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Mango");
        treeSet.add("Orange");

        System.out.println("Iterating using for-each loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating using forEach method:");
        treeSet.forEach(System.out::println);
    }
}