package String.LeetCode;
import java.util.*;
public class Leetcode_347 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        pq.addAll(map.keySet());

        int[] ans = new int[k];

        for (int i = 0; i < k; i++)
            ans[i] = pq.poll();

        return ans;
    }

    public static void main(String[] args) {

        Leetcode_347 s = new Leetcode_347();

        int[] nums = {1, 1, 1, 2, 2, 3};

        System.out.println(Arrays.toString(s.topKFrequent(nums, 2)));
    }
}
