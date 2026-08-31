package String.LeetCode;

public class Leetcode_1047 {
    public String removeDuplicates(String s) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (str.length() > 0 &&
                    str.charAt(str.length() - 1) == s.charAt(i)) {

                str.deleteCharAt(str.length() - 1);

            } else {
                str.append(s.charAt(i));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {

        Leetcode_1047 obj = new Leetcode_1047();



        String s = "abbaca";

        String result = obj.removeDuplicates(s);

        System.out.println(result);
    }
}
