package Recursion.Introduction;

public class ReverseNo {

    static  int sum=0;

    static  void rev(int n){
        if (n==0){
            return;
        }
        sum=sum*10 + n%10;
       rev(n/10);
    }

    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {
    if (n/10==n){
        return n;
    }
    int rem=n%10;
    return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    static int reverse(int n){
        int reverse=0;

        while (n>0){
            reverse=reverse* 10+ n%10;
            n/=10;
        }
return reverse;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1023));
        rev(123);
        System.out.println(sum);
        System.out.println(rev2(12345));
    }

    static boolean palin(int n){
        return n==reverse(n);
    }

}
