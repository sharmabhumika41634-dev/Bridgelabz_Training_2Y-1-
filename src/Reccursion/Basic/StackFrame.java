package Reccursion.Basic;

public class StackFrame {
    static void method1() {
        int x = 1;
        method2();
        System.out.println(x);

    }

    static void method2() {
        int x= 2;
        method3();
        System.out.println(x);
    }

    static void method3() {
        int x = 3;
        System.out.println(x);

    }
    static void main() {
        method1();

    }


}
