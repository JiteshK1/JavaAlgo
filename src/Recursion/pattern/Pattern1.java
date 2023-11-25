package Recursion.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        pat2(4,0);
        pat(4);

    }


    static void pat(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat2(int r,int c){
        if (r==0)return;

        if (c<r){
            System.out.print("* ");
            pat2(r,c+1);
        }else {
            System.out.println();
            pat2(r-1,0);
        }
    }
}
