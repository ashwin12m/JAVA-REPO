import mathpackage.Add1;
import mathpackage.Factorial1;
import mathpackage.SquareCube;
public class MainAdd1 {
    public static void main(String[] args) {
        Add1 s = new Add1();
        int res = s.add(10, 20);
        System.out.println("Result is: " + res);

        Factorial1 f1 = new Factorial1();
        int res1 = f1.fact1(5);
        System.out.println("Factorial of 5 is: " + res1);

        SquareCube sc = new SquareCube();
        int sq = sc.squ(10);
        int cb = sc.cub(10);
        System.out.println("Square = "+sq);
        System.out.println("Cube = "+cb);
    }
}
