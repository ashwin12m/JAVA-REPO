import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] basket = new String[100];
        String inp="0" ;
        int count = 0;
        while (!inp.equals( "exit")) {
            System.out.println("Enter a Item name to add to the basket");
            inp = s.next();
            basket[count]=inp;
            count++;
        }
        System.out.println("\n\nItems Added in Basket Are :");
        for (int i = 0; i < (+count-1); i++) {
            System.out.println(basket[i]);
        }
    }
}
