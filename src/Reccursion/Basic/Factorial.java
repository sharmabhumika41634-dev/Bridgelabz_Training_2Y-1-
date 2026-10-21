package Reccursion.Basic;

public class Factorial {
    public static int fact (int n){
        if(n==0){
            return 1;
        }
        int small = fact(n-1);
        return n*small;
    }

    static void main() {
        int result = fact(5);
        System.out.println(result);
        System.out.println(fact(4));
    }
}
