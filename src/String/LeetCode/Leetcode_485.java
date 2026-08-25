package String.LeetCode;

public class Leetcode_485 {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {

        // Example
        int[] nums = {1, 1, 0, 1, 1, 1};

        int answer = findMaxConsecutiveOnes(nums);

        System.out.println(answer);
    }
}
