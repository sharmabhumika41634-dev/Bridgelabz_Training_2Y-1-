package Arrays.Leed_Code;
import java.util.Scanner;
public class Leetcode_387 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int answer = -1;

        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i) - 'a'] == 1) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);

        sc.close();
    }
}
