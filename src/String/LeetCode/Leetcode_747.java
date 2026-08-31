package String.LeetCode;

public class Leetcode_747 {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }


        for (int i = 0; i < nums.length; i++) {

            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Leetcode_747 obj = new Leetcode_747();


        int[] nums = {3, 6, 1, 0};

        int result = obj.dominantIndex(nums);

        System.out.println(result);
    }
}
