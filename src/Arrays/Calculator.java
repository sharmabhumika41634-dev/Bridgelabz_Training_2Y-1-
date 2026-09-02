package Arrays;

public class Calculator {
    public static int calculate(int a, int b, char op) {

        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return a / b;
        } else {
            return 0;
        }
    }

    // Method 2: Main Method
    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        char op = '+';

        System.out.println(calculate(a, b, op));
    }
}
