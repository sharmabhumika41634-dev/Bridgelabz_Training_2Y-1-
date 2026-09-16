package Arrays.Class_Practice;

public class Reverse_Array {
    public static void display(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");

        }
    }

    public static void swap(int arr[]) {
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            a--;
        }
        display(arr);

    }

}