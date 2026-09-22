package Arrays.Class_Practice;
import java.util.*;
public class leetcode_922 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 1;

        while (even < n && odd < n) {

            while (even < n && nums[even] % 2 == 0) {
                even += 2;
            }

            while (odd < n && nums[odd] % 2 != 0) {
                odd += 2;
            }

            if (even < n && odd < n) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
