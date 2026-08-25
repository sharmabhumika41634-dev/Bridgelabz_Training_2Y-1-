package String.LeetCode;

public class Leetcode_520 {
    public static boolean detectCapitalUse(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
        if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
            count++;
        }
    }

        return count == 0 || count == word.length()
            || count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
}

public static void main(String[] args) {

    String word = "USA";

    System.out.println(detectCapitalUse(word));
}
}