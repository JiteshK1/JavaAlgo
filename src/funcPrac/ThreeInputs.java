package funcPrac;

import java.util.Scanner;

public class ThreeInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the three number: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        maxMin(a,b,c);

    }

    static void maxMin(int a ,int b ,int c){
        int[] arr={a,b,c};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int num:
           arr  ) {
            if (num> max){
                max=num;
            }
            if (num <min){
                min=num;
            }
        }
        System.out.println("Maximum number is "+max+" Min is "+min);
    }
}
