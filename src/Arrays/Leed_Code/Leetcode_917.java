package Arrays.Leed_Code;

public class Leetcode_917 {
    public static String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Left character letter nahi hai
            if (!Character.isLetter(arr[left])) {
                left++;
            }

            // Right character letter nahi hai
            else if (!Character.isLetter(arr[right])) {
                right--;
            }

            // Dono letters hain → swap
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "ab-cd";

        System.out.println(reverseOnlyLetters(s));
    }
}
