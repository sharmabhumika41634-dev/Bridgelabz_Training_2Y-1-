package Arrays.Leed_Code;

public class Leetcode_1832 {
    public static boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            seen[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {

            if (!seen[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));
    }
}
