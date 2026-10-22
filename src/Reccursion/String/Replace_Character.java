package Reccursion.String;

public class Replace_Character {
    public static void replace(String s, int index) {
        if (index == s.length()) {
            return;
        }

        if (s.charAt(index) == 'a') {
            System.out.print('b');
        } else {
            System.out.print(s.charAt(index));
        }

        replace(s, index + 1);
    }

    public static void main(String[] args) {
        String s = "banana";

        replace(s, 0);
    }
}
