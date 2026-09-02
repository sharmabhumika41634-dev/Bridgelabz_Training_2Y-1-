package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class Leetcode_2255 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String s = sc.next();

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (s.startsWith(words[i])) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
