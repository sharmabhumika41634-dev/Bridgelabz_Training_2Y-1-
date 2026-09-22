package String.Assignment_2.Level_2;

import java.util.Scanner;
public class DigitFrequency {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();
        long tempNum = Math.abs(number);

        // Count digits
        int count = 0;
        long dummy = tempNum;
        while (dummy != 0) {
            count++;
            dummy /= 10;
        }

        if (count == 0) count = 1;

        // Store digits
        int[] digits = new int[count];
        dummy = tempNum;
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(dummy % 10);
            dummy /= 10;
        }

        // Calculate frequency
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display results
        System.out.println("\n--- Digit Frequency ---");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " -> Frequency: " + frequency[i]);
            }
        }

        input.close();
    }
    }
