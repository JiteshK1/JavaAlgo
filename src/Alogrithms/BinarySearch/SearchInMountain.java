package Alogrithms.BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {

    }

    public static int ans(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != 1) {
            return firstTry;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = arr[0];
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                //you are in Ascending part
                start = mid + 1;

            } else {
                //you are in decreasing part
                end = mid;
            }
        }
        return start; // or can return end;
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {


        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) return m;
            if (isAsc) {
                if (target < arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (target > arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}
