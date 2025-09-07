import java.util.Scanner;

public class MainDiscount {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Discount d = new Discount();
    System.out.println("Enter Name Of Customer :");
    String name = s.nextLine();
    System.out.println("Enter the quantity of the item:");
    int qty = s.nextInt();
    System.out.println("Enter the price of the item:");
    double price = s.nextDouble();
    d.getdata(name,qty,price);
    d.givdis();
    d.bill();
    }
}
