package Arrays.Leed_Code;
import java.util.HashMap;
public class Leetcode_2085 {
    public static int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        // words1 ki frequency
        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        // words2 ki frequency
        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        int count = 0;

        // words1 ke words check karo
        for (String word : map1.keySet()) {

            if (map1.get(word) == 1 &&
                    map2.getOrDefault(word, 0) == 1) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};

        int ans = countWords(words1, words2);

        System.out.println(ans);
    }
}

