import java.util.TreeSet;

public class Task108 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(11);
        
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) treeSet.headSet(7);
        
        System.out.println("Numbers less than 7: " + lessThanSeven);
    }
}
