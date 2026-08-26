package String.LeetCode;

public class Leetcode_2535 {
    public static int differenceOfSum(int[] nums) {

        int elementSum = 0;
        int digitSum = 0;

        for (int num : nums) {

            elementSum += num;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }

    public static void main(String[] args) {

        int[] nums = {1, 15, 6, 3};

        System.out.println(differenceOfSum(nums));
    }
}
