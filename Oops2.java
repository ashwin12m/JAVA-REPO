import java.util.Scanner;

class Area
{
    Scanner s1 = new Scanner(System.in);
    public void circle()
    {
        System.out.println("Enter the radius of the circle");
        double r = s1.nextDouble();
        double area = 3.14 * r * r;
        System.out.println("The area of the circle is " + area);
    }
    public void triangle()
    {
        System.out.println("Enter the Height of the triangle");
        double h = s1.nextDouble();
        System.out.println("Enter the base of the triangle");
        double b = s1.nextDouble();
        double area = 0.5 * h * b;
        System.out.println("The area of the triangle is " + area);
    }
    public void square()
    {
        System.out.println("Enter Side Of Square");
        double s = s1.nextDouble();
        double area = s * s;
        System.out.println("The area of the triangle is " + area);
    }
    public void rectangle()
    {
        System.out.println("Enter Length of Rectangle");
        double l = s1.nextDouble();
        System.out.println("Enter Breadth of Rectangle");
        double b = s1.nextDouble();
        double area = l * b;
        System.out.println("The area of the rectangle is " + area);
    }
}
public class Oops2 {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Select the shape you want to calculate the area of");  
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.println("4. Rectangle");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        switch (choice) {
            case 1:
            a.circle();
            break;
            case 2:
            a.triangle();
            break;
            case 3:
            a.square();
            break;
            case 4:
            a.rectangle();
            break;
            default: 
            System.out.println("Invalid choice");
            break;
    }

}}
