package Reccursion.AdvanceReccursion;

public class Quicksort {
    public static void Quicksort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = Partition(arr, start, end);

        Quicksort(arr, start, pivot - 1);
        Quicksort(arr, pivot + 1, end);
    }

    public static int Partition(int arr[], int start, int end) {

        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,1,2,5,9,10,6};

        Quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
