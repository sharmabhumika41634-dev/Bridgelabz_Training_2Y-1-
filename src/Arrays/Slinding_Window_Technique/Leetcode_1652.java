package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_1652 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] code = new int[n];

        for (int i = 0; i < n; i++)
            code[i] = sc.nextInt();

        int k = sc.nextInt();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= Math.abs(k); j++) {
                int index = k > 0 ? (i + j) % n : (i - j + n) % n;
                ans[i] += code[index];
            }
        }

        for (int x : ans)
            System.out.print(x + " ");

        sc.close();
    }
}
