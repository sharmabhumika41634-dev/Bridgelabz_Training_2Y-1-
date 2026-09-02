package Arrays.Leed_Code;
import java.util.HashMap;
public class Leetcode_1281 {
    public static int longestSubsequence(int[] arr, int difference) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        for (int num : arr) {

            int length = map.getOrDefault(num - difference, 0) + 1;

            map.put(num, length);

            max = Math.max(max, length);
        }

        return max;
    }

    // Main Method
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int difference = 1;

        int result = longestSubsequence(arr, difference);

        System.out.println(result);
    }
}

