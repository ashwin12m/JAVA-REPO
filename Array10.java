import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        int arr [][] = {{10,20,30},{40,50},{70,80,90}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        Scanner s = new Scanner(System.in);
        int [][] arr2 = new int[3][3]  ;
        int inp;
        System.out.println("Enter Elements of the Array :");
        for (int k = 0; k < arr2.length; k++) {
            for (int j = 0; j < arr2[k].length; j++) {
             inp = s.nextInt();
             arr2[k][j] = inp;
        }
        }

        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
