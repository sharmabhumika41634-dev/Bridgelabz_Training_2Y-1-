package Arrays.Class_Practice;

import java.util.*;

public class Leetcode_905 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i =0; i<n; i++){
            nums[i]= sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        while(left<right){
            if(nums[left]%2==0){
                left++;

            }else if(nums[right]%2==0){
                right++;
            }else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                left--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
