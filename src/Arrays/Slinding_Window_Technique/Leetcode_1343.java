package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class Leetcode_1343 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int threshold = sc.nextInt();

        int sum = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        if (sum >= k * threshold) {
            count++;
        }

        // Sliding Window
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum >= k * threshold) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}

