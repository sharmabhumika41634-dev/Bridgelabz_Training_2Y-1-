package String.Assignment_2.Level_1;
import java.util.Scanner;
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.print("Entered numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal Sum: " + total);

        input.close();
    }
}

