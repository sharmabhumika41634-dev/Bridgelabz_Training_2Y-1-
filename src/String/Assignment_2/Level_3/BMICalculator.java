package String.Assignment_2.Level_3;
import java.util.Scanner;
public class BMICalculator {
    public static String[] calculateBmiAndStatus(double weight, double heightCm) {
        double heightMeter = heightCm / 100.0;
        double bmi = weight / (heightMeter * heightMeter);
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to process 2D array of weight & height and generate 2D result table
    public static String[][] processTeamBmi(double[][] personData) {
        String[][] result = new String[personData.length][4];

        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            String[] bmiAndStatus = calculateBmiAndStatus(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiAndStatus[0];
            result[i][3] = bmiAndStatus[1];
        }

        return result;
    }

    // Method to display tabular output
    public static void displayResult(String[][] result) {
        System.out.println("\n---------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-10s %-12s\n", "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10d %-12s %-12s %-10s %-12s\n",
                    (i + 1), result[i][0], result[i][1], result[i][2], result[i][3]);
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] personData = new double[10][2];

        System.out.println("Enter Weight (kg) and Height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("  Weight (kg): ");
            personData[i][0] = input.nextDouble();
            System.out.print("  Height (cm): ");
            personData[i][1] = input.nextDouble();
        }

        String[][] resultTable = processTeamBmi(personData);
        displayResult(resultTable);

        input.close();
    }
}
