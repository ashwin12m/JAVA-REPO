import java.util.Scanner;

public class Function2 {

    int add(int a,int b)
    {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    float div(int a,int b)
    {
        if(b==0)
        {
            System.out.println("Error: Division by zero is not allowed");
            return 0;
        }
        else
        {
            return a/b;
        }
    }
        int areaS(int a)
        {
            return a*a;
        }

        int areaR(int a , int b)
        {
            return a*b;
        }

        float areaT(int a,int b)
        {
            return (float) (a*b)/2;
        }
    
        float areaC(int a)
        {
            return (float)(3.14f*a*a);
        }

    public static void main(String[] args) {
        Function2 F2 = new Function2();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number1 To Add :");
        int num1 = s.nextInt();
        System.out.println("Enter Number2 To Add :");
        int num2 = s.nextInt();
        System.out.println("Addition of " + num1 + " and " + num2 + " is " + F2.add(num1, num2));

        System.out.println("Enter Number1 To Subtratct :");
        int num3 = s.nextInt();
        System.out.println("Enter Number2 To Subtract :");
        int num4 = s.nextInt();
        System.out.println("Subtraction of " + num3 + " and " + num4 +" is " + F2.sub(num3, num4));

        System.out.println("Enter Number1 To Multiply :");
        int num5 = s.nextInt();
        System.out.println("Enter Number2 To Multiply :");
        int num6 = s.nextInt();
        System.out.println("Multiplication of " + num5 + " and " + num6 +" is " + F2.mul(num5, num6));

        System.out.println("Enter Number1 To Division :");
        int num7 = s.nextInt();
        System.out.println("Enter Number2 To Division :");
        int num8 = s.nextInt();
        System.out.println("Division of " + num7 + " and " + num8 +" is " + F2.mul(num7, num8));

        System.out.println("Enter Side of Square :");
        int num9 = s.nextInt();
        System.out.println("Area of Square is " + F2.areaS(num9));

        System.out.println("Enter Length of Rectangle :");
        int num10 = s.nextInt();
        System.out.println("Enter Breadth of Rectangle :");
        int num11 = s.nextInt();
        System.out.println("Area of Rectangle is " + F2.areaR(num10, num11));

        System.out.println("Enter Radius of Circle :");
        int num12 = s.nextInt();
        System.out.println("Area of Circle is " + F2.areaC(num12));

        System.out.println("Enter Heigth of Triangle");
        int num13 = s.nextInt();
        System.out.println("Enter Base of Triangle");
        int num14 = s.nextInt();
        System.out.println("Area of Triangle is " + F2.areaT(num13, num14));

    }
}
