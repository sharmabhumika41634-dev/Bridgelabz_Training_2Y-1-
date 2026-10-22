package Reccursion.String;

public class Remove_Character {
    public static void remove(String s, char ch, int index) {
        if (index == s.length()) {
            return;
        }

        if (s.charAt(index) != ch) {
            System.out.print(s.charAt(index));
        }

        remove(s, ch, index + 1);
    }

    public static void main(String[] args) {
        String s = "banana";

        remove(s, 'a', 0);
    }
}
