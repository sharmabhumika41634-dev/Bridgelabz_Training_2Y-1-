package String.LeetCode;

public class Leetcode_191 {
    public static int hammingWeight(int n) {

        String binary = Integer.toBinaryString(n);

        int count = 0;

        for (int i = 0; i < binary.length(); i++) {

            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 11;

        int answer = hammingWeight(n);

        System.out.println(answer);
    }
}
