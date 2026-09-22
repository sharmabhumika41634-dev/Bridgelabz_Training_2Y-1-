package String.Assignment_2.Level_1;
import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the height of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Mean Height of Football Team: " + mean);

        input.close();
    }
}
