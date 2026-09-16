package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int start = 0, sum = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                min = Math.min(min, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        System.out.println("Answer: " +
                (min == Integer.MAX_VALUE ? 0 : min));

        sc.close();
    }
}
