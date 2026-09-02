package Arrays.Leed_Code;
import java.util.Arrays;
public class Leetcode_2733 {

    public static int findNonMinOrMax(int[] nums) {

        if (nums.length < 3) {
            return -1;
        }

        Arrays.sort(nums);

        return nums[1];
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 4};

        int result = findNonMinOrMax(nums);

        System.out.println(result);
    }
}
