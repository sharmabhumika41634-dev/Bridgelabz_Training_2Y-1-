package Reccursion.Basic;

public class LearnigMethod {
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static int mul(int a , int b){
        return a*b;

    }
    static void main() {
        int result = mul(10,20);
        System.out.println(result);
        System.out.println(mul(10,30));
        add(10,20);

    }
}





