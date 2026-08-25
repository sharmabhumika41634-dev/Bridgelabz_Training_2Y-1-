package Arrays.Leed_Code;

public class Leetcode_367 {
    public boolean isPerfectSquare(int num) {
        if (num < 1) return false;
        if (num == 1) return true;

        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode_367 obj = new Leetcode_367();
        int num = 16; // उदाहरण के लिए
        System.out.println("Is " + num + " a perfect square? " + obj.isPerfectSquare(num));
    }
}