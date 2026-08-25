package String.LeetCode;

public class Leetcode_345 {
    public static String reverseVowels(String s) {

        char[] ch = s.toCharArray();

        int start = 0;
        int end = ch.length - 1;

        while (start < end) {

            while (start < end && !isVowel(ch[start])) {
                start++;
            }

            while (start < end && !isVowel(ch[end])) {
                end--;
            }

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }

        return new String(ch);
    }

    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverseVowels(s));
    }
}
