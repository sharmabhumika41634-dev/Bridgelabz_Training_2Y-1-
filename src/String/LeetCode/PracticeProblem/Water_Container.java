package String.LeetCode.PracticeProblem;
import java.util.Scanner;
public class Water_Container {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;
        int max = 0;

        while (start < end) {

            int area = Math.min(height[start], height[end])
                    * (end - start);

            max = Math.max(max, area);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
