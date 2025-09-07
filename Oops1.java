class Student {

    int id;
    String name;
    public void display()
    {
        System.out.println("Student id is "+id);
        System.out.println("Student name is "+name);
    }
}
public class Oops1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.display();
        s1.id=101;
        s1.name="Rahul";
        s1.display();
    }
}

