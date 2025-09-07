import java.util.Scanner;
import java.util.TreeSet;

public class Task109 {
    public static void main(String[] args) {
        // Create a TreeSet and add numbers
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(9);
        treeSet.add(11);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int givenNumber = scanner.nextInt();

            if (treeSet.contains(givenNumber)) {
                System.out.println("The number " + givenNumber + " is present in the set.");
                TreeSet<Integer> greaterOrEqual = (TreeSet<Integer>) treeSet.headSet(givenNumber);
                if (greaterOrEqual != null) {
                    System.out.println("The element Smaller than or equal to " + givenNumber + " is: " + greaterOrEqual);
                } else {
                    System.out.println("No element found greater than or equal to " + givenNumber);
                }

                TreeSet<Integer> lessThan = (TreeSet<Integer>) treeSet.tailSet(givenNumber);
                if (lessThan != null) {
                    System.out.println("The element Greater than or equal to " + givenNumber + " is: " + lessThan);
                } else {
                    System.out.println("No element found less than " + givenNumber);
                }
            }
            else
            {
                System.out.println("The number " + givenNumber + " is not present in the set.");
            }
        }
            }

                
}
