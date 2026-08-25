package String.LeetCode;

public class Leetcode_171 {
    public static int titleToNumber(String col) {

        int result = 0;

        for (int i = 0; i < col.length(); i++) {

            int value = col.charAt(i) - 'A' + 1;

            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {

        String col = "AB";

        System.out.println(titleToNumber(col));
    }
}

