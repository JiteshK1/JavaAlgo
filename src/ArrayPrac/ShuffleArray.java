package ArrayPrac;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
int[] arr = {2,5,4,3,1,7};
    int n = 3;
        System.out.println(Arrays.toString(shuffle(arr,n)));

    }
    public static int[] shuffle(int[] arr , int n){
        int[] result = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if (i %2 == 0){
                result[i]=arr[i / 2];
            }else {
                result[i] = arr[n +i / 2];
            }
        }
        return result;
    }
}
