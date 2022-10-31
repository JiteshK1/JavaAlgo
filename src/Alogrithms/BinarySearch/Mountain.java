package Alogrithms.BinarySearch;

public class Mountain {
    public static void main(String[] args) {

    }

    public  static  int peakIndexInMountainArray(int[] arr){
        int start = arr[0];
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1] ){
                //you are in Ascending part
                start = mid + 1;

            }else{
                //you are in decreasing part
                end = mid;
            }
        }
        return start; // or can return end;
    }
}
