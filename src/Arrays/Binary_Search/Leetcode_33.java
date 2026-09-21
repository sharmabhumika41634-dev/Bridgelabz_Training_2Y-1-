package Arrays.Binary_Search;
import java.util.*;
public class Leetcode_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                break;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        System.out.println("Answer = " + ans);

        sc.close();
    }
}
