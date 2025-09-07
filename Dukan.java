public class Dukan {
    int id;
    String name;
    double price;

    public void setdata(int id , String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Details of Item");
        System.out.println("ID: "+id);
        System.out.println("Name "+name);
        System.out.println("Price "+price);
        System.out.println("----------------------------------------------------");
    }
}
