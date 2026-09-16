package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int sum = 0;

        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                sum += x;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
