import java.util.PriorityQueue;

public class QueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue <String> queue = new PriorityQueue<>();
        System.out.println(queue.peek()); // null
        System.out.println(queue.poll()); // null
        //System.out.println(queue.element()); // Exception in thread "main" java.util.NoSuchElementException: No element found
        //System.out.println(queue.remove()); // Exception in thread "main" java.util.NoSuchElementException: No element found
        for (int i = 0; i < 10; i++) {
            queue.offer("Element " + i);
        }
        System.out.println(queue.peek()); // Element 0
        System.out.println(queue.poll()); // Element 0
        System.out.println(queue.element()); // Element 1
        System.out.println(queue.remove()); // Element 1
        System.out.println(queue); // [Element 2, Element 3, Element 4, Element 5, Element 6, Element 7, Element 8, Element 9]
    }
}
