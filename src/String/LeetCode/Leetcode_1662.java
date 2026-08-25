package String.LeetCode;

public class Leetcode_1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String s1 = "";
        String s2 = "";

        int index = 0;

        while (index < word1.length || index < word2.length) {

            if (index < word1.length) {
                s1 = s1 + word1[index];
            }

            if (index < word2.length) {
                s2 = s2 + word2[index];
            }

            index++;
        }

        return s1.equals(s2);
    }

    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}

