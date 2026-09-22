package String.Assignment_2.Level_2;
import java.util.Scanner;
public class FriendsAnalysis {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (in cm/m) of " + friends[i] + ": ");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");

        input.close();
    }

}
