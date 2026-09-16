package Arrays.Leed_Code;

public class Leetcode_3232 {
    public static boolean canAliceWin(int[] nums) {

        int single = 0;
        int doub = 0;

        for (int num : nums) {

            if (num < 10) {
                single += num;
            } else {
                doub += num;
            }
        }

        return single != doub;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 14};

        boolean result = canAliceWin(nums);

        System.out.println(result);
    }
}
