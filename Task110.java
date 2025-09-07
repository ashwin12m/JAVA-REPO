import java.util.Comparator;
import java.util.TreeSet;

class Comparator3 implements Comparator<Integer> {
    @Override
    public int compare(Object o1, Object o2) {
       
    }

    
}

public class Task110 {
    public static void main(String[] args) {
        
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator3());
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(9);

        TreeSet <Integer> treeSet2 = new TreeSet<>(new Comparator3());
        treeSet2.add(7);
        treeSet2.add(5);
        treeSet2.add(1);
        treeSet2.add(3);
        treeSet2.add(9);

        System.out.println("TreeSet2: " + treeSet);
        System.out.println("TreeSet: " + treeSet2);
    }
    
}
