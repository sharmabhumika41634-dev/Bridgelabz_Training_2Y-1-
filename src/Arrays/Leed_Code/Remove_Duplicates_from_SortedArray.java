package Arrays.Leed_Code;

public class Remove_Duplicates_from_SortedArray {
    static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    // Main Method
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int count = removeDuplicates(nums);

        System.out.println("Unique Elements Count = " + count);

        System.out.print("Array = ");

        for (int k = 0; k < count; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}

