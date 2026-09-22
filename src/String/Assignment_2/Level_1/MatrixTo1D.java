package String.Assignment_2.Level_1;
import java.util.Scanner;
public class MatrixTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array1D = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array1D[index++] = matrix[i][j];
            }
        }

        System.out.print("1D Array: ");
        for (int i = 0; i < array1D.length; i++) {
            System.out.print(array1D[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
