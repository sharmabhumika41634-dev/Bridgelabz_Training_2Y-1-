package Arrays.Leed_Code;

public class Leetcode_2427 {
    public static int commonFactors(int a, int b) {

        int count = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }

        return count;
    }

    // Main Method
    public static void main(String[] args) {

        int a = 12;
        int b = 6;

        int result = commonFactors(a, b);

        System.out.println(result);
    }
}


