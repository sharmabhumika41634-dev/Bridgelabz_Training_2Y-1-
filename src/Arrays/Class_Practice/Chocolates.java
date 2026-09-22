package Arrays.Class_Practice;

public class Chocolates {
    static void main() {
        int money = 15;
        int chocolates = money;
        int wrappers = chocolates;
        while (wrappers >= 3) {
            int newchcolate = wrappers / 3;
            chocolates = chocolates + newchcolate;
            wrappers = (wrappers % 3) + newchcolate;
        }
        System.out.println(chocolates);
    }
}
