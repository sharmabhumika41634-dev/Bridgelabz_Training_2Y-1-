package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class Leetcode_634 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int sum = 0;


        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        double answer = (double) maxSum / k;

        System.out.println(answer);

        sc.close();
    }
}
