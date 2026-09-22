package String.Assignment_2.Level_3;
import java.util.Scanner;
public class CharacterFrequencyNestedLoops {
    public static void findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    frequency[i]++;
                    chars[j] = '0'; // Set to '0' to avoid re-counting duplicate characters
                }
            }
        }

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                System.out.println("'" + chars[i] + "' -> " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        findFrequency(text);

        input.close();
    }
}

