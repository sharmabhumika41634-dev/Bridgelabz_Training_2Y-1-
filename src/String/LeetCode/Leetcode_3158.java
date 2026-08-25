package String.LeetCode;

public class Leetcode_3158 {
    public static int duplicateNumbersXOR(int[] nums) {

        int answer = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    answer = answer ^ nums[i];
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3};

        int answer = duplicateNumbersXOR(nums);

        System.out.println(answer);
    }
}
