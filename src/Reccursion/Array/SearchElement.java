package Reccursion.Array;

public class SearchElement {
    public static int Search(int arr[],int index,int target){
        if(index==arr.length){
            return  -1;
        }
        if(arr[index]==target){
            return index;
        }
        return Search(arr, index+1, target);
    }
     static void main() {
        int arr[] = {10,20,30,40,50};
        int target = 40;
        System.out.println(Search(arr,0,40));

    }
}
