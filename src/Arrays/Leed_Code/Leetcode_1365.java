package Arrays.Leed_Code;
import java.util.Arrays;
public class Leetcode_1365 {
    public static int[] findSmaller(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {8, 1, 2, 2, 3};

        int[] result = findSmaller(nums);

        System.out.println(Arrays.toString(result));
    }
}
