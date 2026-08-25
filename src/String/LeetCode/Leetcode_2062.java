package String.LeetCode;

public class Leetcode_2062 {
    public static int countVowelSubstrings(String word) {

        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            int[] vowels = new int[5];

            for (int j = i; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (ch == 'a') vowels[0]++;
                else if (ch == 'e') vowels[1]++;
                else if (ch == 'i') vowels[2]++;
                else if (ch == 'o') vowels[3]++;
                else if (ch == 'u') vowels[4]++;
                else break;

                if (vowels[0] > 0 && vowels[1] > 0 &&
                        vowels[2] > 0 && vowels[3] > 0 &&
                        vowels[4] > 0) {

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String word = "aeiouu";

        System.out.println(countVowelSubstrings(word));
    }
}

