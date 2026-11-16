package Assignment;
import java.util.Scanner;
public class WordSearchDREAM {
    static int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static boolean search(char[][] arr, boolean[][] visited,
                                 String word, int row, int col, int index) {

        // Base Case
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and conditions
        if (row < 0 || col < 0 || row >= 4 || col >= 4) {
            return false;
        }

        if (visited[row][col] || arr[row][col] != word.charAt(index)) {
            return false;
        }

        // Make choice
        visited[row][col] = true;

        // Explore all 8 directions
        for (int i = 0; i < 8; i++) {

            int newRow = row + rowDir[i];
            int newCol = col + colDir[i];

            if (search(arr, visited, word, newRow, newCol, index + 1)) {
                return true;
            }
        }

        // Backtracking: Undo choice
        visited[row][col] = false;

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] arr = {
                {'C', 'A', 'T', 'S'},
                {'O', 'R', 'E', 'A'},
                {'D', 'E', 'A', 'M'},
                {'E', 'L', 'L', 'S'}
        };

        boolean[][] visited = new boolean[4][4];

        System.out.println("Enter word:");
        String word = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                if (arr[i][j] == word.charAt(0)) {

                    if (search(arr, visited, word, i, j, 0)) {
                        found = true;
                        break;
                    }
                }
            }

            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Word Found");
        } else {
            System.out.println("Word Not Found");
        }

        sc.close();
    }
}
