package String.Assignment_2.Level_1;
import java.util.Scanner;
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int[] multiplicationResult = new int[4];

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}
