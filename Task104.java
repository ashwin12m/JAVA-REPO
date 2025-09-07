import java.util.TreeSet;

public class Task104 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Mango");
        treeSet.add("Orange");

        String firstElement = treeSet.first();
        String lastElement = treeSet.last();

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
