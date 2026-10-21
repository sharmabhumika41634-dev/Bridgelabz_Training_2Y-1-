package Reccursion.Basic;

import java.util.Scanner;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in tearms:");
        int n = sc.nextInt();
        for(int i =0; i< n;  i++){
            System.out.println(fibo(i)+ " ");
        }
    }
}
