package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;
public class BubbleSortMarks {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter marks of " + n + " students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        bubbleSort(marks);

        System.out.println("\nSorted Marks (Ascending Order):");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        input.close();
    }
}
