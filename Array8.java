import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        int[] freq = new int[n];
        int[] obs = new int[n];

        System.out.println("Enter Observations :");
        for (int i = 0; i < n; i++) {
            obs[i] = s.nextInt();
            }
            System.out.println("Enter Frequency :");
            for (int i = 0; i < n; i++) {
                freq[i] = s.nextInt();
                }
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = obs[i] * freq[i];
                }
            int sum_arr = 0;
            for (int i = 0; i < n; i++) {
                sum_arr += arr[i];
                }
            
            int sum_freq = 0;
            for (int i = 0; i < n; i++) {
                sum_freq += freq[i];
                }
            
            double mean = (double)sum_arr/sum_freq;
            System.out.println("Sum Of Product of Obs and Freq : "+sum_arr);
            System.out.println("Sum of Frequency : "+sum_freq);
            System.out.println("Arithmatic Mean of  Obs and Freq : "+mean);


    }
}
