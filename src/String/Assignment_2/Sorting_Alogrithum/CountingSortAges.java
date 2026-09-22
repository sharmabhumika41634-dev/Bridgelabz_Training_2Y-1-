package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;
public class CountingSortAges {
    public static void countingSort(int[] ages) {
        int n = ages.length;
        if (n == 0) return;

        // Find maximum age for range
        int max = ages[0];
        for (int i = 1; i < n; i++) {
            if (ages[i] > max) {
                max = ages[i];
            }
        }

        int[] count = new int[max + 1];
        int[] output = new int[n];

        // Store count of each element
        for (int i = 0; i < n; i++) {
            count[ages[i]]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in correct positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i]] - 1] = ages[i];
            count[ages[i]]--;
        }

        // Copy sorted elements back to original array
        for (int i = 0; i < n; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[] ages = new int[n];
        System.out.println("Enter ages of students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " Age: ");
            ages[i] = input.nextInt();
        }

        countingSort(ages);

        System.out.println("\nSorted Student Ages (Ascending Order):");
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();

        input.close();
    }
}
