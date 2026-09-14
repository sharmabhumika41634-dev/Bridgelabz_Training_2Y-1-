package Arrays.Class_Practice;
import java.util.*;
public class Maximum_NumberOfZeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.next();

        String ans = "-1";
        int max = 0;

        for (String x : arr) {
            int zero = 0;

            for (char c : x.toCharArray()) {
                if (c == '0')
                    zero++;
            }

            if (zero > max || (zero == max && zero > 0 && x.compareTo(ans) > 0)) {
                max = zero;
                ans = x;
            }
        }

        System.out.println("Answer: " + ans);

        sc.close();
    }
}
