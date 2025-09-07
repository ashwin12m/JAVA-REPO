import java.util.Random;
import java.util.Scanner;

public class RockPaperSicssor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int choice = 0;
        int computerChoice = 0;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        boolean b1 = true;
        System.out.println("ROCK PAPER SICSSOR GAME :\nPress 1 : Rock\nPress 2 : Paper\nPress 3 : Sicssor\nPress 0 : Exit");
        while (b1) {
            System.out.println("Enter your choice :");
            choice = s.nextInt();
            computerChoice = r.nextInt(3) + 1;
            switch (choice) {
                case 1:
                    if (computerChoice == 1) {
                        System.out.println("Game Draw :");
                        ties++;
                    }
                    else if (computerChoice == 2) {
                        System.out.println("Computer chose Paper , You chose Rock , Computer wins");
                        losses++;
                    }
                    else if (computerChoice == 3) {
                        System.out.println("Computer chose Sicssor , You chose Rock , You win");
                        wins++;
                    }
                    break;
                case 2:
                if (computerChoice == 2) {
                    System.out.println("Game Draw :");
                    ties++;
                }
                else if (computerChoice == 3) {
                    System.out.println("Computer chose Scissor , You chose Paper , Computer wins");
                    losses++;
                }
                else if (computerChoice == 1) {
                    System.out.println("Computer chose Rock , You chose Paper , You win");
                    wins++;
                }

                    break;

                case 3:
                if (computerChoice == 3) {
                    System.out.println("Game Draw :");
                    ties++;
                }
                else if (computerChoice == 1) {
                    System.out.println("Computer chose Rock , You chose Scissor , Computer wins");
                    losses++;
                }
                else if (computerChoice == 2) {
                    System.out.println("Computer chose Paper , You chose Scissor , You win");
                    wins++;
                }
                    break;
                
                case 0:
                System.out.println("Thanks For Playing ");
                System.out.println("Your Score :  " +wins);
                System.out.println("Computer Score :  "+losses);
                System.out.println("Total Draw :  "+ties);
                if (wins > losses) {
                    System.out.println("You Are Ultimate Winner");
                }
                else if (wins == losses) {
                    System.out.println("Its A ultimate Draw");
                }
                else
                {
                    System.out.println("Computer is Ultimate winner");
                }

                b1 = false;
                break;
                default:
                System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
