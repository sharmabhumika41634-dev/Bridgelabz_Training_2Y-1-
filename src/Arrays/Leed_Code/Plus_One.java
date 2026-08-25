package Arrays.Leed_Code;

public class Plus_One {
    static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // Agar sabhi digits 9 hain
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }

    // Main Method
    public static void main(String[] args) {

        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        System.out.print("Output: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
