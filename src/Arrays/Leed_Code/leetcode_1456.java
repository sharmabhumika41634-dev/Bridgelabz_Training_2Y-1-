package Arrays.Leed_Code;

public class leetcode_1456 {

    public static int maxVowels(String s, int k) {

        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                count++;
            }

            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static boolean isVowel(char ch) {

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        int result = maxVowels(s, k);

        System.out.println(result);
    }
}