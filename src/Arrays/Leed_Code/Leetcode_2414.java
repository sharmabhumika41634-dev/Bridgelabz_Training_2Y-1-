package Arrays.Leed_Code;

public class Leetcode_2414 {

    public static int longestContinuousSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }

        int count = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1) + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {

        String s1 = "abacaba";
        String s2 = "abcde";

        System.out.println(longestContinuousSubstring(s1));
        System.out.println(longestContinuousSubstring(s2));
    }
}

