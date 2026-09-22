package String.Assignment_2.Level_2;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;
        double[] oldSalary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;

        // Take inputs with validation
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Old Salary: ");
            double sal = input.nextDouble();
            System.out.print("Years of Service: ");
            double yrs = input.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please enter positive values again.\n");
                i--; // Decrement index to re-take input for current employee
                continue;
            }

            oldSalary[i] = sal;
            yearsOfService[i] = yrs;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < totalEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05;
            } else {
                bonus[i] = oldSalary[i] * 0.02;
            }

            newSalary[i] = oldSalary[i] + bonus[i];

            totalOldSalary += oldSalary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Output results
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Employee " + (i + 1) + " -> Old Salary: " + oldSalary[i] +
                    ", Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
