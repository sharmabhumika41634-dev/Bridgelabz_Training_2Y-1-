package Reccursion.String;

public class Remove_Duplicates {
    public static boolean isDuplicate(String s, int index, char ch) {
        if (index < 0) {
            return false;
        }

        if (s.charAt(index) == ch) {
            return true;
        }

        return isDuplicate(s, index - 1, ch);
    }

    public static void remove(String s, int index) {
        if (index == s.length()) {
            return;
        }

        if (!isDuplicate(s, index - 1, s.charAt(index))) {
            System.out.print(s.charAt(index));
        }

        remove(s, index + 1);
    }

    public static void main(String[] args) {
        String s = "programming";

        remove(s, 0);
    }
}
