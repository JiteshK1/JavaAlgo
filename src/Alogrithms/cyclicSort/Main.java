package Alogrithms.cyclicSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int fIndex, int lIndex) {
               int temp = arr[fIndex];
               arr[fIndex]=arr[lIndex];
               arr[lIndex]=temp;
    }
}
