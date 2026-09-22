package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;
public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] empIDs) {
        int n = empIDs.length;

        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;

            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j = j - 1;
            }
            empIDs[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = input.nextInt();

        int[] empIDs = new int[n];
        System.out.println("Enter Employee IDs:");
        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + " ID: ");
            empIDs[i] = input.nextInt();
        }

        insertionSort(empIDs);

        System.out.println("\nSorted Employee IDs (Ascending Order):");
        for (int id : empIDs) {
            System.out.print(id + " ");
        }
        System.out.println();

        input.close();
    }
}
