package Arrays.Leed_Code;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode_1389 {
    public static int[] createTargetArray(int nums[], int index[]) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int target[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4, 0};
        int index[] = {0, 1, 2, 3, 0};

        int target[] = createTargetArray(nums, index);

        System.out.println(Arrays.toString(target));
    }
}