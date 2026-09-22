package Arrays.Class_Practice;

public class Swap_Array {
    public  static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr [a] = arr [b];
        arr [b] = temp;
        display(arr);
    }
    public static void display (int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }

    static void main() {
        int arr[] = {1,2,3,4,5,6};
        display(arr);
        System.out.println("\nAfter swap :");
        swap(arr,1,5);
    }

}
