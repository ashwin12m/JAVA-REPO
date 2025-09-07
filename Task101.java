import java.util.TreeSet;

public class Task101 {
    public static void main(String[] args) {
        TreeSet <String> set = new TreeSet<>();
        set.add("RED");
        set.add("BLUE");
        set.add("GREEN");
        set.add("YELLOW");
        set.add("ORANGE");
        set.add("PURPLE");

        for (String color : set) {
            System.out.println(color);
        }
    }
}
