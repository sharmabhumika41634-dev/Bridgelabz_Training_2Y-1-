package Arrays;

public class Sum_Of_Digits {
    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int number = 1234;
        System.out.println(sumOfDigits(number));
    }
}
