package Arrays;

public class Palindrome_Number {
    public static boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int rem = number % 10;
            reverse = reverse * 10 + rem;
            number = number / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int number = 121;
        System.out.println(isPalindrome(number));
    }
}
