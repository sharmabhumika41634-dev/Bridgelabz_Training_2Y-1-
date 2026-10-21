package Reccursion.Array;

public class MaximumElement {
    public static int max(int arr[],int index){
        if(index== arr.length-1){
            return  arr[index];
        }
        int small = max(arr,index+1);
        return Math.max(small,arr[index]);
    }
    static void main() {
        int arr[] = {10, 25, 7, 40, 15};
        System.out.println("Maximum element: " + max(arr, 0));

    }
}
