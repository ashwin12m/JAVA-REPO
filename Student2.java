import java.util.Scanner;
public class Student2 {
    int marks1[]=new int[10];
    int marks2[]=new int[10];
    int marks3[]=new int[10];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public void display()
    {
        for (int i = 0; i < count ; i++) {
            System.out.println("Subject 1 Marks"+marks1[i]);
            System.out.println("Subject 2 Marks"+marks2[i]);
            System.out.println("Subject 3 Marks"+marks3[i]);
            System.out.println(" ");
            System.out.println("Total ="+this.total());
            System.out.println("Percentage ="+this.percent());
        }
    }

    public void getdata()
    {
        System.out.println("Enter Number of Students :");
        count = sc.nextInt();
        for (int i = 0; i < count ; i++) {
            System.out.println("Student 1");
            System.out.println("Enter Marks of Student " + (i + 1) + " inSubject 1");
            marks1[i] = sc.nextInt();
            System.out.println("Enter Marks of Student " + (i + 1) + " inSubject 2");
            marks2[i] = sc.nextInt();
            System.out.println("Enter Marks of Student " + (i + 1) + " inSubject 3");
            marks3[i] = sc.nextInt();
            System.out.println("------------------------------------------------------------------------------------------");
            }
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.getdata();
        s1.display();
    }
}
