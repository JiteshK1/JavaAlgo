package bitwise;

import java.util.Arrays;

public class RepeatedFind {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 4, 4, 4,3,3,3};
        System.out.println(find(arr));
    }

    static int find(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum % 3;
    }
}
