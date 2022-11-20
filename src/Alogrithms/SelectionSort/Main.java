package Alogrithms.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-32, 1, -55, 2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMax(arr, 0, last);
            swap(arr, max, last);
        }
    }

    private static void swap(int[] arr, int fIndex, int LIndex) {
        int temp = arr[fIndex];
        arr[fIndex] = arr[LIndex];
        arr[LIndex] = temp;
    }

    private static int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
