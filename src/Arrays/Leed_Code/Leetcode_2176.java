package Arrays.Leed_Code;
import java.util.Scanner;
public class Leetcode_2176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        int count =0;
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                if (arr[i] == arr[j] && (i*j)%k==0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
   }