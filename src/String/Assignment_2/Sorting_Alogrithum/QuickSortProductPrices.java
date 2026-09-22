package String.Assignment_2.Sorting_Alogrithum;
import java.util.Scanner;
public class QuickSortProductPrices {
    public static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);

            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = input.nextInt();

        double[] prices = new double[n];
        System.out.println("Enter prices of products:");
        for (int i = 0; i < n; i++) {
            System.out.print("Product " + (i + 1) + " Price: ");
            prices[i] = input.nextDouble();
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\nSorted Product Prices (Ascending Order):");
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        input.close();
    }
}
