package Reccursion.String;

public class Count_Character {
    public static int count(String s, char ch, int index) {
        if (index == s.length()) {
            return 0;
        }

        int result = count(s, ch, index + 1);

        if (s.charAt(index) == ch) {
            return result + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "banana";

        System.out.println(count(s, 'a', 0));
    }
}
