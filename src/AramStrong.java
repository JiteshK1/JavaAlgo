public class AramStrong {
    public static void main(String[] args) {
        System.out.println(armStrong(153));
    }

    static int digit(int n){
        return (int)Math.log10(n)+1;
    }

    static  boolean armStrong(int n){

        int ans=0;
        int d=digit(n);
          int temp=n;
        while (temp>0){
          int rem= temp%10;
          ans+=Math.pow(rem,d);
          temp=temp/10;
        }
        return ans==n;
    }
}
