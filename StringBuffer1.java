public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        System.out.println(sb.capacity());

        sb = sb.append(" Java");
        System.out.println(sb);

        sb = sb.replace(2,5,"y");
        System.out.println(sb);

        sb = sb.insert(4,"Daddy ");
        System.out.println(sb);

        sb = sb.delete(4,9);
        System.out.println(sb);

        sb = sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());

        sb.ensureCapacity(40);
        System.out.println(sb.capacity());

        sb.append("ssssdfghfdfgfdfggfdfgvdfgbvcfffbgvfggbbbbcfbfbbvfcbvbnbvbbvcbvcvbvcvbbvcvcvbvnbvvjhgfghjuygfgjuygbjgfvbjhgfvbhgfvbhyffjuytdhfcvbhgfcvbhgfcvbhgfcvbnvc");
        System.out.println(sb.capacity());
    }
}
