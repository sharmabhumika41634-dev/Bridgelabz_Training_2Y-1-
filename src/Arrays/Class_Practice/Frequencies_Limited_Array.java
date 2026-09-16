package Arrays.Class_Practice;
import java.util.Scanner;
public class Frequencies_Limited_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] freq = new int[10001];

        for (int x : arr)
            freq[x]++;

        System.out.print("Frequency: ");

        for (int i = 1; i <= n; i++)
            System.out.print(freq[i] + " ");

        sc.close();
    }
}