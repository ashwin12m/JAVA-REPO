import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new MyComparator());
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(9);

        System.out.println("TreeSet: " + treeSet);


    }
}
