package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_2094 {
    public static int[] findEvenNumbers(int[] digits) {

        boolean[] seen = new boolean[1000];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < digits.length; i++) {

            if (digits[i] == 0)
                continue;

            for (int j = 0; j < digits.length; j++) {

                if (j == i)
                    continue;

                for (int k = 0; k < digits.length; k++) {

                    if (k == i || k == j)
                        continue;

                    if (digits[k] % 2 != 0)
                        continue;

                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[k];

                    if (!seen[num]) {
                        seen[num] = true;
                        list.add(num);
                    }
                }
            }
        }

        Collections.sort(list);

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] digits = {2, 1, 3, 0};

        int[] result = findEvenNumbers(digits);

        System.out.println(Arrays.toString(result));
    }
}
