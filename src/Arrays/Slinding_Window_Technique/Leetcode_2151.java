package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_2151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String target = sc.next();
        int start = sc.nextInt();

        int ans = n;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {

                int d = Math.abs(i - start);
                d = Math.min(d, n - d);

                ans = Math.min(ans, d);
            }
        }

        System.out.println(ans == n ? -1 : ans);

        sc.close();
    }
}
