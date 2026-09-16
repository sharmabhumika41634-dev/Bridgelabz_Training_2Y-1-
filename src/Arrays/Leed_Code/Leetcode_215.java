package Arrays.Leed_Code;
import java.util.Arrays;
public class Leetcode_215 {
    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);

        return nums[nums.length - k];
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(nums, k);

        System.out.println(result);
    }
}
