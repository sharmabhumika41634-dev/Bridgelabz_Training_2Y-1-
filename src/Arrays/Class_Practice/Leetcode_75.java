package Arrays.Class_Practice;
import java.util.*;
public class Leetcode_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int x : nums) {
            if (x == 0) {
                zero++;
            } else if (x == 1) {
                one++;
            } else {
                two++;
            }
        }

        int i = 0;

        while (zero-- > 0) {
            nums[i++] = 0;
        }

        while (one-- > 0) {
            nums[i++] = 1;
        }

        while (two-- > 0) {
            nums[i++] = 2;
        }

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
