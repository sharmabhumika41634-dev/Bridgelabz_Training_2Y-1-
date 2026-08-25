package Arrays.Leed_Code;

public class Rotate_Array {
    static void rotate(int[] nums, int k) {

        k = k % nums.length;
        int n = nums.length - 1;

        reverse(nums, 0, n);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n);
    }

    // Reverse Method
    static void reverse(int[] nums, int i, int j) {

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    // Main Method
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k);

        System.out.print("Output: ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
