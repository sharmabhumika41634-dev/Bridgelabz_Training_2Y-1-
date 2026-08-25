package String.LeetCode;

public class Leetcode_645 {
    public static int[] findErrorNums(int[] nums) {

        int duplicate = 0;
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                duplicate = i;
            }

            if (count == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        int[] answer = findErrorNums(nums);

        System.out.println("Duplicate = " + answer[0]);
        System.out.println("Missing = " + answer[1]);
    }
}
