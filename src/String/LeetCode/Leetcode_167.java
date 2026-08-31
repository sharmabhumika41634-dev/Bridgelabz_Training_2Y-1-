package String.LeetCode;
import java.util.Arrays;
public class Leetcode_167 {
    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Leetcode_167 obj = new Leetcode_167();


        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println(Arrays.toString(result));
    }
}
