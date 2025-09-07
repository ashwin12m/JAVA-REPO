public class DukanMain {
    public static void main(String[] args) {
        Dukan item1 = new Dukan();
        item1.setdata(101, "Laptop", 124000);
        item1.display();

        Dukan item2 = new Dukan();
        item2.setdata(102, "Mobile", 100000);
        item2.display();

        Dukan item3 = new Dukan();
        item3.setdata(103, "Earphone", 25000);
        item3.display();

        Dukan item4 = new Dukan();
        item4.setdata(104, "Watch", 20000);
        item4.display();
    }
}
