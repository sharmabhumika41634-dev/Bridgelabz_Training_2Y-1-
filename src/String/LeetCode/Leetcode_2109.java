package String.LeetCode;

public class Leetcode_2109 {
    public static String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();

        int j = 0;

        for (int i = 0; i < s.length(); i++) {

            if (j < spaces.length && i == spaces[j]) {
                sb.append(" ");
                j++;
            }

            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};

        System.out.println(addSpaces(s, spaces));
    }
}
