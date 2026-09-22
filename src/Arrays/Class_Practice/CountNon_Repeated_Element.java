package Arrays.Class_Practice;
import java.util.Scanner;
public class CountNon_Repeated_Element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] freq = new int[10001];
        int count = 0;

        for (int x : arr) {
            if (freq[x] == 0)
                count++;

            freq[x]++;
        }

        System.out.println("Distinct Elements: " + count);

        sc.close();
    }
}
