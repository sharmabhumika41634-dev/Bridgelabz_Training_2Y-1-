package String.PracticeProblem;

public class Leetcode_1678 {
    public static String interpret(String command) {

        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < command.length()) {

            if (command.charAt(i) == 'G') {

                result.append('G');
                i++;

            } else if (command.charAt(i) == '(' &&
                    command.charAt(i + 1) == ')') {

                result.append('o');
                i += 2;

            } else {

                result.append("al");
                i += 4;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String command = "G()(al)";
        String result = interpret(command);

        System.out.println(result);
    }
}