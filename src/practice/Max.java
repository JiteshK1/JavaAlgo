package practice;

public class Max {
    public static void main(String[] args) {
        System.out.println(
                maxSum(7)
        );
    }
    public static int maxSum(int n)
    {
        if(n == 0 )return 0;

        int a = n/2;
        int b = n/3;
        int c = n/4;
        int sum = a+ b +c;

        return Math.max(n, Math.max(sum, maxSum(a) + maxSum(b) + maxSum(c)));
    }
}
