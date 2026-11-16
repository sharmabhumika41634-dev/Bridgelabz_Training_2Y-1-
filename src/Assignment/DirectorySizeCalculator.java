package Assignment;
import java.io.File;
import java.util.Scanner;
import java.util.HashSet;
public class DirectorySizeCalculator {
    public static long calculateSize(File file, HashSet<String> visited) {

        if (!file.exists()) {
            return 0;
        }

        try {
            String path = file.getCanonicalPath();

            // Avoid visiting the same directory again
            if (visited.contains(path)) {
                return 0;
            }

            visited.add(path);

            // Base Case: File found
            if (file.isFile()) {
                return file.length();
            }

            // Recursive Case: Directory found
            long totalSize = 0;

            File[] files = file.listFiles();

            if (files != null) {
                for (File f : files) {
                    totalSize += calculateSize(f, visited);
                }
            }

            return totalSize;

        } catch (Exception e) {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter directory path:");
        String path = sc.nextLine();

        File directory = new File(path);

        HashSet<String> visited = new HashSet<>();

        long totalSize = calculateSize(directory, visited);

        System.out.println("Total Size: " + totalSize + " Bytes");
        System.out.println("Total Size: " + (totalSize / 1024.0) + " KB");

        sc.close();
    }
}
