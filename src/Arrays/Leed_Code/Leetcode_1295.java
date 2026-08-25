package Arrays.Leed_Code;
import java.util.Scanner;
public class Leetcode_1295 {
    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digits = 0;

            while (num != 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println(result);

        sc.close();
    }
}
