package Arrays.Binary_Search;
import java.util.*;

public class Leetcode_153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }

        System.out.println("Minimum = " + nums[start]);

        sc.close();
    }
}
