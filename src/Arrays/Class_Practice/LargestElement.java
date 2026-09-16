package Arrays.Class_Practice;

public class LargestElement {
    public static int maxValue(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minValue(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int SecondMax(int arr[]) {
        int Second = maxValue(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Second) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int Secondmax = maxValue(arr);
        return Secondmax;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("This is the maximum element in an array: " + maxValue(arr));
        System.out.println("This is the minimum element in an array: " + minValue(arr));
        System.out.println("This is the second maximum element in an array: " + SecondMax(arr));
    }
}



