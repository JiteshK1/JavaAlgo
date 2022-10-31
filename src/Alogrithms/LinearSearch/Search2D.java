package Alogrithms.LinearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,4,6},
                {55,33,22},
                {9,66,2,64,23}
        };
        int target = 22;
        System.out.println(Arrays.toString( search(arr,target)) );
    }

    private static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                       if (arr[row][col]== target) return new int[]{row,col};
            }

        }
        return new int[]{-1,-1};
    }
}
