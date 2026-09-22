package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;
public class SelectionSortScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of exam scores: ");
        int n = input.nextInt();

        int[] scores = new int[n];
        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        selectionSort(scores);

        System.out.println("\nSorted Scores (Ascending Order):");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        input.close();
    }
}
