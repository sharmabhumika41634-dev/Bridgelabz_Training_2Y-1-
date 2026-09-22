package Arrays.Slinding_Window_Technique;
import java.util.*;

public class Leetcode_567 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int window = s1.length();
        int length = s2.length();

        boolean ans = false;

        if (window <= length) {

            int[] s1Arr = new int[26];
            int[] s2Arr = new int[26];

            for (int i = 0; i < window; i++) {
                s1Arr[s1.charAt(i) - 'a']++;
                s2Arr[s2.charAt(i) - 'a']++;
            }

            if (Arrays.equals(s1Arr, s2Arr)) {
                ans = true;
            }

            for (int i = 1; i <= length - window && !ans; i++) {

                int prev = s2.charAt(i - 1) - 'a';
                int next = s2.charAt(i + window - 1) - 'a';

                s2Arr[prev]--;
                s2Arr[next]++;

                if (Arrays.equals(s1Arr, s2Arr)) {
                    ans = true;
                }
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
