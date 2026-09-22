package String.Assignment_2.Level_3;
import java.util.Scanner;
public class CharacterFrequencyASCII {
    public static String[][] getCharacterFrequencies(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count unique characters to set array size
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] > 0) {
                uniqueCount++;
                frequency[text.charAt(i)] = -frequency[text.charAt(i)]; // Mark processed
            }
        }

        // Restore frequencies
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] < 0) {
                frequency[text.charAt(i)] = -frequency[text.charAt(i)];
            }
        }

        String[][] result = new String[uniqueCount][2];
        boolean[] visited = new boolean[256];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!visited[c]) {
                visited[c] = true;
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(frequency[c]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String[][] frequencies = getCharacterFrequencies(text);

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("'" + frequencies[i][0] + "' -> " + frequencies[i][1]);
        }

        input.close();
    }
}
