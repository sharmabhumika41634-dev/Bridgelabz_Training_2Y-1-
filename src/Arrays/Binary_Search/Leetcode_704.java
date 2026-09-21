package Arrays.Binary_Search;
import java.util.*;
public class Leetcode_704 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int [] nums = new int[n];

        System.out.println("Enter sorted array:");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();

        }
        System.out.print("enter target:");
        int target = sc.nextInt();

        int start = 0, end = n-1;
        int ans =-1;
        while(start<= end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if (nums[mid]<target){
                end = mid -1;
            }

        }
        System.out.println("Answer = "+ ans);

    }
}
