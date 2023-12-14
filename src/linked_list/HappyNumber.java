package linked_list;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(
                happyNumber(1)

        );
    }


    static boolean happyNumber(int n){
        int s=n;
        int f=n;

        do {
            s=findSquare(s);
            f=findSquare(findSquare(f));
        }while (s!=f);
        if (s==1){
            return true;
        }
return false;
    }

    static int findSquare(int n){
        int ans =0;
        while (n > 0){
            int rem= n%10;
            ans+= rem * rem;
            n/=10;
        }
        return  ans;
    }
}
