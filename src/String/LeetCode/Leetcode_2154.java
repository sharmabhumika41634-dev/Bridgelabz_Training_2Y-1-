package String.LeetCode;

public class Leetcode_2154 {
    public int findFinalValue(int[] nums, int original) {

        boolean found;

        while (true) {

            found = false;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == original) {
                    original = original * 2;
                    found = true;
                    break;
                }
            }

            if (!found) {
                break;
            }
        }

        return original;
    }

    public static void main(String[] args) {

        Leetcode_2154 obj = new Leetcode_2154();



        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;

        int result = obj.findFinalValue(nums, original);

        System.out.println(result);
    }
}
