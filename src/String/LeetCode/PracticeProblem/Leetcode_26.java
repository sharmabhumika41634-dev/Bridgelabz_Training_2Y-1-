package String.LeetCode.PracticeProblem;

public class Leetcode_26 {
    public int removeDuplicates(int[] nums) {

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[k - 1] != nums[i]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        Leetcode_26 obj = new Leetcode_26();


        int[] nums = {1, 1, 2};

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);

    }
}
