package ArrayPrac;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(running(arr)));

    }
    static int[] running(int[] arr){
        int[] ans = new int[arr.length];
        ans[0] =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            ans[i] = ans[i-1] + arr[i];

        }
        return ans;
    }
}
