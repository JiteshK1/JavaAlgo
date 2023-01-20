package Alogrithms.cyclicSort;

import java.util.Arrays;

public class MisMatch {
    public static void main(String[] args) {
int[] arr={2,1,4,2,6,5};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
    private static void swap(int[] arr, int fIndex, int lIndex) {
        int temp = arr[fIndex];
        arr[fIndex]=arr[lIndex];
        arr[lIndex]=temp;
    }
}
