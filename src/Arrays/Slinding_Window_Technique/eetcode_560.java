package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class eetcode_560 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum = sum + nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}
