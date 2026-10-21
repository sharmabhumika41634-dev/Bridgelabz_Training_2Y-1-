package Reccursion.Basic;

public class PowerOf_n {
    public static int power(int p, int q) {
        if (q == 0) {
            return 1;
        }
            return p * power(p, q - 1);
        }

    static void main() {
        int p = 5;
        int q = 4;
        System.out.println(power(p,q));
    }




    }

