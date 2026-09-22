package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;

public class MergeSortBookPrices {
    public static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = prices[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = prices[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            merge(prices, left, mid, right);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = input.nextInt();

        double[] prices = new double[n];
        System.out.println("Enter prices of books:");
        for (int i = 0; i < n; i++) {
            System.out.print("Book " + (i + 1) + " Price: ");
            prices[i] = input.nextDouble();
        }

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("\nSorted Book Prices (Ascending Order):");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        input.close();
    }
}
