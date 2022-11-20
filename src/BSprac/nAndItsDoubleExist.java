package BSprac;

import java.util.Arrays;

public class nAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr={10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int start = 0, end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if(arr[mid] == target && mid != i) return true;
                else if (arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            }
        }

        return false;
    }
}
