package Alogrithms.BubbleSorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public  static void  sort(int[] arr){
        boolean swapped;
        int n = arr.length-1;
        for (int i = 0; i <=n; i++) {
            swapped=false;
            for (int j = 1; j <=n-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) break;
        }
    }
}
