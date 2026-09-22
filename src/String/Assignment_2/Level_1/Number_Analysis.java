package String.Assignment_2.Level_1;
import java.util.Scanner;
public class Number_Analysis {
    public static void main(String[] args) {
        // Scanner object creation
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Checking positive, negative, zero, even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        // Comparing first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First element (" + first + ") and Last element (" + last + ") are Equal.");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is Greater than Last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is Less than Last element (" + last + ").");
        }

        input.close();
    }
}
