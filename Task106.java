import java.util.TreeSet;

public class Task106 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Mango");
        treeSet.add("Orange");
        
        int size = treeSet.size();
        
        System.out.println("Number of elements in the TreeSet: " + size);
    }
}