package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_2089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (nums[i] == target) {
                ans.add(i);
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
