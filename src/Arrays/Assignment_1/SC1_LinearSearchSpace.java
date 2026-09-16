package Arrays.Assignment_1;
import java.util.Scanner;
public class SC1_LinearSearchSpace {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                index = i;
                break;
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
Space Complexity:

Only a few variables are used.

Auxiliary Space = O(1)

The input array is not counted as extra space.
*/