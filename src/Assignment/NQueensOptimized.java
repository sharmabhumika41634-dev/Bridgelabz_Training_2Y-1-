package Assignment;
import java.util.Scanner;
public class NQueensOptimized {
    static int n;
    static int[] board;
    static boolean[] column;
    static boolean[] diagonal1;
    static boolean[] diagonal2;

    public static boolean solve(int row) {

        // Base Case
        if (row == n) {
            return true;
        }

        // Try every column
        for (int col = 0; col < n; col++) {

            int d1 = row - col + n - 1;
            int d2 = row + col;

            // Check whether position is safe
            if (!column[col] && !diagonal1[d1] && !diagonal2[d2]) {

                // Make choice
                board[row] = col;

                column[col] = true;
                diagonal1[d1] = true;
                diagonal2[d2] = true;

                // Recursive call
                if (solve(row + 1)) {
                    return true;
                }

                // Backtracking
                column[col] = false;
                diagonal1[d1] = false;
                diagonal2[d2] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        n = sc.nextInt();

        board = new int[n];

        column = new boolean[n];
        diagonal1 = new boolean[2 * n - 1];
        diagonal2 = new boolean[2 * n - 1];

        if (solve(0)) {

            System.out.println("Solution Found:");

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {

                    if (board[i] == j) {
                        System.out.print("Q ");
                    } else {
                        System.out.print(". ");
                    }
                }

                System.out.println();
            }

        } else {
            System.out.println("No Solution Found");
        }

        sc.close();
    }
}
