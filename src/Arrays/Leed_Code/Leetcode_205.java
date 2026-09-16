package Arrays.Leed_Code;
import java.util.*;
public class Leetcode_205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int[] a = new int[256];
        int[] b = new int[256];

        for (int i = 0; i < s.length(); i++) {

            if (a[s.charAt(i)] != b[t.charAt(i)]) {
                System.out.println(false);
                return;
            }

            a[s.charAt(i)] = i + 1;
            b[t.charAt(i)] = i + 1;
        }

        System.out.println(true);

        sc.close();
    }
}
