package ArrayPrac;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {4,3,2};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits){
        int n = digits.length;
        for (int i = n-1; i >=0; i--) {
         if (digits[i] < 9){
             digits[i]++;
             return digits;
         }
         digits[i]= 0;
        }
        int[] arr2= new int[n+1];
        arr2[0]=1;
        return arr2;
    }
}
