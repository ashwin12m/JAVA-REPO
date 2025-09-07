import java.util.Scanner;

public class MainEmployee {
    int id;
        String name;
        double sal;
        int age;
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    Employee e1 = new Employee();
        e1.setdata(id,name,sal,age);
        e1.totalSal();
        e1.display();
    Employee e2 = new Employee();
        e2.setdata(id,name,sal,age);
        e2.totalSal();
        e1.display();
    Employee e3 = new Employee();
        e3.setdata(id,name,sal,age);
        e3.totalSal();
        e1.display();
        System.out.println("Total Sal Of Emp 1 :"+e1.total);
        System.out.println("Total Sal Of Emp 2 :"+e2.total);
        System.out.println("Total Sal Of Emp 3 :"+e3.total);

        System.out.println("Total Expence : "+(e1.total+e2.total+e3.total));
    }
}
