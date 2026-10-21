package Reccursion.String;

public class FindMax_Element {
    public static boolean palindrom(String name, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (name.charAt(start) != name.charAt(end)) {
            return false;
        }

        return palindrom(name, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String name = "madam";

        System.out.println(palindrom(name, 0, name.length() - 1));
    }
}
