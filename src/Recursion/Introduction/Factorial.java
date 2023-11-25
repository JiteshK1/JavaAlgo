package Recursion.Introduction;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(sumDigit(123));

    }

    static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }

    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }

    static int sumDigit(int n) {
        if (n == 0) return 0;
        return sumDigit(n / 10) + n % 10;
    }
}
