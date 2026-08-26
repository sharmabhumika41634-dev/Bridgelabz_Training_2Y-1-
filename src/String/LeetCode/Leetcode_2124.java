package String.LeetCode;

public class Leetcode_2124 {
    public static boolean checkString(String s) {

        return !s.contains("ba");
    }

    public static void main(String[] args) {

        String s = "aaabbb";

        System.out.println(checkString(s));
    }
}

