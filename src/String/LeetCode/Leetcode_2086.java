package String.LeetCode;

public class Leetcode_2086 {
    public static int accountBalanceAfterPurchase(int purchaseAmount) {

        int roundedAmount = ((purchaseAmount + 5) / 10) * 10;

        return 100 - roundedAmount;
    }

    public static void main(String[] args) {

        int purchaseAmount = 15;

        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }
}

