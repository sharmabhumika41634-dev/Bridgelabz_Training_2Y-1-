package String.LeetCode;
import java.util.Arrays;
public class Leetcode_2460 {
    public int[] applyOperations(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        int j = 0;

        for (int n : nums) {
            if (n != 0)
                nums[j++] = n;
        }

        while (j < nums.length)
            nums[j++] = 0;

        return nums;
    }

    public static void main(String[] args) {

        Leetcode_2460 s = new Leetcode_2460();

        int[] nums = {1, 2, 2, 1, 1, 0};

        System.out.println(Arrays.toString(s.applyOperations(nums)));
    }

}
