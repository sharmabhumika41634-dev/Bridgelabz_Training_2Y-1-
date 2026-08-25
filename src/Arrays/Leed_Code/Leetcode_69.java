package Arrays.Leed_Code;

public class Leetcode_69 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        long start = 1;
        long end = x;
        long ans = 0;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Leetcode_69 obj = new Leetcode_69();
        int num = 8;
        System.out.println("Square root of " + num + " is: " + obj.mySqrt(num));
    }
}