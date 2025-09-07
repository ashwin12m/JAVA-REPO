import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        if ((Integer)o1 < (Integer)o2) {
            return 1;
        } else if ((Integer)o1 > (Integer)o2) {
            return -1;
        } else {
            return 0;
            
        }
    }
    
}
