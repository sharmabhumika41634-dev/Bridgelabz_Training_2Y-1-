package String.LeetCode.PracticeProblem;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result = new StringBuffer(str).reverse().toString();

        if (result.equals(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
