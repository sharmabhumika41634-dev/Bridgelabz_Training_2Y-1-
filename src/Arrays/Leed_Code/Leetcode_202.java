package Arrays.Leed_Code;
import java.util.HashSet;
public class Leetcode_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSum(n);
        }

        return n == 1;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Leetcode_202 obj = new Leetcode_202();
        System.out.println(obj.isHappy(19));
    }
}