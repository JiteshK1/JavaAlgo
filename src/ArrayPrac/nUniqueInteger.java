package ArrayPrac;

import java.util.Arrays;

public class nUniqueInteger {
    public static void main(String[] args) {
int n = 4;

        System.out.println(Arrays.toString(sumZero2(n)));
    }
    public static int[] sumZero(int n){
          int[] ans = new int[n];
        if (n % 2 == 0){
            for (int i = 1; i < n; i=i+2) {
               ans[i-1]=i;
               ans[i]= -i;
            }
        }else {
            for (int i = 0; i < n-1; i=i+2) {
                ans[i]= i+1;
                ans[i+1]= -(i+1);
            }
            ans[n-1]=0;
        }
return ans;
    }
    //optimise solution

    public static int[] sumZero2(int n) {
    int[] ans = new int[n];
    int start= 0;
    int end = n -1;
    while (start < end){
        ans[start]= start+1;
        ans[end]= ans[start]* -1;
        start++;
        end--;
    }
    return ans;
    }
    }
