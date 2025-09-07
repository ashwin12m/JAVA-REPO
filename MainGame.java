import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Game g = new Game();
        boolean exit = false;

        System.out.println("WELCOME TO THE GAME!");

        while (!exit) {
            System.out.println("\nPress:");
            System.out.println("1} Create User");
            System.out.println("2} Log In");
            System.out.println("3} Exit");

            int choose = s.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter Your Name: ");
                    String name = s.next();
                    System.out.println("Enter Your PIN: ");
                    int pin = s.nextInt();
                    g.CreateUser(name, pin);
                    System.out.println("User Created Successfully!");
                    break;

                case 2:
                    System.out.println("Enter Your Name: ");
                    String name2 = s.next();
                    System.out.println("Enter Your PIN: ");
                    int pin2 = s.nextInt();

                    if (g.login(name2, pin2)) {
                        System.out.println("Login Successful!");
                        g.StartGame(name2);
                    } else {
                        System.out.println("Login Failed! Invalid name or PIN.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for playing! Goodbye.");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
        }

        s.close();
    }
}
