public class ComparableInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z")); // -25
        System.out.println("Z".compareTo("A")); // 25
        System.out.println("A".compareTo("A")); // 0
        System.out.println("A".compareTo("a")); // -32
        System.out.println("a".compareTo("A")); // 32
        System.out.println("A".compareTo("B")); // -1
        System.out.println("B".compareTo("A")); // 1
        System.out.println("A".compareTo(null)); // NullPointerException
    }
}
