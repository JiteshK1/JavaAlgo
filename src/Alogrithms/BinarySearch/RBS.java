package Alogrithms.BinarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 3;
        System.out.println(ans(arr,target));

    }
    private static int ans(int[] arr,int target){
        int pivot = findPivot(arr);
        if (pivot ==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if (arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end=arr.length -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            // 1st case
            if (mid < end && arr[mid]> arr[mid+1]){
                return mid;
            }
            //2nd case
            if (mid > start && arr[mid] < arr[mid -1]){
                return mid -1;
            }
            // 3rd case
            if (arr[start]>= arr[mid]){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }
}
