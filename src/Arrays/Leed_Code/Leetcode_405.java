package Arrays.Leed_Code;

public class Leetcode_405 {
    public static String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String digits = "0123456789abcdef";
        String result = "";

        while (num != 0) {

            int digit = num & 15;
            result = digits.charAt(digit) + result;

            num = num >>> 4;
        }

        return result;
    }

    // Main Method
    public static void main(String[] args) {

        int num1 = 26;
        int num2 = -1;
        String result1 = toHex(num1);
        String result2 = toHex(num2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
