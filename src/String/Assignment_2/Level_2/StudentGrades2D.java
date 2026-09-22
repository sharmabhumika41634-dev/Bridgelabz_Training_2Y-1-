package String.Assignment_2.Level_2;
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Column 0: Physics, Column 1: Chemistry, Column 2: Maths
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");
            System.out.print("Physics: ");
            int p = input.nextInt();
            System.out.print("Chemistry: ");
            int c = input.nextInt();
            System.out.print("Maths: ");
            int m = input.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Marks cannot be negative! Re-enter marks.");
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;

            percentage[i] = (p + c + m) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        System.out.println("\n--- Student Results (2D Array) ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " -> Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] +
                    ", Percentage: " + String.format("%.2f", percentage[i]) + "%, Grade: " + grade[i]);
        }

        input.close();
    }
}
