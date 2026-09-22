package String.Assignment_2.Level_2;
import java.util.Scanner;
public class LargestDigitFixed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int tempNum = Math.abs(number);

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (tempNum != 0) {
            int digit = tempNum % 10;
            digits[index] = digit;
            index++;
            tempNum /= 10;

            if (index == maxDigit) {
                break; // Break if digits exceed maxDigit capacity
            }
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        input.close();
    }
}
