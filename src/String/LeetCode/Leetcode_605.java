package String.LeetCode;

public class Leetcode_605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Example
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        boolean answer = canPlaceFlowers(flowerbed, n);

        System.out.println(answer);
    }
}
