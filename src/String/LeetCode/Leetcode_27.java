package String.LeetCode;

public class Leetcode_27 {
    public int removeElement(int[] nums, int val) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[j++] = nums[i];
        }

        return j;
    }

    public static void main(String[] args) {

        Leetcode_27 s = new Leetcode_27();

        int[] nums = {3, 2, 2, 3};

        int k = s.removeElement(nums, 3);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
