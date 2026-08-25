package Arrays.Leed_Code;

import java.util.Arrays;

public class Leetcode_128 {
    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {


            if (nums[i] == nums[i - 1]) {
                continue;
            }


            else if (nums[i] == nums[i - 1] + 1) {
                count++;
            }


            else {
                max = Math.max(count, max);
                count = 1;
            }
        }

        return Math.max(count, max);
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(nums));

    }
}