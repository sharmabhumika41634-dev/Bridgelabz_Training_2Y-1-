package String.Assignment_2.Level_2;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int tempNum = Math.abs(number);

        int count = 0;
        int dummy = tempNum;
        while (dummy != 0) {
            count++;
            dummy /= 10;
        }

        if (count == 0) count = 1; // Handle case for 0

        int[] digits = new int[count];
        dummy = tempNum;
        for (int i = 0; i < count; i++) {
            digits[i] = dummy % 10;
            dummy /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed Number Digits: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
