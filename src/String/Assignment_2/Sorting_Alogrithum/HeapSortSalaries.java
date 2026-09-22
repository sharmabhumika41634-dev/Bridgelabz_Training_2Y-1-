package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;
public class HeapSortSalaries {
    public static void heapify(double[] salaries, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) {
            double swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;

            heapify(salaries, n, largest);
        }
    }

    public static void heapSort(double[] salaries) {
        int n = salaries.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            double temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            heapify(salaries, i, 0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of job applicants/employees: ");
        int n = input.nextInt();

        double[] salaries = new double[n];
        System.out.println("Enter salaries:");
        for (int i = 0; i < n; i++) {
            System.out.print("Salary " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
        }

        heapSort(salaries);

        System.out.println("\nSorted Salaries (Ascending Order):");
        for (double salary : salaries) {
            System.out.print(salary + " ");
        }
        System.out.println();

        input.close();
    }
}
