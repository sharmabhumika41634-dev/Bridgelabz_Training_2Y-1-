package Arrays.Leed_Code;

public class Leetcode_633 {
    public static boolean judgeSquareSum(int c) {

        long i = 0;
        long j = (long) Math.sqrt(c);

        while (i <= j) {
            long sum = i * i + j * j;

            if (sum == c) {
                return true;
            }
            else if (sum < c) {
                i++;
            }
            else {
                j--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int c = 5;

        System.out.println(judgeSquareSum(c));
    }
}
