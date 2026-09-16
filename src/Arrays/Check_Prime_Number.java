package Arrays;

public class Check_Prime_Number {
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method 2: Main method
    public static void main(String[] args) {

        int n = 17;

        System.out.println(isPrime(n));
    }
}
