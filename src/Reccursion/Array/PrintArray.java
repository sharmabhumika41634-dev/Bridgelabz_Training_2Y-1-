package Reccursion.Array;

public class PrintArray {
    public static void printInc(int arr[],int index){
        if(index== arr.length){
            return;
        }
        System.out.println(arr[index]);
        printInc(arr,index+1);

    }
    public static void printDec(int arr[],int index) {
        if (index == arr.length) {
            return;
        }
        printDec(arr,index+1);
        System.out.println(arr[index]);
    }

    static void main() {
        int arr[] = {1,4,5,23,12,56,34};
        printInc(arr,0);
    }
}
