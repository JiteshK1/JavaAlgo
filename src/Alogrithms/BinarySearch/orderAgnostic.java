package Alogrithms.BinarySearch;

public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr = {100, 40, 12, 10, 6, 2};
        int target = 2;
        System.out.println(binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) return m;
            if (isAsc) {
                if (target < arr[m]) {
                    e = m - 1;
                } else{
                    s = m + 1;
                }
            }else{
                if (target > arr[m]) {
                    e = m - 1;
                } else{
                    s = m + 1;
                }
            }
        }
        return -1;
    }

}
