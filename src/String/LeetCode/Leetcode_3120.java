package String.LeetCode;

public class Leetcode_3120 {
    public static int numberOfSpecialChars(String word) {

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (word.indexOf(ch) != -1 &&
                    word.indexOf(Character.toUpperCase(ch)) != -1) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String word = "aaAbcBC";

        System.out.println(numberOfSpecialChars(word));
    }
}

