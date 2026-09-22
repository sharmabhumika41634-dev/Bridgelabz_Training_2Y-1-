package String.Assignment_2.Level_3;
import java.util.Scanner;


public class FirstNonRepeatingChar {
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 1) {
                return c;
            }
        }

        return '\0'; // Return null char if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        input.close();
    }
}
