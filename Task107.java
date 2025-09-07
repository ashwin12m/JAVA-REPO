import java.util.TreeSet;

public class Task107 {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();
        
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Cherry");
        
        treeSet2.add("Banana");
        treeSet2.add("Cherry");
        treeSet2.add("Mango");
        
        System.out.println("TreeSet1: " + treeSet1);
        System.out.println("TreeSet2: " + treeSet2);
        
        boolean isEqual = treeSet1.equals(treeSet2);
        System.out.println("Are both TreeSets equal? " + isEqual);
        
        TreeSet<String> commonElements = new TreeSet<>(treeSet1);
        commonElements.retainAll(treeSet2);
        System.out.println("Common elements: " + commonElements);
        
        TreeSet<String> difference = new TreeSet<>(treeSet1);
        difference.removeAll(treeSet2);
        System.out.println("Elements only in TreeSet1: " + difference);

    }
}
 