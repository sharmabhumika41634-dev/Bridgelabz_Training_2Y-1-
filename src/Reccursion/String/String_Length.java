package Reccursion.String;

public class String_Length {
    public static int findLength(String s, int index) {
        if (index == s.toCharArray().length) {
            return 0;
        }

        return 1 + findLength(s, index + 1);
    }

    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(findLength(s, 0));
    }
}
