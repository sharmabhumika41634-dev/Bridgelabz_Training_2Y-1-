package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class MaxSum_SubArray_size_k {
    static int maxValue(int arr[], int k) {

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int max = sum;

        // Sliding window
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Maximum Sum = " + maxValue(arr, k));

        sc.close();
    }
}
