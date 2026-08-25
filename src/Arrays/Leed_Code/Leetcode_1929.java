package Arrays.Leed_Code;
import java.util.Arrays;
public class Leetcode_1929 {
    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[] result = getConcatenation(nums);

        System.out.println(Arrays.toString(result));
    }
}

