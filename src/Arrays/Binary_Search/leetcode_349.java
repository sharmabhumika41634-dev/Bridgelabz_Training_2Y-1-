package Arrays.Binary_Search;
import java.util.*;
public class leetcode_349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter first array:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] b = new int[m];

        System.out.println("Enter second array:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        System.out.println("Intersection:");

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            boolean already = false;

            for (int k = 0; k < i; k++) {
                if (a[k] == a[i])
                    already = true;
            }

            if (found && !already)
                System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
