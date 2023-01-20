public class Rc {
    public static void main(String[] args) {
    pattern31(5);
    }
    public static void pattern1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern28(int n){
        for (int row = 1; row <=2*n ; row++) {
            int totalColInRow= row>n?(2*n-row):row;
            int noOfSpaces=n-totalColInRow;
            for (int space = 1; space <=noOfSpaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
public static void pattern5(int n ){
    for (int row = 1; row <2*n ; row++) {
        int totalColInRow=row>n?(2*n-row):row;
        for (int col = 1; col <=totalColInRow ; col++) {
            System.out.print("* " );
        }
        System.out.println();
    }
}
    public static void pattern2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n){
        for (int row = 1; row <=n; row++) {
            int noOfSpace=n-row;
            for (int space = 1; space <=noOfSpace ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for (int row = 1; row <=n ; row++) {
           int noOfSpace=n-row;
            for (int s = 1; s <=noOfSpace ; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 1; spaces <= row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <2*(n-row+1) ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for (int row = 1; row <=2*n ; row++) {
            int totalColPerRow=row>n? row - n :(n-row+1);
            int noOfSpace=n-totalColPerRow;
            for (int spaces = 1; spaces <= noOfSpace; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=totalColPerRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern30(int n){
        for (int row = 1; row <=5 ; row++) {
            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for (int row = 1; row <2*n ; row++) {
         int totalNoOfCols=row>n?(2*n-row):row;
            for (int s = 1; s <=n-totalNoOfCols ; s++) {
                System.out.print(" ");
            }
            for (int col = totalNoOfCols; col >=1 ; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <=totalNoOfCols ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public static void pattern31(int n){
        int OriginalN=n;
        n=2*n;

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                int EntryOfNo= OriginalN-Math.min(Math.min(row,col),Math.min(n-row, n-col));
                System.out.print(EntryOfNo+" ");

            }
            System.out.println();
        }
    }
}
