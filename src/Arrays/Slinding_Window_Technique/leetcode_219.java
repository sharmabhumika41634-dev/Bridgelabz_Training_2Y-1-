package Arrays.Slinding_Window_Technique;
import java.util.*;

public class leetcode_219 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        boolean ans = false;

        for (int i = 0; i < n; i++) {
            if (set.contains(a[i])) {
                ans = true;
                break;
            }

            set.add(a[i]);

            if (set.size() > k)
                set.remove(a[i - k]);
        }

        System.out.println(ans);
    }
}


