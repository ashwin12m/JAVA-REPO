import java.util.TreeSet;

public class Task105 {
    public static void main(String[] args) {
        
        TreeSet <Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set.add(90);
        set.add(100);

        TreeSet <Integer> set2 = new TreeSet(set);
        set2.add(110);
        set2.add(120);
        set2.add(130);

        for (Integer number : set2) {
            System.out.println(number);
        }
    }
}
