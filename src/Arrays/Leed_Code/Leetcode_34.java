package Arrays.Leed_Code;
import java.util.Scanner;
public class Leetcode_34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < n; i++) {

            if (nums[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println("[" + first + "," + last + "]");

        sc.close();
    }
}
