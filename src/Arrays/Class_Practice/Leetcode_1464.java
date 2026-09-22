package Arrays.Class_Practice;
import java.util.Scanner;
public class Leetcode_1464 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max1 = 0;
        int max2 = 0;

        for (int x : nums) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max2 = x;
            }
        }

        int ans = (max1 - 1) * (max2 - 1);

        System.out.println(ans);

        sc.close();
    }
}
