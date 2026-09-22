package Arrays.Class_Practice;
import java.util.*;
public class Leaders_anArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> ans = new ArrayList<>();

        int max = arr[n - 1];
        ans.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                ans.add(arr[i]);
            }
        }

        Collections.reverse(ans);

        System.out.println("Leaders: " + ans);

        sc.close();
    }
}
