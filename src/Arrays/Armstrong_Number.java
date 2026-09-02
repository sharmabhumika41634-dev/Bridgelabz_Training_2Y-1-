package Arrays;

public class Armstrong_Number {
    public static int count(int n) {

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static boolean IsArmstrong(int n) {
        int original = n;
        int sum = 0;
        int d = count(n);
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, d));
            n = n / 10;
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        int n = 153;
        System.out.println(IsArmstrong(n));
    }
}
