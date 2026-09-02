package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class Leetcode_1450 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] startTime = new int[n];
        int[] endTime = new int[n];

        for (int i = 0; i < n; i++) {
            startTime[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            endTime[i] = sc.nextInt();
        }

        int queryTime = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (startTime[i] <= queryTime &&
                    queryTime <= endTime[i]) {

                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
