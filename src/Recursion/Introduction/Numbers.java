package Recursion.Introduction;

public class Numbers {
    public static void main(String[] args) {
        //write a function that prints 5 numbers
        print(1);
    }
    public static void  print(int n){
        if (n==5){
            System.out.println(5);
return;        }
        System.out.println(n);
        print(n+1);

    }
}
