package Arrays.Leed_Code;
import java.util.Arrays;
public class Leetcode_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] count = new int[1001];

        for (int num : nums1) {
            count[num]++;
        }

        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num : nums2) {
            if (count[num] > 0) {
                temp[k++] = num;
                count[num]--;
            }
        }

        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] ans = intersect(nums1, nums2);

        System.out.println(Arrays.toString(ans));
    }
}

