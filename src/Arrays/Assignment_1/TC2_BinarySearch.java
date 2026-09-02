package Arrays.Assignment_1;
import java.util.Scanner;
public class TC2_BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }

        sc.close();
    }
}
/*
Search Range for target 4:

{0, 2, 3, 4, 8, 61}

First mid = 3
Then search in the required half.

Time Complexity:

Worst Case = O(log N)
Because the array is divided into half each time.

Space Complexity = O(1)
*/