package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_58 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example: 1 3 5 6
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int target = sc.nextInt();

        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                return;
            }
            else if (nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        System.out.println(start);

        sc.close();
    }
}
