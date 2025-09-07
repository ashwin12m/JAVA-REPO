//SubString
public class String1 {
    public static void main(String[] args) {
        String str = "PROGRAM";
        System.out.println(str.substring(0));
        System.out.println(str.substring(3));
        System.out.println(str.substring(0,7));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(3,5));

        String s1 = "abc cba";
        System.out.println(s1.replace("a", "z"));

        System.out.println("Lava".replace("L","J"));
        System.out.println("Hello".replace("4","J"));

        String s2 = "C++ programming";
        System.out.println(s2.replace("C++", "Java"));

        System.out.println("aa bb aa zz".replace("aa", "zz"));
        System.out.println("Java".replace("C++", "C"));

        String S3 = "Learn Java";
        System.out.println(S3.charAt(0));
        System.out.println(S3.charAt(6));
        System.out.println(S3.charAt(5));

    }
}
