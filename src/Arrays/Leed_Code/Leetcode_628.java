package Arrays.Leed_Code;
import java.util.Arrays;
public class Leetcode_628 {
    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        // Two smallest negative numbers × largest number
        int product1 = nums[0] * nums[1] * nums[n - 1];

        // Three largest numbers
        int product2 = nums[n - 3] * nums[n - 2] * nums[n - 1];

        return Math.max(product1, product2);
    }

    // Main Method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int result = maximumProduct(nums);

        System.out.println(result);
    }
}

