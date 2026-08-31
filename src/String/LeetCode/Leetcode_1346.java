package String.LeetCode;

public class Leetcode_1346 {
    public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Leetcode_1346 obj = new Leetcode_1346();


        int[] arr = {10, 2, 5, 3};

        boolean result = obj.checkIfExist(arr);

        System.out.println(result);
    }
}
