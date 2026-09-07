package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_2273 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            if (ans.isEmpty()) {
                ans.add(s);
            } else {
                char[] a = s.toCharArray();
                char[] b = ans.get(ans.size() - 1).toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                if (!Arrays.equals(a, b))
                    ans.add(s);
            }
        }

        System.out.println(ans);
    }
}
