package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_2595 {
    public static int[] evenOddBit(int n) {

        int even = 0;
        int odd = 0;
        int index = 0;

        while (n > 0) {

            if (n % 2 == 1) {

                if (index % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            n = n / 2;
            index++;
        }

        return new int[]{even, odd};
    }

    public static void main(String[] args) {

        int n = 50;

        int[] result = evenOddBit(n);

        System.out.println(Arrays.toString(result));
    }
}
