package Arrays;

public class Fanonacci {
    public static void fibonacci(int number) {

        int first = 0, second = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        int number = 10;
        fibonacci(number);
    }
}
