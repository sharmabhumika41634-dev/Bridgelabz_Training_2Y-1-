package Arrays.Leed_Code;

public class Leetcode_263 {
    public static boolean isUgly(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }

    // Main Method
    public static void main(String[] args) {

        int n = 60;

        boolean result = isUgly(n);

        System.out.println(result);
    }
}

