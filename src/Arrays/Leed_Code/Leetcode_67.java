package Arrays.Leed_Code;

public class Leetcode_67 {
    // Method
    public static String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        String result = "";

        while (i >= 0 || j >= 0 || carry != 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                digit2 = b.charAt(j) - '0';
                j--;
            }

            int sum = digit1 + digit2 + carry;

            result = (sum % 2) + result;
            carry = sum / 2;
        }
        return result;
    }

    // Main Method
    public static void main(String[] args) {

        String a = "11";
        String b = "1";

        String result = addBinary(a, b);

        System.out.println(result);
    }
}

