package Arrays.Leed_Code;

public class Leetcode_20 {
    public static String longestCommonPrefix(String[] strs) {

        String ans = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                // Index range ke bahar ya character match nahi hua
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return ans;
                }
            }

            ans = ans + ch;
        }

        return ans;
    }

    public static void main(String[] args) {

        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }
}
