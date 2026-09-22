package Arrays.Leed_Code;

public class Leetcode_2379 {
    public static int minimumRecolors(String blocks, int k) {

        int white = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < blocks.length(); i++) {

            // Add current block
            if (blocks.charAt(i) == 'W') {
                white++;
            }

            // Window size k
            if (i >= k) {
                if (blocks.charAt(i - k) == 'W') {
                    white--;
                }
            }

            // Check window
            if (i >= k - 1) {
                min = Math.min(min, white);
            }
        }

        return min;
    }

    public static void main(String[] args) {

        String blocks = "WBBWWBBWBW";
        int k = 7;

        System.out.println(minimumRecolors(blocks, k));
    }
}
