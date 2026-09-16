package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> result = new ArrayList<>();

        int i = num.length - 1;
        int carry = k;

        while (i >= 0 || carry > 0) {

            if (i >= 0) {
                carry = carry + num[i];
                i--;
            }

            result.add(carry % 10);
            carry = carry / 10;
        }

        Collections.reverse(result);

        return result;
    }
    public static void main(String[] args) {

        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> result = addToArrayForm(num, k);

        System.out.println(result);
    }
}


