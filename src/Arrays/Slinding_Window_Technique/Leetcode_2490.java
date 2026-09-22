package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_2490 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");

        boolean ans = true;

        for (int i = 0; i < words.length; i++) {

            String current = words[i];
            String next = words[(i + 1) % words.length];

            if (current.charAt(current.length() - 1) != next.charAt(0)) {
                ans = false;
                break;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
