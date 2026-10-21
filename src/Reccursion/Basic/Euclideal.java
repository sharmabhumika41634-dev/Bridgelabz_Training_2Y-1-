package Reccursion.Basic;

public class Euclideal {
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        int small=gcd(y,x%y);
        return small;

    }

    public static int lcm(int x, int y) {
        return(x / gcd(x,y)) *y;

    }

    static void main() {
        System.out.println(gcd(12,16));
        System.out.println(lcm(12,16));

    }
}
