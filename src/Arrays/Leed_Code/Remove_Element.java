package Arrays.Leed_Code;

public class Remove_Element {
    static int removeElement(int[] nums, int val) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

    // Main Method
    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int ans = removeElement(nums, val);

        System.out.println("Count = " + ans);

        System.out.print("Array = ");

        for (int i = 0; i < ans; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
