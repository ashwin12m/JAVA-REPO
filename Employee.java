import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double empsal;
    int age;
    double total;
    Scanner s = new Scanner(System.in);
    public void setdata(int id,String name,double empsal,int age)
    {
        this.id=id;
        this.name=name;
        this.empsal=empsal;
        this.age=age;
    }
    public void totalSal()
    {
        double Da = 0.50*empsal;
        double Hra = 0.40*empsal;
        double Ta = 0.10*empsal;
        double pf = 0.18*empsal;
        total = empsal + Da + Hra + Ta - pf ;
        if(age>=40 && age<100)
        {
            total += 10000;
        }
    }
    public void display()
    {
        System.out.println("Employee Id ="+id);
        System.out.println("Employee Name ="+name);
        System.out.println("Employee Basic Salary ="+empsal);
        System.out.println("Employee Age ="+age);
        System.out.println("Employee Total Salary ="+total);
    }
}
