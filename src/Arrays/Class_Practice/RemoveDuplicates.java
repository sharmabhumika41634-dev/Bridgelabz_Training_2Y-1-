package Arrays.Class_Practice;

public class RemoveDuplicates {
    public static int removeDuplicate(int nums[]) {

        int j = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    public static void main(String[] args) {

        int nums[] = {1, 1, 2, 2, 3, 3, 4};

        int n = removeDuplicate(nums);

        System.out.print("After removing duplicates = ");

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
