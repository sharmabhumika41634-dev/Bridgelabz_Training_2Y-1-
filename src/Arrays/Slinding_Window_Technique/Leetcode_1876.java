package Arrays.Slinding_Window_Technique;
import java.util.Scanner;
public class Leetcode_1876 {
    static int countGoodSubstrings(String s) {

        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {

            String window = s.substring(i, i + 3);

            if (window.charAt(0) != window.charAt(1) &&
                    window.charAt(1) != window.charAt(2) &&
                    window.charAt(2) != window.charAt(0)) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.println("Good Substrings = " + countGoodSubstrings(s));

        sc.close();
    }
}
