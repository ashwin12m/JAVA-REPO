import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        int [] []x = new int [3][3];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the value for row " + (i + 1) + " " + "column " + (j + 1) + ":");
                x[i][j] = s.nextInt();
                }
                }
            
            for (int[] i : x) {
                for (int j : i) {
                    System.out.print(j + " ");
                    }
                    System.out.println();
                    }
                
            }

    }
    
