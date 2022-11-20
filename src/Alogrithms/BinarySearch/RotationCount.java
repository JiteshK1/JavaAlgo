package Alogrithms.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
   int[] arr = { 7,1,2,3,4,5};
        System.out.println(rotation(arr));
    }
    public static  int rotation(int[] arr){
      int pivot = findPivot(arr);
      return pivot + 1;
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
    //for duplicates
    public static int findPivotInDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[start]==arr[mid] && arr[mid] == arr[end]){
                if (arr[start] > arr[start + 1]){
                    return start;

                }
                start++;

                if (arr[end]< arr[end -1]){
                    return end -1;
                }
                end --;
            }
            if (arr[start]< arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end] )){
                start=mid+1;
            }else {
                end = mid -1;
            }


        }
        return -1;

    }
}
