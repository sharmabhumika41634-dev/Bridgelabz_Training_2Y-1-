package String.LeetCode;

public class Leetcode_682 {
    public static int calPoints(String[] operations) {

        int[] scores = new int[operations.length];
        int size = 0;

        for (String op : operations) {

            if (op.equals("C")) {
                size--;
            }
            else if (op.equals("D")) {
                scores[size] = 2 * scores[size - 1];
                size++;
            }
            else if (op.equals("+")) {
                scores[size] = scores[size - 1] + scores[size - 2];
                size++;
            }
            else {
                scores[size] = Integer.parseInt(op);
                size++;
            }
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = sum + scores[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        String[] operations = {"5", "2", "C", "D", "+"};

        int answer = calPoints(operations);

        System.out.println(answer);
    }
}
