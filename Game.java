import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    String name[]= new String[10];
    int pin[]=new int[10];
    int point[]=new int[10];
    int count = 0;
    int idx = 0;

    void CreateUser(String name,int pin)
    {
        this.name[count]=name;
        this.pin[count]=pin;
        this.point[count]=1000;
        count++;
    }
    boolean login(String name,int pin)
    {
        String n1 = name;
        int p1 = pin;
        boolean pre = false;
        for(int i = 0;i<count;i++)
        {
            if(n1.equals(this.name[i]))
            {
                if(p1==this.pin[i])
                {
                    pre = true;
                    idx = i;
                }
            }
        }
        return pre;
    }
    
    void StartGame(String name)
    {
        System.out.println("Welcome To Game :"+name);
        boolean ch = true;
        do{
        System.out.println("Enter Points :");
        int p2 = s.nextInt();
        point[idx]= point[idx]-p2;
        if(p2 <= point[idx] && p2>0)
        {
            System.out.println("Select Any Number (From 1 - 7):");
            int num = s.nextInt();
            int num2 = r.nextInt(8);
            System.out.println("System Generated :"+num2);
            if (num == num2) {
                System.out.println("You Won The Game :");
                point[idx]=point[idx]+(p2*2);
                System.out.println("Total Balance = "+point[idx]);
            }
            else
            {
                System.out.println("You Lost The Game :");
                System.out.println("Total Balance = "+point[idx]);
            }
        }
        else
        {
            System.out.println("Insufficent Balance");
        }
        System.out.println("Do You Want To Continue : (1 = yes | 2 = No)");
        int x = s.nextInt();
        if(x == 1)
        {
            ch = true;
        }
        else if (x == 2 ) {
            ch = false;
        }
        else
        {
            System.out.println("Invalid Choice");
            ch = false;
        }
    }while(point[idx]==0||ch==false);
    System.out.println("Thanks For Playing :");
    }
}
