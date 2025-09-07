public class Student1 {
    int marks1;
    int marks2;
    int marks3;

    public void setdata(int a , int b , int c)
    {
        marks1 = a;
        marks2 = b;
        marks3 = c;
    }

    public int total()
    {
        int tot = marks1+marks2+marks3;
        return tot;
    }
    public double percent()
    {
        double sum = (marks1 + marks2 + marks3);
        double percentage = (sum / 300) * 100;
        return percentage;
    }
    public void display()
    {
        System.out.println("Student details :");
        System.out.println("Subject 1 Marks"+marks1);
        System.out.println("Subject 2 Marks"+marks2);
        System.out.println("Subject 3 Marks"+marks3);
        System.out.println("Total Marks : "+this.total());
        System.out.println("Percentage : "+this.percent());
        System.out.println("---------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.marks1 = 90;
        s1.marks2 = 80;
        s1.marks3 = 70;
        s1.display();

        Student1 s2 = new Student1();
        s2.setdata(75, 80, 90);
        s2.display();

        Student1 s3 = new Student1();
        s3.marks1 = 98;
        s3.marks2 = 88;
        s3.marks3 = 78;
        s3.display();
    }
}
