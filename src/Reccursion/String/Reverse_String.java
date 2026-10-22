package Reccursion.String;

public class Reverse_String {
    public static void reverse(String s, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(s.charAt(index));
        reverse(s, index - 1);
    }

    public static void main(String[] args) {
        String s = "Hello";
        reverse(s, s.length() - 1);
    }
}
