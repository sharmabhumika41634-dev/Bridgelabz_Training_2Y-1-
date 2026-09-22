package Arrays.Slinding_Window_Technique;
import java.util.*;
public class Leetcode_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int max = 0, start = 0, end = 0;
        ArrayList<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max = Math.max(max, end - start);
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        System.out.println("Answer: " + max);

        sc.close();
    }
}
