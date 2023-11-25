package Recursion.Introduction;

public class Numbers {
    public static void main(String[] args) {
        //write a function that prints 5 numbers
        print1(10);
    }

    public static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);

    }

    public static void print1(int n) {

        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        print1(n - 1);
        System.out.print(n + " ");

    }
}
