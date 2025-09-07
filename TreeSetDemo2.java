import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new MyComparator2());
        treeSet.add("A");
        treeSet.add("Z");
        treeSet.add("D");
        treeSet.add("V");
        treeSet.add("P");

        System.out.println("TreeSet: " + treeSet);


    }
}
