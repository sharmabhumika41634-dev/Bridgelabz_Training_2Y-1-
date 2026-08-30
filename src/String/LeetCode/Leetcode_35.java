package String.LeetCode;

public class Leetcode_35 {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }

        return nums.length;
    }

    public static void main(String[] args) {

        Leetcode_35 s = new Leetcode_35();

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        System.out.println(s.searchInsert(nums, target));
    }
}