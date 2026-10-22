package Reccursion.String;

public class Count_Vowels {
    public static int count(String s, int index) {
        if (index == s.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(s.charAt(index));
        int result = count(s, index + 1);

        if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            return result + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(count(s, 0));
    }
}
