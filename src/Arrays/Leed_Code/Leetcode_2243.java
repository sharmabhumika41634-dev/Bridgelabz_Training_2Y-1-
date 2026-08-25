package Arrays.Leed_Code;

public class Leetcode_2243 {
    public static String digitSum(String s, int k) {

        while (s.length() > k) {

            String newString = "";

            for (int i = 0; i < s.length(); i += k) {

                int sum = 0;

                for (int j = i; j < i + k && j < s.length(); j++) {
                    sum = sum + (s.charAt(j) - '0');
                }

                newString = newString + sum;
            }

            s = newString;
        }

        return s;
    }

    public static void main(String[] args) {

        String s = "11111222223";
        int k = 3;

        String ans = digitSum(s, k);

        System.out.println(ans);
    }
}