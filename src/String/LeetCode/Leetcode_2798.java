package String.LeetCode;

public class Leetcode_2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int count = 0;

        for (int h : hours) {

            if (h >= target)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Leetcode_2798 s = new Leetcode_2798();

        int[] hours = {0, 1, 2, 3, 4};

        System.out.println(s.numberOfEmployeesWhoMetTarget(hours, 2));
    }
}
