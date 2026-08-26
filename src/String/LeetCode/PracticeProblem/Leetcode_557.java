package String.LeetCode.PracticeProblem;

public class Leetcode_557 {
    public static String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        String result = reverseWords(s);

        System.out.println(result);
    }
}
