package String.LeetCode;

public class Leetcode_278 {
    public int firstBadVersion(int n, int bad) {

        for (int i = 1; i <= n; i++) {
            if (i >= bad)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        Leetcode_278 s = new Leetcode_278();

        int n = 5;
        int bad = 4;

        System.out.println(s.firstBadVersion(n, bad));
    }
}