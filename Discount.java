public class Discount {
    String name;
    int qty;
    double price;
    double total;

    void getdata(String name, int qty, double price) {
        this.name = name;

        if (qty > 0) {
            this.qty = qty;
        } else {
            System.out.println("Invalid quantity");
            return;
        }

        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price");
            return;
        }

        this.total = qty * price;
    }

    void givdis() {
        if (total < 1000 && total > 0) {
            System.out.println("5% Discount applied");
            double dis = (5.0 / 100) * total;
            total = total - dis;
        } else if (total >= 1000 && total < 5000) {
            System.out.println("10% Discount applied");
            double dis = (10.0 / 100) * total;
            total = total - dis;
        } else if (total >= 5000) {
            System.out.println("15% Discount applied");
            double dis = (15.0 / 100) * total;
            total = total - dis;
        } else {
            System.out.println("No Discount");
        }
    }

    void tax() {
        double cgst = (2.5 / 100) * total;
        double sgst = (2.5 / 100) * total;
        System.out.println("CGST: " + cgst);
        System.out.println("SGST: " + sgst);
        total = total + cgst + sgst;
        System.out.println("TOTAL BILL: " + total);
    }

    void bill() {
        System.out.println("Bill");
        System.out.println("Customer Name: " + this.name);
        System.out.println("Quantity \t Price \t Initial Total");
        System.out.println(this.qty + "\t\t" + this.price + "\t\t" + (this.qty*this.price));
        givdis();
        tax();
    }
}
