package String.Assignment_2.Level_2;
import java.util.Scanner;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // Column 0: Weight, Column 1: Height, Column 2: BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            double w = input.nextDouble();
            System.out.print("Enter height (meters): ");
            double h = input.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input! Please enter positive values.");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h); // BMI

            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Results (2D Array) ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " -> Weight: " + personData[i][0] +
                    "kg, Height: " + personData[i][1] + "m, BMI: " +
                    String.format("%.2f", personData[i][2]) + ", Status: " + weightStatus[i]);
        }

        input.close();
    }
}
