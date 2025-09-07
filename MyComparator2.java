import java.util.Comparator;

public class MyComparator2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        int result = o1.toString().compareTo(o2.toString());
        if (result < 0) {
            return 1;
        } else if (result > 0) {
            return -1;
        } else {
            return 0;
        }
            
    }
    
}
