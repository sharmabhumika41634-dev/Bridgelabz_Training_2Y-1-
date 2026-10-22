package Reccursion.String;

public class Palindrome {
    public static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return check(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "madam";

        System.out.println(check(s, 0, s.length() - 1));
    }
}
