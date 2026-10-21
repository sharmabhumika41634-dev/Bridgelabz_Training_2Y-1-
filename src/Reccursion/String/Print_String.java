package Reccursion.String;

public class Print_String {
    public static void print(String s1, int index) {

        if (index == s1.length()) {
            return;
        }

        System.out.print(s1.charAt(index));
        print(s1, index + 1);
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        print(s1, 0);
    }
}
