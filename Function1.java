public class Function1 {
    void/*Return type */ m1/*Name of Function*/()/*Zero parameters */
    {
        System.out.println("Oye Oye !!");
    }
    void m2()
    {
        System.out.println("Teri Bhen Ko Naman !!");
    }
    void m3(String n)
    {
        System.out.println("Hello " + n);
    }
    int sqr(int a)
    {
        return a*a;
    }
    public static void main(String[] args) {
        Function1 f1 = new Function1();
        f1.m1();
        f1.m2();
        f1.m3("Vedant");
        int sq = f1.sqr(4);
        System.out.println("Square of 4 is " + sq);
    }
}
