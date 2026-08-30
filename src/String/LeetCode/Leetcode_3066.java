package String.LeetCode;
import java.util.PriorityQueue;
public class Leetcode_3066 {
    public int minOperations(int[] nums, int k) {

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int n : nums)
            pq.add((long) n);

        int count = 0;

        while (pq.peek() < k) {

            long x = pq.poll();
            long y = pq.poll();

            pq.add(x * 2 + y);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Leetcode_3066 s = new Leetcode_3066();

        int[] nums = {2, 11, 10, 1, 3};

        System.out.println(s.minOperations(nums, 10));
    }
}
