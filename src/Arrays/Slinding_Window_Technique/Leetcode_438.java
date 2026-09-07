package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_438 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        String p = sc.next();

        List<Integer> ans = new ArrayList<>();

        char[] b = p.toCharArray();
        Arrays.sort(b);

        for (int i = 0; i <= s.length() - p.length(); i++) {
            char[] a = s.substring(i, i + p.length()).toCharArray();
            Arrays.sort(a);

            if (Arrays.equals(a, b))
                ans.add(i);
        }

        System.out.println(ans);
    }
}
