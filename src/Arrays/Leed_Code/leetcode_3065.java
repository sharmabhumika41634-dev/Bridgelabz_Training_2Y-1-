package Arrays.Leed_Code;

import java.util.Scanner;

public class leetcode_3065 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int [n];
        for(int i=0; i<nums.length;i++){
            nums[i] = sc.nextInt()
;        }
        int k = sc.nextInt();
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]<k){
                count++;
            }
        }
        System.out.println(count);
    }
}
