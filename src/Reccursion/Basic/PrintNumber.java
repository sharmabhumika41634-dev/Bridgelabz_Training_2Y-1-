package Reccursion.Basic;

public class PrintNumber {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;

        }
        System.out.println(n+ " ");
        printDec(n-1);

    }
    public static void printInc(int n){
        if(n==-1){
            System.out.println(n+" ");
            return;
        }
        printInc(n-1);
        System.out.println(n+ " ");
    }

    static void main() {
        printDec(10);
        printInc(5);

    }
}
