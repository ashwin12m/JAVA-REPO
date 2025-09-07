import java.util.PriorityQueue;

public class QueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        queue.offer("Element 4");
        queue.offer("Element 5");
        System.out.println(queue); // [Element 1, Element 2, Element 3, Element 4, Element 5]
    }
}
